import config.ConnectToDb;
import model.Product;
import repository.ProductRepo;

import java.sql.*;
import java.util.List;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    //Java JDBC
    public static void main(String[] args) throws SQLException {
        ConnectToDb connectToDb = new ConnectToDb();
        Connection connection = connectToDb.startConnection();

        ProductRepo productRepo = new ProductRepo(connection);

        List<Product> result= productRepo.getAllProducts();
        for (Product r : result){
            System.out.println(r);
        }

        Product product = productRepo.getProduct(1);
        System.out.println(product.toString());




    }
}




