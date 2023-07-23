package repository;

import model.Product;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProductRepo {
    Connection connection;

    public ProductRepo(Connection connection) {
        this.connection = connection;
    }

    public List<Product> getAllProducts() throws SQLException {
        Statement statement = connection.createStatement();

        String query = "SELECT * FROM mst_product;";
        List<Product> products = new ArrayList<>();

        ResultSet result = statement.executeQuery(query);

        while (result.next()){// result.netx kembaliaannnya boolean
            String newProductName = result.getString("product_name");
            Integer newProductPrice = result.getInt("product_price");
            Integer newProductStock = result.getInt("stock");
            products.add(new Product(newProductPrice,newProductStock,newProductName));
        }

        return  products;
    }

    public void addProduct(Product product)throws SQLException{
        Statement statement = connection.createStatement();


        String queryInsert = "INSERT INTO mst_product (product_id, product_name , product_price, stock) VALUES " +
                "('"+product.getProductId()+"','"+product.getProductName()+"','"+product.getProductPrice()+"', '"+product.getStock()+"')";

        statement.executeUpdate(queryInsert);
    }

    public void  deleteById(Integer idProduct) throws SQLException{
        Statement statement = connection.createStatement();

        String query2 ="DELETE FROM mst_product WHERE product_id="+idProduct;
        statement.executeUpdate(query2);
    }

    public void updateData(Product product, Integer idProduct) throws SQLException {
        Statement statement = connection.createStatement();


        String queryUpdate = "UPDATE mst_product SET product_name='"+product.getProductName()+"'," +
                "product_price="+product.getProductPrice()+",stock="+product.getStock()+" WHERE product_id="+idProduct+"";
        statement.executeUpdate(queryUpdate);
    }

    public Product getProduct(Integer idProduct) throws SQLException {
        Statement statement = connection.createStatement();
        String queryGetProduct = "SELECT * FROM mst_product WHERE product_id ="+idProduct;

        ResultSet resultSet = statement.executeQuery(queryGetProduct);
        resultSet.next();
        String productName = resultSet.getString("product_name");
        Integer productPrice = resultSet.getInt("product_price");
        Integer productStock = resultSet.getInt("stock");

        Product product = new Product(productPrice,productStock,productName);
        return product;

    }
}



