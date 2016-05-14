package demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.context.web.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@SpringBootApplication
@RestController
@ComponentScan
@EnableAutoConfiguration
public class SayHello extends SpringBootServletInitializer {

	public static void main(String[] args) {
		SpringApplication.run(SayHello.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder){
		return builder.sources(SayHello.class); 
	}

	
	@RequestMapping("/{name}")
	public String hello(@PathVariable String name){
		return "Hello "+ name+" !";
		
	}
	
}
