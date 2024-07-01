package com.nagasystems.productcatelogservice.dtos;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.nagasystems.productcatelogservice.models.Category;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductDto {
    private String name;
    private String description;
    private Double price;
    private CategoryDto category;
//    private Boolean isPrimeSpecific;
}
