# Product REST API Application

This is a Spring Boot application that provides a RESTful API for managing products. The application allows you to create, read, update, and delete products.

## Technologies

- Java
- Spring Boot
- Spring Data JPA
- MySQL
- Maven
 
## API Endpoints

### Product Endpoints

- **GET /api/v1/product:** Get all products
- **GET /api/v1/product/{id}:** Get a product by ID
- **POST /api/v1/product:** Create a new product
- **PUT /api/v1/product/{id}:** Update a product by ID
- **DELETE /api/v1/product/{id}:** Delete a product by ID

### Example Request

Add a New Product

- **URL**: http://localhost:8080/api/v1/product
- **Method**: POST
- **Headers**: Content-Type: application/json
- **Body**:
    ```json
    {
        "name": "Product 1",
        "price": 100.00,
        "quantity": 10
    }
    ```


