package com.yiibai.common;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.yiibai.output.OutputHelper;

public class App {
	public static void main(String[] args) {
		ApplicationContext context = new ClassPathXmlApplicationContext(
				"applicationContext.xml");

		OutputHelper output = (OutputHelper)context.getBean("OutputHelper");
    	output.generateOutput();
	}
}