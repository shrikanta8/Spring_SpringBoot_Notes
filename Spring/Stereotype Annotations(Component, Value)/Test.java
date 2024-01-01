package com.skillsoft.firstSpring.sterotype;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ApplicationContext con = new ClassPathXmlApplicationContext("com/skillsoft/firstSpring/sterotype/config.xml");
		Student student = con.getBean("ob", Student.class);
		System.out.println(student);
		System.out.println(student.getAddress());
		System.out.println(student.getAddress().getClass().getName());
		
		System.out.println(student.hashCode());
		
		Student student2 = con.getBean("ob", Student.class);
		System.out.println(student2.hashCode());
		
		
		
		
		
		
	}

}
