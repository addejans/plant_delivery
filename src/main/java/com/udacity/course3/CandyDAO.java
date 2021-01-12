package com.udacity.course3;

import java.util.List;

public interface CandyDAO {
    List<CandyData> list();
    void addToDelivery(Long candyId, Long deliveryId);
    List<CandyData> findByDelivery(Long deliveryId);
}
