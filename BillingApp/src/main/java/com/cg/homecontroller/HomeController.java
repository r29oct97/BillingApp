package com.cg.homecontroller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cg.bean.Product;
import com.cg.service.IProductService;

@RestController
public class HomeController {
	
	@Autowired
	IProductService service;

	
	
	@RequestMapping(value="/addProduct")
	public String addProducts()
	{
		String pdt=service.addProducts();
		return pdt;
	}
	
	@RequestMapping(value="/generateBill/{productCode}/{quantity}")
	public double generateBill(@PathVariable int productCode,@PathVariable int quantity)
	{
		double list=service.generateBill(productCode,quantity);
		return list;
	}
	
	@RequestMapping(value="/productDetails/{productCode}")
	public Product getProductDetails(@PathVariable int productCode) {
		// TODO Auto-generated method stub
		Product product=service.getProductDetails(productCode);
		return product;
				
		
	}
	
	@RequestMapping(value="/findAll")
	public List<Product> findAll()
	{
		List<Product> product=service.findAll();
		return product;
		}
	
	
	@RequestMapping(value="/deleteProduct/{productCode}")
	public Product deleteProduct(@PathVariable int productCode)
	{
		Product product=service.deleteProduct(productCode);
		return product;
	}
	
	@RequestMapping(value="/updateProduct/{productCode}/{quantity}")
	public Product updateProduct(@PathVariable int productCode,@PathVariable int quantity)
	{
		
		Product product=service.updateProduct(productCode,quantity);
		return product;
	}
	
	
	
	}
