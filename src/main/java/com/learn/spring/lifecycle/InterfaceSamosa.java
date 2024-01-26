package com.learn.spring.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class InterfaceSamosa implements InitializingBean, DisposableBean{

	private int price;

	public InterfaceSamosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public InterfaceSamosa(int price) {
		super();
		this.price = price;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "InterfaceSamosa [price=" + price + "]";
	}

	@Override
	public void destroy() throws Exception {
		System.out.println("destroy:interface");
		
	}

	@Override
	public void afterPropertiesSet() throws Exception {
		System.out.println("afterPropertiesSet:interface");
		
	}

	
	
}
