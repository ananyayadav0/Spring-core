package com.learn.spring.component;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
/*
 * if we use @Component("obj") , then bean will be created as obj and not default -> student
 */
//@Scope("prototype")
/*
 * to change default scope which is singleton
 */
public class Student {

	@Value("Anniiee") // @value to assign values to variables
	private String studentName;
	@Value("Dehradun")
	private String city;
	@Value("#{temp}")  // @value list #{} 
	private List<String> subjects;
	@Value("#{50+50+49}")
	private int marks;
	@Value("#{T(java.lang.Math).sqrt(144)}") //calling method in value
	private double random;
	@Value("#{new java.lang.String('Anniiee')}") //creating new obj in value
	private String nameme;
	@Value("#{8>3}")
	private boolean isActive;
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	public Student(String studentName, String city, List<String> subjects, int marks, int random) {
		super();
		this.studentName = studentName;
		this.city = city;
		this.subjects = subjects;
		this.marks = marks;
		this.random = random;
	}

	/**
	 * @return the studentName
	 */
	public String getStudentName() {
		return studentName;
	}
	/**
	 * @param studentName the studentName to set
	 */
	public void setStudentName(String studentName) {
		this.studentName = studentName;
	}
	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}
	/**
	 * @param city the city to set
	 */
	public void setCity(String city) {
		this.city = city;
	}
	/**
	 * @return the subjects
	 */
	public List<String> getSubjects() {
		return subjects;
	}
	/**
	 * @param subjects the subjects to set
	 */
	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}
	/**
	 * @return the marks
	 */
	public int getMarks() {
		return marks;
	}
	/**
	 * @param marks the marks to set
	 */
	public void setMarks(int marks) {
		this.marks = marks;
	}
	/**
	 * @return the random
	 */
	public double getRandom() {
		return random;
	}
	/**
	 * @param random the random to set
	 */
	public void setRandom(int random) {
		this.random = random;
	}

	/**
	 * @return the nameme
	 */
	public String getNameme() {
		return nameme;
	}

	/**
	 * @param nameme the nameme to set
	 */
	public void setNameme(String nameme) {
		this.nameme = nameme;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}

	@Override
	public String toString() {
		return "Student [studentName=" + studentName + ", city=" + city + ", subjects=" + subjects + ", marks=" + marks
				+ ", random=" + random + ", nameme=" + nameme + ", isActive=" + isActive + "]";
	}

	
}
