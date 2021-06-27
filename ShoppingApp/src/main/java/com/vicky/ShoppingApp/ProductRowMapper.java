package com.vicky.ShoppingApp;

import org.springframework.jdbc.core.RowMapper;

import java.sql.ResultSet;
import java.sql.SQLException;

public class ProductRowMapper implements RowMapper<Product> {

    @Override
    public Product mapRow(ResultSet resultSet, int i) throws SQLException {
        Product product = new Product();
        product.setImage(resultSet.getString("image"));
        product.setName(resultSet.getString("name"));
        product.setRating(resultSet.getString("rating"));
        product.setReviews(resultSet.getString("reviews"));
        return product;
    }
}
