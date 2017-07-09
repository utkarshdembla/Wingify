package org.RestWebApi.Database;

import java.util.HashMap;
import java.util.Map;

import org.RestWebApi.Modal.Product;

public class ProductDatabase {

	private static Map<Long,Product> product=new HashMap<>();
	
	public static Map<Long,Product> getAllProducts()
	{
		return product;
	}
}
