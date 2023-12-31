//Implementing Bean LifeCyle using Annotations

package com.skillsoft.firstSpring.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Example {
	private String subject;

	public String getSubject() {
		return subject;
	}

	public void setSubject(String subject) {
		this.subject = subject;
	}

	public Example() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Example [subject=" + subject + "]";
	}

	//https://www.baeldung.com/spring-postconstruct-predestroy
	//add this following code in pom.xml
//	<dependency>
//	    <groupId>javax.annotation</groupId>
//	    <artifactId>javax.annotation-api</artifactId>
//	    <version>1.3.2</version>
//	</dependency>
	
	@PostConstruct
	public void start() {
		System.out.println("starting method");
	}

	@PreDestroy
	public void end() {
		System.out.println("ending method");
	}
}
