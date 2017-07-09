package org.RestWebApi.Service;

import java.util.Map;

import org.RestWebApi.Database.UserAuthDatabase;
import org.RestWebApi.Modal.UserAuth;

public class UserAuthService {

	private Map<Long,UserAuth> userMap = UserAuthDatabase.getAllUsers();
	
	public Map<Long,UserAuth> getInfo()
	{
		userMap.put(1L, new UserAuth("user","password"));
		
		return userMap;
	}
	
	
}
