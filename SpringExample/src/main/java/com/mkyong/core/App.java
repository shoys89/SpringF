package com.mkyong.core;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {

    ApplicationContext context = new ClassPathXmlApplicationContext(
				"SpringBeans.xml");
 
			HelloWorld obj = (HelloWorld) context.getBean("helloBean");
		obj.printHello();
    
    	
    	String name="erlitan";
        System.out.println( "Hello " + name);
    }
}
