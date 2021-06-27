package com.vicky.ShoppingApp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ShoppingService {

    @Autowired
    JdbcTemplate jdbcTemplate;

    List<Product> getProductFromDatabase() {
        String QUERY = "SELECT * FROM product";

        List<Product> productList = jdbcTemplate.query(QUERY, new ProductRowMapper());
        return productList;
    }
}
