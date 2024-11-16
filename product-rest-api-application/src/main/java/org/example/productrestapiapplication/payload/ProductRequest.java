package org.example.productrestapiapplication.payload;

import lombok.Data;

@Data
public class ProductRequest {
    private String name;
    private double price;
    private int quantity;
}
