package com.learn.spring.lifecycle;

public class Samosa {

	private int price;

	public Samosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @return the price
	 */
	public int getPrice() {
		return price;
	}

	/**
	 * @param price the price to set
	 */
	public void setPrice(int price) {
		System.out.println("Obj created");
		this.price = price;
	}

	@Override
	public String toString() {
		return "Samosa [price=" + price + "]";
	}
	
	public void init() // can be any name( hey, yo, whatever) , initialize name in bean correctly
	{
		System.out.println("inside init");
	}
	public void destroy()// can be any name( hey, yo, whatever) , initialize name in bean correctly
	{
		System.out.println("inside destroy");
	}
}
