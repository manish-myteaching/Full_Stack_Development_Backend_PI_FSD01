package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.professionalit.beans.WishMessageGenerator;

public class IOCTest {

		public static void main(String[] args) {
			   //Locate and hold spring bean cfg file
				//FileSystemResource res=new FileSystemResource("src/main/resources/applicationContext.xml");
				//create IOC container
				//XmlBeanFactory factory=new XmlBeanFactory(res);
				
			    ApplicationContext context= new ClassPathXmlApplicationContext("./applicationContext.xml");
				//get TargetBean class object
				Object obj=context.getBean("wmg");
				//type casting
				WishMessageGenerator generator=(WishMessageGenerator)obj;
				//invoke the b.method
				String result=generator.generateWishMesage("raja");
				System.out.println("Result ::"+result); 
				
			}

	}

