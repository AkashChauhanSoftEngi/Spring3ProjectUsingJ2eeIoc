package com.java.spring;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {
	@SuppressWarnings("rawtypes")
	public static void main(String[] args) throws InstantiationException, IllegalAccessException, IllegalArgumentException, InvocationTargetException {

		/*If you want to use advance IOC, here we are using J2EE IOC*/
		ApplicationContext ap = new ClassPathXmlApplicationContext("applicationContext.xml");
		
		/*Only one object is created as by default it is singleton*/
		Student student1=(Student)ap.getBean("studentbean"); /*Reading From XML File*/
		student1.displayInfo();
		
		/*Spring also access private constructors of the class*/
		Teacher teacher =(Teacher) ap.getBean("teacherbean"); /*Reading From XML File*/
		teacher.displayInfo();

		/*To Access private Constructors*/
		try {
			Class c = Class.forName("com.java.spring.Teacher");
			Constructor con[] = c.getDeclaredConstructors();
			con[0].setAccessible(true); //To make constructor public
			con[0].newInstance();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
			}
}
