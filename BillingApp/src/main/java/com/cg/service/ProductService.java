package com.cg.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.bean.Product;
import com.cg.dao.IProductDao;

@Service
public class ProductService implements IProductService {

	@Autowired
	IProductDao repo;
	@Override
	public String addProducts() {
		// TODO Auto-generated method stub
		return repo.addProducts();
	}

	@Override
	public double generateBill(int productCode, int quantity) {
		// TODO Auto-generated method stub
		return repo.generateBill(productCode, quantity);
	}

	@Override
	public Product getProductDetails(int productCode) {
		// TODO Auto-generated method stub
		return repo.getProductDetails(productCode);
	}

	@Override
	public List<Product> findAll() {
		// TODO Auto-generated method stub
		return repo.findAll();
	}

	@Override
	public Product deleteProduct(int productCode) {
		// TODO Auto-generated method stub
		return repo.deleteProduct(productCode);
	}

	@Override
	public Product updateProduct(int productCode,int quantity) {
		// TODO Auto-generated method stub
		return repo.updateProduct(productCode,quantity);
	}

	
	
}
