# Session 2 notes

## Queries used

```sql
create database shopping;

use shopping;

CREATE TABLE product (
	id INT PRIMARY KEY AUTO_INCREMENT, 
	image VARCHAR(20),
	name VARCHAR(50),
	rating VARCHAR(5),
	reviews VARCHAR(20) 
);

desc product;

select * from product;

INSERT INTO product (image, name, rating, reviews) VALUES ("img1.png", "HAVELLS 6A Four-Way Extension Board", "4.4", "1,235");

INSERT INTO product (image, name, rating, reviews) VALUES ("img2.png", "Syska Four-Way Extension Board", "4.3", "11,344");

INSERT INTO product (image, name, rating, reviews) VALUES ("img3.png", "Tesla Extension Board", "4.0", "112");

DROP TABLE product;
```

```java
@RestController
public class ShoppingController {

    @Autowired
    ShoppingService shoppingService;

    @CrossOrigin
    @RequestMapping("/productsfromDB")
    public List<Product> getProductsFromDB() {
        List<Product> products = shoppingService.getProductFromDatabase();
        return products;
    }
}
```

```java
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
```

```java
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
```

```
spring.datasource.url=jdbc:mysql://localhost:3306/shopping
spring.datasource.username=root
spring.datasource.password=root
spring.datasource.platform=mysql
```

```xml
    <dependency>
			<groupId>org.springframework.boot</groupId>
			<artifactId>spring-boot-starter-data-jdbc</artifactId>
		</dependency>

		<!-- https://mvnrepository.com/artifact/mysql/mysql-connector-java -->
		<dependency>
			<groupId>mysql</groupId>
			<artifactId>mysql-connector-java</artifactId>
			<version>8.0.25</version>
		</dependency>
```
