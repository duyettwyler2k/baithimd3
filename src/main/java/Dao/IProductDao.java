package Dao;

import Model.Product;

import java.util.List;

public interface IProductDao {
List<Product> selectAllProduct();
public void insertProduct(Product product);
boolean updateProduct(Product product);
boolean deleteProduct(int id);
}
