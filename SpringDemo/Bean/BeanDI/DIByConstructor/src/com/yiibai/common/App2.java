package com.yiibai.common;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App2 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = 
    	  new ClassPathXmlApplicationContext(new String[] {"Spring-Customer.xml"});

    	Customer cust = (Customer)context.getBean("CustomerBean");
    	System.out.println(cust);
    }
}
