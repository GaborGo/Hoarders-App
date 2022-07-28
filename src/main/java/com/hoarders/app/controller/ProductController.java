package com.hoarders.app.controller;

import com.hoarders.app.model.dto.ProductDto;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("products")
public class ProductController {

    @PostMapping
    public String addProduct(@RequestBody ProductDto product) {
        //TODO: take the user from the auth token and add the product to that user.
        return "TO BE IMPLEMENTED";
    }
}
