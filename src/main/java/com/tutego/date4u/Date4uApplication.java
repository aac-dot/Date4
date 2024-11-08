package com.tutego.date4u;

import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.slf4j.LoggerFactory;
import org.slf4j.Logger;
import java.util.Arrays;

@SpringBootApplication
public class Date4uApplication {

	private static final Logger log = LoggerFactory.getLogger("Date4u");
	public static void main(String[] args) {
		/* log.info("Parameters {}", 1);
		log.error("This is a message from error log");
		log.debug("This is a debug message");
		
		ApplicationContext ctx = SpringApplication.run(Date4uApplication.class, args);
		// SpringApplication.run(Date4uApplication.class, args);
		Arrays.stream(ctx.getBeanDefinitionNames()).sorted().forEach(System.out::println); */
		/* SpringApplication app = new SpringApplication(Date4uApplication.class);
		
		app.setHeadless(true);
		app.setBannerMode(Banner.Mode.OFF);
		app.setLogStartupInfo(false);

		app.run(args); */

		/* ConfigurableApplicationContext ctx = SpringApplication.run(
			Date4uApplication.class, args);
		 */

		ApplicationContext ctx = SpringApplication.run(Date4uApplication.class, args);
		Arrays.stream(ctx.getBeanDefinitionNames())
		.filter(name -> name.equals(ctx.getBean("date4UApplication").toString())).forEach(System.out::println);
	}

	private static void display(String name) {
		System.out.println("Bean: " + name);
	}

}
