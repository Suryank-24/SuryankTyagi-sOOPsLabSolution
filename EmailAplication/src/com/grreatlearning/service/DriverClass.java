package com.grreatlearning.service;

import java.util.Scanner;
import com.greatlearning.model.Employee;

public class DriverClass {
	
	public static void main(String...args) {
		
		
Employee employee = new Employee("suryank", "tyagi");

			String generatedEmail;
			char[] generatedPassword;
			char[] password = new char[8];
			
			CredentialService cService = new CredentialService();
			Scanner sc = new Scanner(System.in);
						int choice;
			
			System.out.println("Please enter the department from the following :");
			System.out.println();
			System.out.println("1. "+ "Technical Department");
			System.out.println("2. "+ "Admin Department");
			System.out.println("3. "+ "HumanResource Department");
			System.out.println("4. "+ "legal Department");

			choice = sc.nextInt();
			
			
			
			if (choice == 1) {
		generatedEmail = cService.generateEmailAddress(employee.getFirstName(), employee.getLastName(),"technical");
		generatedPassword = cService.generatePassword();
		cService.showCredentials(employee, generatedEmail, password);
		}
			
			
					
			else if(choice == 2) {
				generatedEmail = cService.generateEmailAddress(employee.getFirstName(), employee.getLastName(),"admin");
				generatedPassword = cService.generatePassword();
				cService.showCredentials(employee, generatedEmail, password);
				}
		
			
			
			else if(choice == 3) {
				
				generatedEmail = cService.generateEmailAddress(employee.getFirstName(), employee.getLastName(),"humanresource");
				generatedPassword = cService.generatePassword();
				cService.showCredentials(employee, generatedEmail, password);
				
				}
			
			
			
			else if(choice == 4) {
			
				generatedEmail = cService.generateEmailAddress(employee.getFirstName(), employee.getLastName(),"legal");
				generatedPassword = cService.generatePassword();
				cService.showCredentials(employee, generatedEmail, password);	
			}
			
			
			else {
				System.out.println("Enter a valid choice");
			}
			
			System.out.println();
	}
}
