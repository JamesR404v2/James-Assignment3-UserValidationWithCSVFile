package com.coderscampus.uservalidationwithcsvfile;

import java.util.Scanner;
import com.coderscampus.uservalidationwithcsvfile.*;

// This UserLoginApplication is the main app.  

// This App depends on the following other files and functions:
// User : This is a User POJO, that will hold the instantiated user objects.
// UserServiceValidation : help with things like validating if the inputted username/password matches what's in our User Array. 
// UserServiceLoading : provides the service of reading the data from the file and creating the User Array.
//

// The rest of the logic is held held inside this UserLoginApplication Class, which houses the "public static void main" method.



public class UserLoginApplication 
{
	
	public User[] users = new User[3];
	private UserServiceValidation userServiceValidation = new UserServiceValidation();
	UserServiceLoading userServiceLoading = new UserServiceLoading();
	
	
	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		
		UserLoginApplication launch = new UserLoginApplication();
		launch.askUserInput();

	}
	
	public void askUserInput ()
	{
		Scanner scannerVar = null;
		try
		{
			scannerVar = new Scanner(System.in);
			int loginsAttempted = 0;
			boolean validLogin = false;
			while (!validLogin && loginsAttempted < 5)
			{
				System.out.println("Enter your email: ");
				String username = scannerVar.nextLine();
				System.out.println("Enter your password: ");
				String password = scannerVar.nextLine();
				
				User validUserLogin = UserServiceValidation.validateUser(username, password);
				if (validUserLogin != null)
				{
					System.out.println("Welcome! " + validUserLogin.getName());
					validUserLogin = true;
				}
				else
				{
					System.out.println("Invalid login, please try again");
					loginsAttempted++;
					if (loginsAttempted == 5)
					{
						System.out.println("Too many failed login attempts, you are now locked out.");
//						locked out in name only ;P
					}
				}
			}
		}
		finally
		{
			if (scannerVar != null)
				scannerVar.close();
		}
		
		
	}

}
