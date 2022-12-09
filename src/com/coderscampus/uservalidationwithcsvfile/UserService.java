package com.coderscampus.uservalidationwithcsvfile;

import com.coderscampus.uservalidationwithcsvfile.User;



public class UserService {
	public com.coderscampus.uservalidationwithcsvfile.User createUser (String username, String password, String name) {
		User user = new User();
		user.setUsername(username);
		user.setPassword(password);
		user.setName(name);
		return user;
	}

}
