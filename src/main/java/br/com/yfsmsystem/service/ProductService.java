package br.com.yfsmsystem.service;

import br.com.yfsmsystem.entity.Product;

import javax.enterprise.context.ApplicationScoped;

@ApplicationScoped
public class ProductService {


    public Product getProduct(){
        return Product.builder()
                .code(1)
                .description("potato")
                .build();
    }
}
