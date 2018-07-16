# Spring3ProjectUsingJ2eeIoc

* Spring 3 + J2EE (J2EE Container), Example
* This container is called eager containe. 
* Used ApplicationContext Interface, and used ClassPathXmlApplicationContext Implementation class
* When using ClassPathXmlApplicationContext as J2EE Container and in case of singleton scope the object is created
  when applicationContext.xml is loading. If scope is prototype then ApplicationContext also behave like XmlBeanFactory and load on demand   only.
* Used applicationContext.xml for defining beans
* Spring requires Spring JAR/Libraries and JDK Libraries to run an Spring based application 
* We need a driver class [ClassPathXmlApplicationContext] to run Spring container[IOC], which implements ApplicationContext Interface

```XML
 	<bean id="studentbean" class="com.java.spring.Student">  
    		<property name="name" value="Vimal Jaiswal"></property>  
  	</bean>
```

> **###1. Advantages**
```text
  1-Instantiate all the objects while loading applicationContext.xml into IOC container, when scope is singleton
  2-If the scope is Prototype then ApplicationContext also behave like BeanFactory, become on demand
    Only when scope is default or Singleton then it behaves eagerly otherwise lazy one or same as BeanFactory
  3-It provides access to value/data stored in property files [you can store static data in property files]
```

```java
	ApplicationContext factory = new ClassPathXmlApplicationContext("applicationContext.xml");
```

> **###2. Technologies**
* Spring 3.0.1.RELEASE
