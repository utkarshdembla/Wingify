package org.RestWebApi.service;

import java.util.Map;

import org.RestWebApi.database.UserAuthDatabase;
import org.RestWebApi.modal.UserAuth;

public class UserAuthService {

	private Map<String,String> userMap = UserAuthDatabase.getAllUsers();
	
	public Map<String,String> getInfo()
	{
		userMap.put("user","password");
		userMap.put("utkarsh", "wingify");
		
		return userMap;
	}
	
	
}
