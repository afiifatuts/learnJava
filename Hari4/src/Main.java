import config.ConnectToDb;

import java.sql.*;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    //Java JDBC
    public static void main(String[] args) throws SQLException {
        ConnectToDb connectToDb = new ConnectToDb();
        Connection connection = connectToDb.startConnection();

        Statement statement = connection.createStatement();

        String productName1 = "nabati";
        Integer price1 = 3000;
        Integer stock = 30;
        Integer id = 2;
        String queryInsert = "INSERT INTO mst_product (product_id, product_name , product_price, stock) VALUES " +
                "('"+id+"','"+productName1+"','"+price1+"', '"+stock+"')";

        statement.executeUpdate(queryInsert);

        String query = "SELECT * FROM mst_product;";
        ResultSet result = statement.executeQuery(query);
        //System.out.println(result);

        while (result.next()){// result.netx kembaliaannnya boolean
            String productName = result.getString("product_name");
            Integer price = result.getInt("product_price");
            System.out.println("Product "+productName+" harganya "+price);
        }
        // System.out.println("hello");

    }
}




