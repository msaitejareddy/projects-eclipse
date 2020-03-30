package com.sai.spring.spring2.PropertyPlaceholder;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {

		ApplicationContext container = new ClassPathXmlApplicationContext(
				"com\\sai\\spring\\spring2\\PropertyPlaceholder\\SpringConfig.xml");

		MyClass johnny = (MyClass) container.getBean("myclass");

		System.out.println(johnny);

	}

}
