package com.learn.spring.javaconfigNoXml;

import org.springframework.stereotype.Component;

@Component
public class Student {

	public void studying() {
		System.out.println("Student is studying");
	}
}
