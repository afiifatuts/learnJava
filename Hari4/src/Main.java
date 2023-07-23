import config.ConnectToDb;
import model.Product;
import repository.ProductRepo;

import java.sql.*;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    //Java JDBC
    public static void main(String[] args) throws SQLException {
        ConnectToDb connectToDb = new ConnectToDb();
        Connection connection = connectToDb.startConnection();

        //menambahkan product sekaligus banyak
        Product product1 = new Product(9000000, 6, "Laptop");
        Product product2 = new Product(9000000, 6, "Keyboard");
        Product product3 = new Product(900000, 6, "Monitor");

        // Find the maximum product_id in the table and increment it
        String queryMaxProductId = "SELECT MAX(product_id) FROM mst_product";
        Statement maxProductIdStatement = connection.createStatement();
        ResultSet resultSet = maxProductIdStatement.executeQuery(queryMaxProductId);
        int maxProductId = 0;
        if (resultSet.next()) {
            maxProductId = resultSet.getInt(1);
        }
        maxProductId++; // Increment the max product_id to get a new unique value

        List<Product> dataProduct = Arrays.asList(product1, product2, product3);

        String queryInsertProducts = "INSERT INTO mst_product (product_id, product_name, product_price, stock) VALUES (?, ?, ?, ?)";
        PreparedStatement preparedStatement = connection.prepareStatement(queryInsertProducts);

        for (Product p : dataProduct) {
            preparedStatement.setInt(1, maxProductId);
            preparedStatement.setString(2, p.getProductName());
            preparedStatement.setInt(3, p.getProductPrice());
            preparedStatement.setInt(4, p.getStock());
            preparedStatement.addBatch();
            maxProductId++; // Increment the product_id for the next iteration
        }

        preparedStatement.executeBatch();

    }
}




/*
*    ProductRepo productRepo = new ProductRepo(connection);

        List<Product> result= productRepo.getAllProducts();
        for (Product r : result){
            System.out.println(r);
        }

        Product product = productRepo.getProduct(1);
        System.out.println(product.toString());


*
*         Scanner scanner = new Scanner(System.in);
        System.out.println("Username : ");
        String username = scanner.nextLine();
        System.out.println("Password : ");
        String password = scanner.nextLine();

//        Statement statement = connection.createStatement();
//        ResultSet resultSet = statement.executeQuery("SELECT * FROM mst_user WHERE username = '"+username+"' and password= '"+password+"'");
//
        PreparedStatement preparedStatement = connection.prepareStatement("SELECT * FROM mst_user WHERE username =? and password=?");
        preparedStatement.setString(1, username);
        preparedStatement.setString(2, password);
        ResultSet resultSet1 = preparedStatement.executeQuery();

        if (resultSet1.next()){
            System.out.println("Login successfully");
        }else{
            System.out.println("login gagal");
        }



* */