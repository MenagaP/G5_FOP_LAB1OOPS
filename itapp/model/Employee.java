package com.labsession.itapp.model;

public class Employee {

	private String firstName;
	private String lastName;
	private String emailAddress;
	private String password;
	private String deptName;
	private String company;

	public Employee(String firstName, String lastName){
		this.firstName=firstName;
		this.lastName=lastName;
	}
	
	public Employee(String firstName, String lastName,String emailAddress){
		this.firstName=firstName;
		this.lastName=lastName;
		this.emailAddress=emailAddress;
	}

	public String getDeptName() {
		return deptName;
	}

	public void setDeptName(String deptName) {
		this.deptName = deptName;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	@Override
	public String toString() {
		return "Employee [firstName=" + firstName + ", lastName=" + lastName + ", emailAddress=" + emailAddress
				+ ", password=" + password + ", deptName=" + deptName + ", company=" + company + "]";
	}
	



}
