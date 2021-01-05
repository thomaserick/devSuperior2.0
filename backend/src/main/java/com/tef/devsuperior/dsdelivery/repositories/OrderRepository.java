package com.tef.devsuperior.dsdelivery.repositories;

import com.tef.devsuperior.dsdelivery.entity.Order;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {
}
