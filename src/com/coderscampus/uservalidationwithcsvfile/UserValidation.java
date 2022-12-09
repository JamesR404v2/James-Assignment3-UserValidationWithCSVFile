package com.coderscampus.uservalidationwithcsvfile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

//  @author JamesR404
public class UserValidation 
{
	//


	public static void main(String[] args) 
	{

// just commenting out temporarily because I am testing the other part of the code.
//
//		//		You will prompt a user for a username (email address) and a password,
//		
//		Scanner scannerVar = new Scanner(System.in);
//		
//		try {
//		System.out.println("Enter your email:");
//		String userEmail = scannerVar.nextLine();
//		System.out.println("Enter your password:");
//		String userPassword = scannerVar.nextLine();
//		}
//		finally
//		{
//		scannerVar.close();
//		}		
		


//		Import the data.txt in a user POJO, in an array of user objects.

//		and then use the inputs you receive to validate whether or not the username / password combination is valid.

		
		
		public class UserArrayService 
		{
		
		User[] users = new User[4];
		
		
		BufferedReader fileReader = null;
				
		try 
			{
			fileReader = new BufferedReader(new FileReader("data.txt"));
			int count = 0;
			String line;
			try 
				{
				while ((line = fileReader.readLine()) != null) 
					{
					users[count] = new User(line.split(","));
					count = count + 1;
					
//					System.out.println(line);
//					String[] usersArray = line.split(",");
//					 do I need to create an array? Or call the user creation POJO? Or both?
//					com.coderscampus.uservalidationwithcsvfile.User createUser
//					com.coderscampus.uservalidationwithcsvfile.UserService.createUser();	
					
					
//					the below strings can be updated to real values via the line.split from line, 
//					but first to get the below user setting to work with just simple string values.
//					String userUserNameToSet = "1";
//					String userPasswordToSet = "2";
//					String userNameToSet = "3";
//					UserService.createUser(userUserNameToSet,userPasswordToSet,userNameToSet);
					
//					java.lang.Error: Unresolved compilation problem: 
//						Cannot make a static reference to the non-static method createUser(String, String, String) from the type UserService
// https://stackoverflow.com/questions/4969171/cannot-make-a-static-reference-to-the-non-static-method
					
					
//					UserService.createUser(line);

//					This spits out the username, password and name, row by row, but I don't see (yet?) how it is useful. 
//					String[] usersArray = line.split(",");
//					for (String userPart : usersArray) {
//						System.out.println((userPart));
//					}

					
//					UserService.createUser(line.split(","));
					
//					 or both?
//					line.split(",") = createUser();
					
					}
						
				} catch (IOException e) 
				{
				e.printStackTrace();
				}
//			for each line in the file, create a user object.
			}
		catch (FileNotFoundException exception) {
			System.out.println("Oops, the following exception occured:");
			exception.printStackTrace();
		} finally {
			if (fileReader != null) {
				try {
					fileReader.close();
					} catch (IOException e) {
					e.printStackTrace();
					
					}
//				System.out.println("file reader closed OK.");
				}
			}
		}
	}
}
