//Injecting Reference Type

package com.skillsoft.firstSpring.ref;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
	
	public static void main(String[] args) {
		ApplicationContext context=new ClassPathXmlApplicationContext("com/skillsoft/firstSpring/ref/configRef.xml");
		A temp=(A) context.getBean("aref");
		
		System.out.println(temp.getX());
		System.out.println(temp.getOb().getY());
	}
}
