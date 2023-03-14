package com.labsession.itapp.service;

import com.labsession.itapp.model.Employee;

public interface CredentialService {

	String generateEmailAddress(String firstName, String lastName,String deptName, String company);
	String generateCredentials(int maxLength);
	void displayCrendentials(Employee employee);
	
	
	
}
