package org.RestWebApi.Database;

import java.util.HashMap;
import java.util.Map;


import org.RestWebApi.Modal.UserAuth;

public class UserAuthDatabase {
private static Map<Long,UserAuth> userAuth=new HashMap<>();
	
	public static Map<Long,UserAuth> getAllUsers()
	{
		return userAuth;
	}
}
