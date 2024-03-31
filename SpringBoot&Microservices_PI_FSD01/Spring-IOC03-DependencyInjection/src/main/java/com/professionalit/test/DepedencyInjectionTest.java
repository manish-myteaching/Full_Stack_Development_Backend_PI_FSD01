package com.professionalit.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.FileSystemResource;

import com.professionalit.beans.Person;
import com.professionalit.beans.Person1;

public class DepedencyInjectionTest {

	public static void main(String[] args) {
          // create IOC container
		ApplicationContext context= new ClassPathXmlApplicationContext("./applicationContext.xml");
		//XmlBeanFactory  factory=new XmlBeanFactory(new FileSystemResource("src/com/nt/cfgs/applicationContext.xml"));
		//get Spring bean class obj
		Person person=(Person)context.getBean("per");
		System.out.println(person);
		System.out.println("=======================");
		//get Spring bean class obj
		Person1 person1=(Person1)context.getBean("per1");
		System.out.println(person1);


	}

}
