package org.example.productrestapiapplication.payload;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Positive;
import lombok.Data;

@Data
public class ProductRequest {

    @NotBlank(message = "Name is required")
    private String name;

    @NotNull(message = "Price is required")
    @Positive(message = "Price must be greater than 0")
    private double price;

    @NotNull(message = "Quantity is required")
    @Positive(message = "Quantity must be greater than 0")
    private int quantity;
}
