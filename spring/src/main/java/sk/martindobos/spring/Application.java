package sk.martindobos.spring;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import sk.martindobos.spring.services.implementation.PrintService;
import somepackage.idk;

@SpringBootApplication
@ComponentScan(basePackages = {"main"})
public class Application {

	public static void main(String[] args) {

		/*
		ApplicationContext applicationContext = SpringApplication.run(Application.class, args);
		AppRun appRun = applicationContext.getBean(AppRun.class);
		appRun.run();
		 */

		//SpringApplication.run(Application.class, args);

		/*
		ApplicationContext applicationContext = SpringApplication.run(Application.class, args);
		String random = applicationContext.getBean(idk.class).random();
		System.out.println(random);
		 */
		ApplicationContext applicationContext = SpringApplication.run(Application.class, args);
		applicationContext.getBean(PrintService.class).print();



	}
}
