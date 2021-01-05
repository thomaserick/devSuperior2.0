package com.tef.devsuperior.dsdelivery.repositories;

import com.tef.devsuperior.dsdelivery.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductRepository extends JpaRepository<Product,Long> {

}
