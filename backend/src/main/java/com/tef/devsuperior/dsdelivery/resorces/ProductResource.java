package com.tef.devsuperior.dsdelivery.resorces;

import com.tef.devsuperior.dsdelivery.dto.ProductDTO;
import com.tef.devsuperior.dsdelivery.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/products")
public class ProductResource {


    @Autowired
    private ProductService productService;

    @GetMapping
    public ResponseEntity<List<ProductDTO>> findAll()
    {
        return ResponseEntity.ok().body(productService.findAll());
    }

}
