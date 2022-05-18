package grocery.service.interfaces;

import grocery.data.Product;
import org.springframework.data.domain.Page;

import java.util.List;

public interface ProductService {

    List<Product> getAllProducts();

    void addProduct(Product product);

    void saveProduct(Product product);

    Product getProductById(int id);

    void deleteProductById(int id);

    Page<Product> findPaginated(int pageNo, int pageSize, String sortField, String sortDir);
}
