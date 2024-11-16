package org.example.productrestapiapplication.exception;

public class NotFound extends RuntimeException {
    public NotFound(String message) {
        super(message);
    }
}
