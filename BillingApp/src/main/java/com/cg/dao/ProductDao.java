package com.cg.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;
import javax.persistence.TypedQuery;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.cg.bean.Product;

@Repository
@Transactional
public class ProductDao implements IProductDao{
	
	@PersistenceContext
	EntityManager entity;
	
	

	@Override
	public String addProducts() {
		// TODO Auto-generated method stub
		
		Product p1=new Product("iPhone","Smart Phone",35000.00,3,"Electronics");
		Product p2=new Product("LedTv","Item",5000.00,2,"Electronics");
		Product p3=new Product("Teddy","Toy",35000.00,3,"Normal");
		entity.persist(p1);
		entity.persist(p2);
		entity.persist(p3);
		
		return "Products added successfully";
	}

	@Override
	public double generateBill(int productCode, int quantity) {
		// TODO Auto-generated method stub
		Product product=entity.find(Product.class,productCode);
		return product.getProductPrice()*quantity;
	}

	@Override
	public Product getProductDetails(int productCode) {
		// TODO Auto-generated method stub
		
		
		return entity.find(Product.class, productCode);
	}
	@Override
	public List<Product> findAll()
	{
		
		Query query=entity.createQuery("select p from Product p");
		List<Product> list=query.getResultList();
		return list;
	}

	@Override
	public Product deleteProduct(int productCode) {
		// TODO Auto-generated method stub
		Product product=entity.find(Product.class, productCode);
		entity.remove(product);
		
		return product;
	}

	@Override
	public Product updateProduct(int productCode,int quantity) {
		// TODO Auto-generated method stub
		Product product=entity.find(Product.class, productCode);
		product.setQuantity(product.getQuantity()-quantity);
		entity.merge(product);
		
		return product;
	}
	
	

	
}
