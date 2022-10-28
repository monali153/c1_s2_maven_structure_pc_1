package org.example.config;

import org.example.domain.Product;
import org.springframework.context.annotation.Bean;

public class ProductConfig {

    @Bean("product")
    public Product getProduct(){
        return new Product(212,"TV",1,5);
    }

    @Bean("product1")
    public Product getProduct1(){
        return new Product(241,"AC",1,4);
    }

    @Bean("product2")
    public Product getProduct2(){
        return new Product(123,"Mobile",2,4);
    }
}
