package org.RestWebApi.database;

import java.util.HashMap;
import java.util.Map;

import org.RestWebApi.modal.UserAuth;

public class UserAuthDatabase {
private static Map<String,String> userAuth=new HashMap<>();
	
	public static Map<String,String> getAllUsers()
	{
		return userAuth;
	}
}
