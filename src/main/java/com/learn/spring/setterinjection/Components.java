package com.learn.spring.setterinjection;

public class Components {

	private int id;
	private String name;
	
	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	@Override
	public String toString() {
		return "Components [id=" + id + ", name=" + name + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Components() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Components(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}

}
