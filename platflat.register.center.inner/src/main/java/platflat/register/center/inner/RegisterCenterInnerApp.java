package platflat.register.center.inner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
@EnableConfigServer  
@SpringBootApplication
public class RegisterCenterInnerApp {
	public static void main(String[] args) {
		SpringApplication.run(RegisterCenterInnerApp.class, args);
	}
}
