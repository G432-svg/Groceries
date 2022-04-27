package groceries.dao;

import groceries.dao.ProductsDao;
import groceries.data.Product;
import groceries.repositories.ProductRepository;

import java.sql.SQLException;
import java.util.List;

public class ProductService {
    public static void main(String[] args) throws SQLException{

        try {
            Product product = new Product();
            ProductsDao productsDao = new ProductsDao();

//            productsDao.deleteProduct(6);
//            productsDao.deleteProduct(8);
            productsDao.getAllProducts().forEach(System.out::println);
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

//        Product product = new Product(7,1,"Tonic",1.30,"facade3.jpg");
        Product product2 = new Product();
    }
}
