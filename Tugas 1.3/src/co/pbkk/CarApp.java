package co.pbkk;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class CarApp {

	public static void main(String[] args) {
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("usedcars.xml");
		Car c1 = context.getBean("c1", Driver.class);
		Car c2 = context.getBean("c2", Driver.class);
		
		System.out.println("Car 1 Details: "+c1);
		System.out.println("Car 2 Details: "+c2);
		
		context.close();
	}
}
