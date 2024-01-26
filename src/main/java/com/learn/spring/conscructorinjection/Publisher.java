package com.learn.spring.conscructorinjection;

public class Publisher {

	String name;

	public Publisher() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Publisher(String name) {
		super();
		this.name = name;
	}

	@Override
	public String toString() {
		return "Publisher [name=" + name + "]";
	}
	
}
