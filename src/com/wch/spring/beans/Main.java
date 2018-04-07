package com.wch.spring.beans;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		// Java SE 原始方法
		// HelloWorld helloWorld = new HelloWorld();
		// helloWorld.setName("Wang");
		
		//1. 創建Spring的IOC容器對象
		// ApplicationContext: 代表IOC容器
		// ClassPathXmlApplicationContext: 是實作ApplicationContext介面的類別，會從類別路徑來載入配置xml
		ApplicationContext ctx = new ClassPathXmlApplicationContext("applicationContext.xml"); 
		
		//2. 從IOC容器中獲取Bean實例
		// 利用id注入IOC容器中的bean
		HelloWorld helloWorld = (HelloWorld) ctx.getBean("helloWorld");
		// 利用類別注入IOC容器中的bean，但要求IOC容器中只能有一個該類別的bean
		//HelloWorld helloWorld = ctx.getBean(HelloWorld.class);
		System.out.println(helloWorld);

		//3. 調用hello方法
		helloWorld.hello();
		
		Car car = (Car) ctx.getBean("car");
		System.out.println(car);
		
		car = (Car) ctx.getBean("car2");
		System.out.println(car);
		
		Person person = (Person) ctx.getBean("person");
		System.out.println(person);

		//4. 關閉ApplicationContext
		((ConfigurableApplicationContext) ctx).close();
	}
}
