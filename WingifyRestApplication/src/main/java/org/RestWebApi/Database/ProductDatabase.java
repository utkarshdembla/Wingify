package org.RestWebApi.database;

import java.util.HashMap;
import java.util.Map;

import org.RestWebApi.modal.Product;

public class ProductDatabase {

	private static Map<Long,Product> product=new HashMap<>();
	
	public static Map<Long,Product> getAllProducts()
	{
		return product;
	}
}
