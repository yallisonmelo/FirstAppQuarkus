package br.com.yfsmsystem.entity;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class Product {

    private Integer code;
    private String description;
}
