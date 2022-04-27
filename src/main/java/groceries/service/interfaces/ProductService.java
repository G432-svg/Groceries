package groceries.service.interfaces;

import groceries.data.Product;

import java.util.List;

public interface ProductService {
    List<Product> getAllProducts();
    void addProduct(Product product);
}
