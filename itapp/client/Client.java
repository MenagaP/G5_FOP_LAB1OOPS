package com.labsession.itapp.client;

import java.util.Scanner;

import com.labsession.itapp.model.Employee;
//import com.labsession.itapp.service.CredentialService;
import com.labsession.itapp.service.CredentialServiceImplementation;

public class Client {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Employee employee =new Employee("jay","Shankar");
		employee.setCompany("Wipro");
		CredentialServiceImplementation cs = new CredentialServiceImplementation();
		System.out.println("Please enter the department from the following");
		System.out.println("1.Technical");
		System.out.println("2.Admin");
		System.out.println("3.Human Resource");
		System.out.println("4.Legal");
		
		Scanner sc = new Scanner(System.in);
		int option= sc.nextInt();
		switch(option) {
		case 1:{
			String generatedEmail=cs.generateEmailAddress(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(),"tech",employee.getCompany().toLowerCase());
			String generatedPassword=cs.generateCredentials(12);
			employee.setEmailAddress(generatedEmail);
			employee.setPassword(generatedPassword);
			cs.displayCrendentials(employee);
			break;
		}
		case 2:{
			String generatedEmail=cs.generateEmailAddress(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(),"admin",employee.getCompany().toLowerCase());
			String generatedPassword=cs.generateCredentials(12);
			employee.setEmailAddress(generatedEmail);
			employee.setPassword(generatedPassword);
			cs.displayCrendentials(employee);
			break;
		}
		case 3:{
			String generatedEmail=cs.generateEmailAddress(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(),"humanresource",employee.getCompany().toLowerCase());
			String generatedPassword=cs.generateCredentials(12);
			employee.setEmailAddress(generatedEmail);
			employee.setPassword(generatedPassword);
			cs.displayCrendentials(employee);
			break;
		}
		case 4:{
			String generatedEmail=cs.generateEmailAddress(employee.getFirstName().toLowerCase(), employee.getLastName().toLowerCase(),"legal",employee.getCompany().toLowerCase());
			String generatedPassword=cs.generateCredentials(12);
			employee.setEmailAddress(generatedEmail);
			employee.setPassword(generatedPassword);
			cs.displayCrendentials(employee);
			break;
		}
		default:
		{
			System.out.println("Enter a valid option");
		}
		}
		
	}

}
