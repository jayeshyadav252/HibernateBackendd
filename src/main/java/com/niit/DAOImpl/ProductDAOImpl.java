package com.niit.DAOImpl;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.niit.DAO.ProductDAO;
import com.niit.model.Product;


@Transactional
@Repository(value="productDAO")
public class ProductDAOImpl  implements ProductDAO
{
	@Autowired
	SessionFactory sessionFactory;

	public boolean addProduct(Product product) {
		sessionFactory.getCurrentSession().save(product);
		return true;
		
	}

	public boolean updateProduct(Product product) {
		sessionFactory.getCurrentSession().update(product);
		return true;
	}

	public boolean deleteProductById(int productid) {
		Product p=new Product();
		p.setProductid(productid);
		sessionFactory.getCurrentSession().delete(p);
		return true;
	}

	public List<Product> displayProducts() {
		return sessionFactory.getCurrentSession().createQuery("from com.niit.model.Product").getResultList();
	}
	

}
