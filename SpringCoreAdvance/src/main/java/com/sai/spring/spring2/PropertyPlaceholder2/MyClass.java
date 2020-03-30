package com.sai.spring.spring2.PropertyPlaceholder2;

public class MyClass {
	
	     String   bankName;
			String bankBranch;
			String bankCustomerID;
			 String bankPassword;
			
			 
			 public MyClass(String bankName, String bankBranch, String bankCustomerID, String bankPassword) {
				super();
				this.bankName = bankName;
				this.bankBranch = bankBranch;
				this.bankCustomerID = bankCustomerID;
				this.bankPassword = bankPassword;
			}


			@Override
			public String toString() {
				return "MyClass [bankName=" + bankName + ", bankBranch=" + bankBranch + ", bankCustomerID="
						+ bankCustomerID + ", bankPassword=" + bankPassword + "]";
			}

			 
			 
			
			 
}
