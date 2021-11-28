package com.grreatlearning.service;

import java.util.Random;

import com.greatlearning.model.Employee;

public class CredentialService {

	//Method for generating password
	
	public char[] generatePassword() {
		
		String capitalLetters = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
        String smallLetters = "abcdefghijklmnopqrstuvwxyz";
        String numbers = "0123456789";
        String specialCharacters = "!@#$%^&*_=+-/.?<>)";
        String values = capitalLetters + smallLetters + numbers + specialCharacters;
        
        Random random = new Random();
        char[] password = new char[8];
        
        for(int i = 0; i < 8; i++) {
        	password[i] = values.charAt(random.nextInt(values.length()));	
        }
        
        return password;
	}
	
	
	
	//Method for generating email address
	
	public String generateEmailAddress(String firstName, String lastName, String department){		
		String generatedEmail = firstName + lastName + "@" + department + ".kingsman.com"; 
       	return generatedEmail;
	}
	
	
	
	//Method for displaying generated email & password 
	
	public void showCredentials(Employee employee, String email, char[]generatedPassword) {
			System.out.println();
			System.out.println("Hi "+ employee.getFirstName()+" " + "your generated Credentials are as follows : ");
			System.out.println("Email is : " + email);
			System.out.println("Password is : " + generatedPassword);
	}
}
