package co.pbkk;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class CarDealer {

	public static void main(String[] args) {
		
		Resource resource = new ClassPathResource("usedcars.xml");
		BeanFactory factory = new XmlBeanFactory(resource);
		
		Car c1 = (Car)factory.getBean("car1");
		Car c2 = (Car)factory.getBean("car2");
		
		System.out.println("Car 1 Details: "+c1);
		System.out.println("Car 2 Details: "+c2);
	}
}
