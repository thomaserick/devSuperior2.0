package com.tef.devsuperior.dsdelivery.repositories;

import com.tef.devsuperior.dsdelivery.entity.Product;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
public interface ProductRepository extends JpaRepository<Product, Long> {


    @Transactional(readOnly = true)
    List<Product> findAllByOrderByNameAsc();


}
