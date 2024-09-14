package prog.web.pruebas;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.Bean;
import org.springframework.web.client.RestTemplate;

@SpringBootApplication
public class PruebasApplication extends SpringBootServletInitializer {

	public static void main (String [] args) {
		SpringApplication.run (PruebasApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure (SpringApplicationBuilder application) {
		return application.sources (PruebasApplication.class);
	}

	@Bean
	RestTemplate getRestTemplate () {
		return new RestTemplate ();
	}
}
