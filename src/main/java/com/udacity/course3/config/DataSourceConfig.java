package com.udacity.course3.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

import javax.sql.DataSource;

@Configuration
public class DataSourceConfig {

    @Bean
    @Primary
    @ConfigurationProperties(prefix="com.udacity.datasource")
    public DataSource getDataSource() {
        DataSourceBuilder dsb = DataSourceBuilder.create();
        // the username and password is set through: @ConfigurationProperties(prefix="com.udacity.datasource")
//        dsb.username("sa");
//        dsb.password(securePasswordService());
        dsb.url("jdbc:mysql://localhost:3306/plant");
        return dsb.build();
    }

    private String securePasswordService() {
        return "sa_PW1234";
    }

}
