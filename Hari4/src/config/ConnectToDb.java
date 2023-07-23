package config;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectToDb {
    private String url ="jdbc:postgresql://localhost:5432/toko_mandiri";
    private String username = "postgres";
    private String password ="blimbeng38";

    public  Connection startConnection(){
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(url,username,password);
            System.out.println("sucessfully connected");
        } catch (SQLException e){
           // System.out.println(e); -> hanya print error
          //  e.printStackTrace(); -> print sekaligus keluar dari program
             e.printStackTrace();
        }
        return connection;

    }
}
