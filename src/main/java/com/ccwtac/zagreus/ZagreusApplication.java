package com.ccwtac.zagreus;

import com.ccwtac.zagreus.model.Product;
import com.ccwtac.zagreus.service.ProductService;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class ZagreusApplication {

  public static void main(String[] args) {
    SpringApplication.run(ZagreusApplication.class, args);
  }

  @Bean
  CommandLineRunner runner(ProductService productService) {
    return args -> {
      productService.save(new Product(1L, "TV Set", 300.00, "http://placehold.it/200x100"));
      productService.save(new Product(2L, "Game Console", 200.00, "http://placehold.it/200x100"));
      productService.save(new Product(3L, "Sofa", 100.00, "http://placehold.it/200x100"));
      productService.save(new Product(4L, "Icecream", 5.00, "http://placehold.it/200x100"));
      productService.save(new Product(5L, "Beer", 3.00, "http://placehold.it/200x100"));
      productService.save(new Product(6L, "Phone", 500.00, "http://placehold.it/200x100"));
      productService.save(new Product(7L, "Watch", 30.00, "http://placehold.it/200x100"));
    };
  }
}