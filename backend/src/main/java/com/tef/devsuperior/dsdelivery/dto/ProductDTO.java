package com.tef.devsuperior.dsdelivery.dto;

import com.tef.devsuperior.dsdelivery.entity.Product;

import java.io.Serializable;

public class ProductDTO implements Serializable {

    private Long id;
    private String name;
    private Double price;
    private String Description;
    private String ImageUri;

    public ProductDTO() {
    }

    public ProductDTO(Long id, String name, Double price, String description, String imageUri) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.Description = description;
        this.ImageUri = imageUri;
    }

    public ProductDTO(Product product) {
        id = product.getId();
        name = product.getName();
        price = product.getPrice();
        Description = product.getDescription();
        ImageUri = product.getImageUri();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public String getDescription() {
        return Description;
    }

    public void setDescription(String description) {
        Description = description;
    }

    public String getImageUri() {
        return ImageUri;
    }

    public void setImageUri(String imageUri) {
        ImageUri = imageUri;
    }
}
