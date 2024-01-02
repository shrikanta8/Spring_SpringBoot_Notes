package com.skillsoft.firstSpring.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//@ComponentScan(basePackages = "com.skillsoft.firstSpring.javaConfig")   //used with @Component
public class ConfigJava {
	
	@Bean
	public Food getFood()
	{
		return new Food();
	}
	
	@Bean(name= {"student","temp","con"})  //if we want to give other name in place of getStudent, then use this array!		
 	public Student getStudent() {
		//creating object
		Student student=new Student(getFood());
		return student;
	}
}
