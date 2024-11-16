package org.example.productrestapiapplication.service;

import org.example.productrestapiapplication.model.Product;
import org.example.productrestapiapplication.payload.ProductRequest;
import org.example.productrestapiapplication.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService {

    @Autowired
    private ProductRepository productRepository;

    public Product addProduct(ProductRequest request) {
        Product product = new Product();
        product.setName(request.getName());
        product.setPrice(request.getPrice());
        product.setQuantity(request.getQuantity());
        return productRepository.save(product);
    }

    public List<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(Long id) {
        return productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Product not found with id " + id));
    }

    public Product updateProduct(Long id, ProductRequest request) {
       Product product = getProductById(id);
       product.setName(request.getName());
       product.setPrice(request.getPrice());
       product.setQuantity(request.getQuantity());
       return productRepository.save(product);

    }

    public void deleteProduct(Long id) {
        productRepository.deleteById(id);
    }
}
