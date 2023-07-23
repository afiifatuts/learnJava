import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    //Java JDBC
    public static void main(String[] args) throws SQLException {
        String url ="jdbc:postgresql://localhost:5432/toko_mandiri";
        String username = "postgres";
        String password ="blimbeng38";

            Connection connection = DriverManager.getConnection(url,username,password);
            System.out.println("sucessfully connected");


    }
}