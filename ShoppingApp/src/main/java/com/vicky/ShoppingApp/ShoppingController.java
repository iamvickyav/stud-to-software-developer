package com.vicky.ShoppingApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class ShoppingController {

    @Autowired
    ShoppingService shoppingService;

    // http://localhost:8080/shopping
    @RequestMapping("/shopping")
    public String getTrendingProducts() {
        String message = "Thank you for shopping";
        return message;
    }

    // http://localhost:8080/trending
    @RequestMapping("/trending")
    public String getFastMovingProducts() {
        String message = "Thank you ! Please come back next time";
        return message;
    }

    @CrossOrigin
    @RequestMapping("/products")
    public List<Product> getProducts() {
        Product product1 = new Product();
        product1.setImage("img1.png");
        product1.setName("HAVELLS 6A Four-Way Extension Board");
        product1.setRating("4.4");
        product1.setReviews("1,235");

        Product product2 = new Product();
        product2.setImage("img2.png");
        product2.setName("Syska Four-Way Extension Board");
        product2.setRating("4.3");
        product2.setReviews("11,344");

        List<Product> products = new ArrayList<>();
        products.add(product1);
        products.add(product2);

        return products;
    }

    @CrossOrigin
    @RequestMapping("/productsfromDB")
    public List<Product> getProductsFromDB() {
        List<Product> products = shoppingService.getProductFromDatabase();
        return products;
    }
}