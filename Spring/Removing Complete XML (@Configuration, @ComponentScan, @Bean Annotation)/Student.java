package com.skillsoft.firstSpring.javaConfig;

import org.springframework.stereotype.Component;

//@Component("secondStudent") //won't use it with @Bean
public class Student {

	private Food food;
	
	public Student(Food food) {
		super();
		this.food = food;
	}
	
	public void study()
	{
		this.food.display();
		System.out.println("i am studying!!!");
	}

	public Food getFood() {
		return food;
	}

	public void setFood(Food food) {
		this.food = food;
	}
}
