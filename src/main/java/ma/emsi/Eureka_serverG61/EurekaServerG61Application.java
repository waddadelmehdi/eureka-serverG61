package ma.emsi.Eureka_serverG61;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;
@EnableEurekaServer
@SpringBootApplication
public class EurekaServerG61Application {

	public static void main(String[] args) {
		SpringApplication.run(EurekaServerG61Application.class, args);
	}

}
