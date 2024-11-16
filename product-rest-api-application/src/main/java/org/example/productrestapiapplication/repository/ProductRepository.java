package org.example.productrestapiapplication.repository;

import org.example.productrestapiapplication.model.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
