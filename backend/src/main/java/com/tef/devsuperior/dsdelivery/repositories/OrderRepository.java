package com.tef.devsuperior.dsdelivery.repositories;


import com.tef.devsuperior.dsdelivery.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {


    @Transactional(readOnly = true)
    @Query("SELECT DISTINCT obj FROM tb_order obj JOIN FETCH obj.products"
            +" WHERE obj.status = 0 ORDER BY obj.moment ASC")
    List<Order> findOrdersWithProducts();
}
