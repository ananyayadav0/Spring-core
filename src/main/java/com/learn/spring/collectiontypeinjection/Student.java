package com.learn.spring.collectiontypeinjection;

import java.util.List;
import java.util.Map;
import java.util.Properties;
import java.util.Set;

public class Student {

	private String name;
	private List<String> subjects;
	private Set<String> courseId;
	private Map<String, String> other;
	private Properties props;
	
	public Properties getProps() {
		return props;
	}
	public void setProps(Properties props) {
		this.props = props;
	}
	public Student() {
		super();
		// TODO Auto-generated constructor stub
	}
	public String getName() {
		return name;
	}
	public Student(String name, List<String> subjects, Set<String> courseId, Map<String, String> other,
			Properties props) {
		super();
		this.name = name;
		this.subjects = subjects;
		this.courseId = courseId;
		this.other = other;
		this.props = props;
	}
	public void setName(String name) {
		this.name = name;
	}
	public List<String> getSubjects() {
		return subjects;
	}
	public void setSubjects(List<String> subjects) {
		this.subjects = subjects;
	}
	public Set<String> getCourseId() {
		return courseId;
	}
	public void setCourseId(Set<String> courseId) {
		this.courseId = courseId;
	}
	public Map<String, String> getOther() {
		return other;
	}
	public void setOther(Map<String, String> other) {
		this.other = other;
	}
	@Override
	public String toString() {
		return "Student [name=" + name + ", subjects=" + subjects + ", courseId=" + courseId + ", other=" + other
				+ ", props=" + props + "]";
	}
	
}
