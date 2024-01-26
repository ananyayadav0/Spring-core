package com.learn.spring.lifecycle;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class AnnotationSamosa {

	private int price;

	public AnnotationSamosa() {
		super();
		// TODO Auto-generated constructor stub
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	@Override
	public String toString() {
		return "AnnotationSamosa [price=" + price + "]";
	}
	@PostConstruct
	public void init() // can be any name( hey, yo, whatever) , initialize name in bean correctly
	{
		System.out.println("annotation:inside init");
	}
	@PreDestroy
	public void destroy()// can be any name( hey, yo, whatever) , initialize name in bean correctly
	{
		System.out.println("annotation:inside destroy");
	}
	
	/* to use annotations, need to add javax-annotation dependency since these anntations are deprecated in java version above java8
	 * enable annotations in sprinBeans.xml using <context:annotation-config /> because they are by default deisabled.
	 * or add <bean class="org.springframework.context.annotation.CommonAnnotationBeanPostProcessor"/> to springBean.xml to enable PostConstruct and PreDestroy
	 */
}
