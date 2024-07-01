package com.nagasystems.productcatelogservice.models;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Product extends BaseModel {

    public String name;
    private String description;
    private Double price;
    private Category category;
    private String imageUrl;

//    private Boolean isPrimeSpecific;
}
