package com.cg.dao;

import java.util.List;

import com.cg.bean.Product;

public interface IProductDao {

	public String addProducts();
	public double generateBill(int productCode,int quantity);
	public Product getProductDetails(int productCode);
	public List<Product> findAll();
	public Product deleteProduct(int productCode);
	public Product updateProduct(int productCode,int quanity);
}
