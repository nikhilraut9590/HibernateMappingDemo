package com.hibernate.one2one;

import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

public class Employee {
	private int empId;
	private String email;
	private String firstname;
	private String lastname;
	private int accId;
	
	@OneToOne
	@JoinColumn(name="accId")
	private Account account;
}
