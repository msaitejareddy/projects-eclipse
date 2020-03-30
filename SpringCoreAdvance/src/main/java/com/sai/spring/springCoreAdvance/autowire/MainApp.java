package com.sai.spring.springCoreAdvance.autowire;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {

		ApplicationContext container = new ClassPathXmlApplicationContext(
				"com\\sai\\spring\\springCoreAdvance\\autowire\\AppConfig.xml");
		
		Emplyee e = (Emplyee) container.getBean("emp");
		
		System.out.println(e);
	}

}
