package com.greatlearning.service;

import java.security.SecureRandom;


import com.greatlearning.model.Employee;

public class CredentialService {
	
	
	
	
	public String generateEmailAddress(String firstName, String lastName, String deptName) {
		
		return firstName+lastName+"@"+deptName+".greatlearning.com";
		
	}
	
	public char[] generatePassword() {
		
		
		String capChar = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
		String smallChar = "abcdefghijklmnopqrstuvwxyz";
		String specialChar = "!@#$%^&*";
		String numbers = "0123456789";
		
		char[] password = new char[8];
		
				
		SecureRandom ran1 = new SecureRandom();
		for(int i=0; i<3; i++) {
			password[i] = capChar.charAt(ran1.nextInt(26));
		}
		
		for(int i=3; i<5; i++) {
			password[i] = smallChar.charAt(ran1.nextInt(26));
		}
		
		for(int i=5; i<7; i++) {
			password[i] = numbers.charAt(ran1.nextInt(10));
		}
		
		password[7] = specialChar.charAt(ran1.nextInt(specialChar.length()));
		
		
		
		for(int i=password.length-1; i>0; i--) {
			int index = ran1.nextInt(i+1);
			char a = password[index];
			password[index]=password[i];
			password[i]=a;
			
		}
		
		return password;
	}
	
	public void showCredentials(Employee employee, String emailID, char[] password) {
		System.out.println("Dear "+employee.getFirstName()+" your generated credentials are as follows");
		System.out.println("Email -> "+emailID);
		System.out.print("Password -> ");
		for (int i = 0 ; i<password.length;i++) {
			System.out.print(password[i]);
		}
		
	}

}
