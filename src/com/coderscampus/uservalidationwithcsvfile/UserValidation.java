package com.coderscampus.uservalidationwithcsvfile;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

//  @author JamesR404
public class UserValidation {
	//


	public static void main(String[] args) {



		//		You will prompt a user for a username (email address) and a password,
		Scanner scanner;
		
		try {
		
		scanner = new Scanner(System.in);
		System.out.println("please enter yar email addy");
		String userEmail = scanner.nextLine();
		}
		finally
		{
		scanner.close();
		}		
				
		

				
//		try {	
////			//			need to fix error [[Syntax error on tokens delete these tokens]]
////			
////					//					temporarily prefixed with java.util, to try to fix "scannerVar cannot be resolved"
////					//					https://www.dropbox.com/s/ec0tmnrpdgha69g/Syntax%20error%20on%20tokens%20delete%20these%20tokens.md?dl=0
////
////					//					tried ctrl-shift-O , it rearranges the order of the import statements, but nothing actually added. And the error persists.
////
////					Scanner(System.in);
////			System.out.println("Please enter your email address");
////			String eMailEntered = scannerVar.nextLine();
////
////			System.out.println("And now enter your password");
////			String passwordEntered = scannerVar.nextLine();
//		} finally {
//			if (scannerVar != null) {
//				scannerVar.close();
//			}
//		}

		//		and then use the inputs you receive to validate whether or not the username / password combination is valid.

		BufferedReader fileReader = null;
				
		try {
			fileReader = new BufferedReader(new FileReader("data.txt"));
			System.out.println(fileReader.toString());
		}
		catch (FileNotFoundException exception) {
			System.out.println("Oops, the following exception occured:");
			exception.printStackTrace();
		} finally {
			if (fileReader != null) {
				fileReader.close();
				System.out.println("file reader closed OK.");
			}
		}

	}

}
