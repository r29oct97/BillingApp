package com.cg.service;

import java.util.List;

import org.springframework.web.bind.annotation.PathVariable;

import com.cg.bean.Product;

public interface IProductService {
	
	public String addProducts();
	public double generateBill(int productCode,int quantity);
	public Product getProductDetails(int productCode);
	public List<Product> findAll();
	public Product deleteProduct(int productCode);
	public Product updateProduct(int productCode,int quantity);
}
