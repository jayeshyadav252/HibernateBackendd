package com.niit.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.niit.DAO.ProductDAO;
import com.niit.Service.ProductServiceDAO;
import com.niit.model.Product;


@Service
public class ProductServiceImpl implements ProductServiceDAO 
{	
	@Autowired
	ProductDAO productDAO;

	public boolean addProduct(Product product) {
		productDAO.addProduct(product);
		return true;
		
	}

	public boolean updateProduct(Product product) {
		productDAO.updateProduct(product);
		return true;
	}

	public boolean deleteProductById(int productid) {
		productDAO.deleteProductById(productid);
		return true;
	}

	public List<Product> displayProducts() {
		return productDAO.displayProducts();
		
	}
	

}
