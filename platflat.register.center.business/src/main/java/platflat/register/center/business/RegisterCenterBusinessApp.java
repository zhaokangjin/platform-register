package platflat.register.center.business;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@EnableConfigServer  
@SpringBootApplication
public class RegisterCenterBusinessApp {
	public static void main(String[] args) {
		SpringApplication.run(RegisterCenterBusinessApp.class, args);
	}
}
