package com.coderscampus.uservalidationwithcsvfile;

import java.util.Scanner;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;

//  @author JamesR404
public class UserValidation {
//
	
	
	public static void main(String[] args) {
		
		
		
//		You will prompt a user for a username (email address) and a password,
		
		try {	
//			need to fix error [[Syntax error on tokens delete these tokens]]
			java.util.Scanner scannerVar = new
//					temporarily prefixed with java.util, to try to fix "scannerVar cannot be resolved"
//					https://www.dropbox.com/s/ec0tmnrpdgha69g/Syntax%20error%20on%20tokens%20delete%20these%20tokens.md?dl=0
			Scanner(System.in);
			System.out.println("Please enter your email address");
			String eMailEntered = scannerVar.nextLine();
			
			System.out.println("And now enter your password");
			String passwordEntered = scannerVar.nextLine();
		} finally {
			if (scannerVar != null) {
			scannerVar.close();
			}
		}
		
//		and then use the inputs you receive to validate whether or not the username / password combination is valid.
		
		try {
			BufferedReader fileReader = new BufferedReader(new FileReader("data.txt"));
			System.out.println(fileReader.toString());
		}
		catch (FileNotFoundException exception) {
			System.out.println("Oops, the following exception occured:");
			exception.printStackTrace();
		} finally {
        	if (fileReader != null) {
				
				FileReader.close();
				System.out.println("file reader closed OK.");
        		}
		}
		
	}

}
