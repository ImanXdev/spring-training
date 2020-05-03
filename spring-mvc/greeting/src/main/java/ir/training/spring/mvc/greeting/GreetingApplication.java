package ir.training.spring.mvc.greeting;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class GreetingApplication {

	public static void main(String[] args) {
		SpringApplication.run(GreetingApplication.class, args);
	}

}
