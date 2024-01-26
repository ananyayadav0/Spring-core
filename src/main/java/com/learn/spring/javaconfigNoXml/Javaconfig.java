package com.learn.spring.javaconfigNoXml;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages="com.learn.spring.javaconfigNoXml") 
/*
 * you can remove component scan if using bean annotation
 */
public class Javaconfig {

	@Bean
	public Samosa getSamosa() {
		return new Samosa();
	}
	@Bean(name= {"pupil","temp"}) //can change name of bean or customize if you donot want to use method name as bean
	public Pupil getPupil() {
		Pupil pupil=new Pupil(getSamosa()); // object injection
		return pupil;
	}
}
