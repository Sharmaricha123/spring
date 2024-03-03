package com.springcore.lifecycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		AbstractApplicationContext context=new ClassPathXmlApplicationContext("com/springcore/lifecycle/lifecycleconfig.xml");
		Animal animal1=(Animal)context.getBean("animal1");
		System.out.println(animal1);
		context.registerShutdownHook();
		
		
//		Bird bird1=(Bird)context.getBean("bird1");
//		System.out.println();
		
		ExampleAnnotation example1=(ExampleAnnotation)context.getBean("example1");
		System.out.println(example1);
	}

}
