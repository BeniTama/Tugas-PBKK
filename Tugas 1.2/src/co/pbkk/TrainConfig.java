package co.pbkk;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class TrainConfig {

	@Bean
	public Driver expressTrain() {
		ExpressTrain driver1 = new ExpressTrain();
		
		return driver1;
	}
	
	@Bean
	public Driver commuterTrain() {
		CommuterTrain driver2 = new CommuterTrain();
		
		return driver2;
	}
}
