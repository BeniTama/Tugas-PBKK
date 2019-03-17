package co.pbkk;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TrainApp {

	public static void main(String[] args) {
		AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(TrainConfig.class);
		Driver driver1 = context.getBean("expressTrain", Driver.class);
		Driver driver2 = context.getBean("commuterTrain", Driver.class);
		
		driver1.drive("Kindersville");
		driver2.drive("Waterloo");
		
		context.close();
	}
}
