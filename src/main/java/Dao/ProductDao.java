package Dao;

import Model.Product;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class ProductDao implements IProductDao {
    public static final String SELECT_ALL = "select*from product";
    public static final String INSERT_PRODUCT = "insert into product(name,price,number,color,mota,danh_sach) values(?,?,?,?,?,?)";
    public static final String UPDATE_PRODUCT = "update product set name=?,price=?,number=?,color=?,mota=?,danh_sach=? where id=?";
    public static final String DELETE_PRODUCT = "delete from product where id=?";
    @Override
    public List<Product> selectAllProduct() {
        List<Product> products = new ArrayList<>();
        Connection connection = SQLConnection.getConnection();
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL);
            ResultSet resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                double price = resultSet.getDouble("price");
                int number = resultSet.getInt("number");
                String color = resultSet.getString("color");
                String mota = resultSet.getString("mota");
                String danh_sach = resultSet.getString("danh_sach");
                products.add(new Product(id, name, price, number, color, mota, danh_sach));
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return products;
    }

    @Override
    public void insertProduct(Product product) {
        Connection connection = SQLConnection.getConnection();
        int rowInsert = 0;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(INSERT_PRODUCT);
            preparedStatement.setString(1, product.getName());
            preparedStatement.setDouble(2, product.getPrice());
            preparedStatement.setInt(3, product.getNumber());
            preparedStatement.setString(4, product.getColor());
            preparedStatement.setString(5, product.getMota());
            preparedStatement.setString(6, product.getDanh_sach());
            rowInsert = preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }

    @Override
    public boolean updateProduct(Product product) {
        Connection connection = SQLConnection.getConnection();
        int rowUpdate = 0;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(UPDATE_PRODUCT);
            preparedStatement.setString(1, product.getName());
            preparedStatement.setDouble(2, product.getPrice());
            preparedStatement.setInt(3, product.getNumber());
            preparedStatement.setString(4, product.getColor());
            preparedStatement.setString(5, product.getMota());
            preparedStatement.setString(6, product.getDanh_sach());
            preparedStatement.setInt(7,product.getId());
            rowUpdate=preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return rowUpdate!=0;
    }

    @Override
    public boolean deleteProduct(int id) {
        Connection connection = SQLConnection.getConnection();
        int rowDelete = 0;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement(DELETE_PRODUCT);
            preparedStatement.setInt(1, id);
            rowDelete = preparedStatement.executeUpdate();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        return rowDelete != 0;

    }

    public static void main(String[] args) {

    }
}
