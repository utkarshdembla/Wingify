package org.RestWebApi.service;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.RestWebApi.database.ProductDatabase;
import org.RestWebApi.modal.Product;

public class ProductService {

	private Map<Long,Product> productMap=ProductDatabase.getAllProducts();
	
	public ProductService()
	{
		productMap.put(1L, new Product(1,"IPhone7","Phone","Apple","White"));
	}
	
	public List<Product> getAllProducts()
	{
		return new ArrayList<Product>(productMap.values());
	}
	
	public Product getProduct(long id)
	{
		return productMap.get(id);
	}
	
	public void addProduct(Product product)
	{
		product.setId(productMap.size()+1);
		productMap.put(product.getId(), product);
		
	}
	
	public boolean updateproduct(Product product)
	{
		if(product.getId()==0)
		{
			return false;
		}
		else
		{
			productMap.put(product.getId(), product);
			return true;
		}
	}
	
	public boolean deleteProduct(long id)
	{
		if(id==0)
		{
			return false;
			
		}
		else
		{
		productMap.remove(id);
		return true;
		}
	}
	
}
