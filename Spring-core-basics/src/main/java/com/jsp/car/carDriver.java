package com.jsp.car;

import org.springframework.beans.factory.BeanFactory;

import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;

import com.jsp.pen.Pen;

public class carDriver {
	
	public static void main(String[] args) {
//		ApplicationContext applicationContext= new ClassPathXmlApplicationContext("myspring.xml");
//		Car car = (Car)applicationContext.getBean("myCar");
//		car.printCarDetails();
//		
//		
		
		
		ClassPathResource classPathResource= new ClassPathResource("myspring.xml");
		
		BeanFactory beanFactory= new XmlBeanFactory(classPathResource);
		Car c= (Car) beanFactory.getBean("myCar");
			c.printCarDetails();
	}

}
