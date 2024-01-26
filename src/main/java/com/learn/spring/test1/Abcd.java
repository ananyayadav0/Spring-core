package com.learn.spring.test1;

public class Abcd {

	private int a;
	private String b;
	public Abcd() {
		super();
		System.out.println("in default constructor");
		// TODO Auto-generated constructor stub
	}
	public Abcd(int a, String b) {
		super();
		this.a = a;
		this.b = b;
		System.out.println("in parametrised constructor");
	}
	/**
	 * @return the a
	 */
	public int getA() {
		return a;
	}
	/**
	 * @param a the a to set
	 */
	public void setA(int a) {
		System.out.println("in setter A");
		this.a = a;
	}
	/**
	 * @return the b
	 */
	public String getB() {
		return b;
	}
	/**
	 * @param b the b to set
	 */
	public void setB(String b) {
		System.out.println("in setter B");
		this.b = b;
	}
	@Override
	public String toString() {
		return "Abcd [a=" + a + ", b=" + b + "]";
	}
	
}
