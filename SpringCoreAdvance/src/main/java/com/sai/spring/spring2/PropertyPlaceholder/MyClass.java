package com.sai.spring.spring2.PropertyPlaceholder;

public class MyClass {

	String dbName;
	String dbUser;
	String dbServer;
	String dbPortno;
	String dbPassword;

	

	public MyClass(String dbName, String dbUser, String dbServer,String dbPortno,String dbPassword) {
		super();
		this.dbName = dbName;
		this.dbUser = dbUser;
		this.dbServer = dbServer;
		this.dbPortno= dbPortno;
		this.dbPassword = dbPassword;
	}



	@Override
	public String toString() {
		return "dbName:"  + dbName +  "/n dbUser:" + dbUser + " /n dbServer:" + dbServer + "/n dbPortno :" + dbPortno +"/ndbpassword: " + dbPassword + "]";
	}

}
