package com.learn.spring.referencetypeinjection;

public class A {

	private String x;
	private B b;
	/**
	 * @return the x
	 */
	public String getX() {
		return x;
	}
	/**
	 * @param x the x to set
	 */
	public void setX(String x) {
		this.x = x;
	}
	/**
	 * @return the b
	 */
	public B getB() {
		return b;
	}
	/**
	 * @param b the b to set
	 */
	public void setB(B b) {
		this.b = b;
	}
	@Override
	public String toString() {
		return "A [x=" + x + ", b=" + b + "]";
	}
	
}
