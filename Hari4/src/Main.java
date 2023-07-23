import config.ConnectToDb;
import model.Product;
import repository.ProductRepo;

import java.sql.*;
import java.util.List;
import java.util.Scanner;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    //Java JDBC
    public static void main(String[] args) throws SQLException {
        ConnectToDb connectToDb = new ConnectToDb();
        Connection connection = connectToDb.startConnection();

        Scanner scanner = new Scanner(System.in);
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




* */