package grocery.dao;

import grocery.data.Product;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import static grocery.dao.ConnectionClass.getConnection;

public class ProductsDao {

    public Product getProductById(int id) throws SQLException {
        PreparedStatement preparedStatement = getConnection().prepareStatement("SELECT FROM PRODUCT WHERE ID = ?");
        preparedStatement.setInt(1, id);
        ResultSet resultSet = preparedStatement.executeQuery();
        Product product = new Product();
        if(resultSet.next()){
            product.setId(resultSet.getInt("ID"));
            product.setProductName(resultSet.getString("NAME"));
            product.setProductPrice(resultSet.getDouble("PRICE"));
            product.setAmount(resultSet.getInt("AMOUNT"));
            product.setImageLocation(resultSet.getString("IMAGE"));
        }
        return product;
    }

    public List<Product> getAllProducts() throws SQLException {
        Statement statement;
        statement = getConnection.createStatement();
        String select = "SELECT * FROM PRODUCT";
        ResultSet resultSet = statement.executeQuery(select);
        List<Product> products= new ArrayList<>();
        while (resultSet.next()) {
            Product product = new Product();
            product.setId(resultSet.getInt("ID"));
            product.setProductName(resultSet.getString("NAME"));
            product.setProductPrice(resultSet.getDouble("PRICE"));
            product.setAmount(resultSet.getInt("AMOUNT"));
            product.setImageLocation(resultSet.getString("IMAGE"));
            products.add(product);
        }
        return products;
    }

    //statement: executeQuery -> SELECT ; UpdateQuery -> INSERT, UPDATE, DELETE
    //preparedstatement: executeQuery -> SELECT ; executeUpdate -> INSERT, UPDATE, DELETE

    public void createProduct(Product product) throws SQLException {
        PreparedStatement preparedStatement = getConnection().prepareStatement("INSERT INTO PRODUCT(ID, AMOUNT, NAME,PRICE, IMAGE) VALUES (?,?,?,?,?)");
        preparedStatement.setInt(1,product.getId());
        preparedStatement.setString(2, product.getProductName());
        preparedStatement.setDouble(3, product.getProductPrice());
        preparedStatement.setString(2, product.getImageLocation());
        preparedStatement.execute();

    }

    public void updateProduct(Product product,int id) throws SQLException {
        PreparedStatement preparedStatement = getConnection().prepareStatement("UPDATE Product SET ID = ?,AMOUNT=?,NAME = ?, PRICE =?, IMAGE=? ");
        preparedStatement.setInt(1,product.getId());
        preparedStatement.setString(2, product.getProductName());
        preparedStatement.setDouble(3, product.getProductPrice());
        preparedStatement.setString(2, product.getImageLocation());
        preparedStatement.executeUpdate();


    }
    public void deleteProduct(int id) throws SQLException {
        PreparedStatement preparedStatement = getConnection().prepareStatement("DELETE FROM Product WHERE Id = ?");
        preparedStatement.setInt(1, id);
        preparedStatement.executeUpdate();

    }

}
