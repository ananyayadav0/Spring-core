package com.learn.spring.javaconfigNoXml;

/*
 * not using component
 */
public class Pupil {

private Samosa samosa;
	
	public Pupil(Samosa samosa) {
		super();
		this.samosa = samosa;
	}

	public Samosa getSamosa() {
		return samosa;
	}

	public void setSamosa(Samosa samosa) {
		this.samosa = samosa;
	}
	
	public void studying() {
		samosa.samosaCall();
		System.out.println("Pupil is studying");
	}
}
