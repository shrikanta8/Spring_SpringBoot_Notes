package com.skillsoft.firstSpring.javaConfig;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
	public static void main(String[] args) {

		ApplicationContext context = new AnnotationConfigApplicationContext(ConfigJava.class);
		
//		Student student = context.getBean("secondStudent", Student.class); 	//when using @Component("secondStudent")
		
		Student student = context.getBean("temp", Student.class);
		System.out.println(student);
		student.study();

	}
}
