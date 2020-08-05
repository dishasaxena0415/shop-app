package com.baeldung.ecommerce;

import com.baeldung.ecommerce.model.Product;
import com.baeldung.ecommerce.service.ProductService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class EcommerceApplication {

    public static void main(String[] args) {
        SpringApplication.run(EcommerceApplication.class, args);
    }

    @Bean
    CommandLineRunner runner(ProductService productService) {
        return args -> {
            productService.save(new Product(1L, "Jeans", 800.00, "http://placehold.it/200x100"));
            productService.save(new Product(2L, "Shirt", 500.00, "http://placehold.it/200x100"));
            productService.save(new Product(3L, "Socks", 50.00, "http://placehold.it/200x100"));
            productService.save(new Product(4L, "Suit", 1200.00, "http://placehold.it/200x100"));
            productService.save(new Product(5L, "Belt", 90.00, "http://placehold.it/200x100"));
            productService.save(new Product(6L, "Jacket", 1500.00, "http://placehold.it/200x100"));
            productService.save(new Product(7L, "Top", 300.00, "http://placehold.it/200x100"));
            productService.save(new Product(8L, "Skirt", 600.00, "http://placehold.it/200x100"));
            productService.save(new Product(9L, "Leggings", 200.00, "http://placehold.it/200x100"));
            productService.save(new Product(10L, "Hat", 100.00, "http://placehold.it/200x100"));
            
        
        };
    }
}


