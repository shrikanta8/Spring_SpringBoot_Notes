package com.skillsoft.springBasic.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Emp {
	@Autowired
//	Qualifier => if there are more than one bean we specify which particular bean we want
	@Qualifier("add2")
	private Address address;

	public Address getAddress() {
		return address;
	}

//	@Autowired
	public void setAddress(Address address) {
		System.out.println("Setting address");
		this.address = address;
	}

	public Emp() {
		super();
		// TODO Auto-generated constructor stub
	}

//	@Autowired
	public Emp(Address address) {
		super();
		this.address = address;
		System.out.println("inside constructor");
	}

	@Override
	public String toString() {
		return "Emp [address=" + address + "]";
	}
	
	
	
	
	
}
