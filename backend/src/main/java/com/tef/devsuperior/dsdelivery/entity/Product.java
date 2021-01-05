package com.tef.devsuperior.dsdelivery.entity;

import java.io.Serializable;
import java.util.Objects;


public class Product implements Serializable {

    private Long id;
    private String name;
    private Double price;
    private String Descripiton;
    private String ImageUri;


    public Product() {
    }

    public Product(Long id, String name, Double price, String descripiton, String imageUri) {
        this.id = id;
        this.name = name;
        this.price = price;
        Descripiton = descripiton;
        ImageUri = imageUri;
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

    public String getDescripiton() {
        return Descripiton;
    }

    public void setDescripiton(String descripiton) {
        Descripiton = descripiton;
    }

    public String getImageUri() {
        return ImageUri;
    }

    public void setImageUri(String imageUri) {
        ImageUri = imageUri;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Product)) return false;
        Product product = (Product) o;
        return id.equals(product.id);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }
}
