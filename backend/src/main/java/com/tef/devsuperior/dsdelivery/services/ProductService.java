package com.tef.devsuperior.dsdelivery.services;

import com.tef.devsuperior.dsdelivery.dto.ProductDTO;
import com.tef.devsuperior.dsdelivery.entity.Product;
import com.tef.devsuperior.dsdelivery.repositories.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.stream.Collectors;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;


    public List<ProductDTO> findAll()
    {
        List<Product> list = productRepository.findAllByOrderByNameAsc();
        return list.stream().map(x -> new ProductDTO(x)).collect(Collectors.toList());
    }
}
