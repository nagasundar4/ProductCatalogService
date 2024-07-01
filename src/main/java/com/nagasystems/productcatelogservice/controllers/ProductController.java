package com.nagasystems.productcatelogservice.controllers;

import com.nagasystems.productcatelogservice.dtos.ProductDto;
import com.nagasystems.productcatelogservice.models.Product;
import com.nagasystems.productcatelogservice.services.IProductService;
import com.nagasystems.productcatelogservice.services.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {
    @Autowired
    public IProductService productService;

    @GetMapping("/{id}")
    public ProductDto getProduct(@PathVariable("id") Long productId) {
        Product product = productService.getProductById(productId);
        return from(product) ;
    }
    private ProductDto from(Product product) {
        ProductDto productDto = new ProductDto();
        productDto.setId(product.getId());
        productDto.setName(product.getName());
        productDto.setDescription(product.getDescription());
        productDto.setPrice(product.getPrice());
        if(productDto.getCategory() != null) {

        }
    }
    @PostMapping("")
    public ProductDto createProduct(@RequestBody ProductDto productDto) {
        return productDto;
    }

    @PutMapping("/{id}")
    public ProductDto replaceProduct(@PathVariable Long id, @RequestBody ProductDto productDto) {
        return productDto;
    }

    @GetMapping()
    public List<ProductDto> getProducts() {
        return new ArrayList<ProductDto>();
    }
}
