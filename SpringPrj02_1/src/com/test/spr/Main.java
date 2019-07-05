package com.test.spr;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main
{
	public static void main(String[] args)
	{
		ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		RecordView view = context.getBean("view", RecordViewImpl.class);
		
		view.input();
		view.output();
	}
}
