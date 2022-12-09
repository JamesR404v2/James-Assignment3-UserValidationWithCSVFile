package com.coderscampus.uservalidationwithcsvfile;

import java.io.IOException;

public class UserServiceValidation 
{

	
	public User validateUser(String username, String password) throws IOException 
	{
		UserServiceLoading userServiceLoading = new UserServiceLoading();
		for (User user : userServiceLoading.getUserArray()) 
		{
			if (user.getUsername().equalsIgnoreCase(username) && user.getPassword().equals(password)) 
			{
				return user;
			}
		}
		return null;
	}


}
