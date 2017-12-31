package com.Danish;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainApp {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		ApplicationContext context=new ClassPathXmlApplicationContext("Beans.xml");
		Triangle t=(Triangle) context.getBean("triangle");
		t.Draw();
		Rectangle r=(Rectangle) context.getBean("rectangle");
		r.Draw();
	}

}
