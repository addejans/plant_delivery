create table if not exists candy (
   id bigint not null,
   name nvarchar(255),
   price decimal(12,4),
   primary key (id)
);

create table if not exists candy_delivery (
   candy_id bigint not null,
   delivery_id bigint not null
);


--Note: You may wish to add some foreign key constraints to your candy_delivery table.
--      This could cause some conflicts with the default hibernate ddl-auto behavior if hibernate attempts to delete
--      the delivery table after adding the foreign key relationship, but if you were defining all your tables in sql
--      it would definitely be something to keep in mind. This example will only allow you to add rows to candy_delivery
--      if the candy and delivery referenced exists, and deleting the delivery will automatically remove the
--      corresponding row from candy_delivery.
--
--create table if not exists candy_delivery (
--   candy_id bigint not null,
--   delivery_id bigint not null,
--   foreign key (candy_id) references candy(id),
--   foreign key (delivery_id) references delivery(id) on delete cascade
--);
