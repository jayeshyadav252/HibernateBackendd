package com.niit.Test;

import static org.junit.Assert.assertEquals;

import org.junit.Ignore;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.junit.jupiter.SpringJUnitConfig;
import org.springframework.test.context.junit4.SpringRunner;

import com.niit.Service.ProductServiceDAO;
import com.niit.config.AppConfig;
import com.niit.model.Product;

import net.bytebuddy.dynamic.loading.InjectionClassLoader.Strategy;

@RunWith(SpringRunner.class)
@SpringJUnitConfig(classes=AppConfig.class)
public class ProductTest
{
	Product p= new Product();
	
	@Autowired
	ProductServiceDAO productServiceDAO;
	
	
	@Test
	@Ignore
	public void addProduct()
	{
		p.setProductname("sanitizer");
		p.setProductprice(400);
		p.setQuantity(4);
		assertEquals(true, productServiceDAO.addProduct(p));
		
	}
	
	@Test
	@Ignore
	public void updateProduct()
	{
		p.setProductid(1);
		p.setProductname("handwash");
		assertEquals(true,productServiceDAO.updateProduct(p));
		
	}
	
	@Test
	@Ignore
	public void deleteProduct()
	{
		assertEquals(true,productServiceDAO.deleteProductById(1));
	}
	
	@Test
	public void displayproducts()
	{
		assertEquals(true, productServiceDAO.displayProducts());
	}
	
	

}
