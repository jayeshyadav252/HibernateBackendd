package com.niit.DAO;

import java.util.List;

import com.niit.model.Product;

public interface ProductDAO 
{
	public boolean addProduct(Product product);
	public boolean updateProduct(Product product);
	public boolean deleteProductById(int productid);
	public List<Product> displayProducts();

}
