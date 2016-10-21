package com.logicode;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;


/**
 * THis app is used for Auto Configuration of Spring
 *
 * The @SpringBootApplication enables Spring component-scanning and Spring Boot
 *auto-configuration. In fact, @SpringBootApplication combines three other useful
 *annotations:
 *■ Spring’s @Configuration—Designates a class as a configuration class using
 *Spring’s Java-based configuration. Although we won’t be writing a lot of configuration
 *in this book, we’ll favor Java-based configuration over XML configuration
 *when we do.
 *■ Spring’s @ComponentScan—Enables component-scanning so that the web controller
 *classes and other components you write will be automatically discovered
 *and registered as beans in the Spring application context. A little later in this
 *chapter, we’ll write a simple Spring MVC controller that will be annotated with
 *@Controller so that component-scanning can find it.
 *■ Spring Boot’s @EnableAutoConfiguration—This humble little annotation might
 *as well be named @Abracadabra because it’s the one line of configuration that
 *enables the magic of Spring Boot auto-configuration. This one line keeps you
 *from having to write the pages of configuration that would be required otherwise.
 * In older versions of Spring Boot, you’d have annotated the ReadingListApplication
 *class with all three of these annotations. But since Spring Boot 1.2.0, @SpringBoot-
 *Application is all you need.
 */
@SpringBootApplication
public class LogicodeWebAppApplication extends WebMvcConfigurerAdapter {

	public static void main(String[] args) {

        /**@SpringApplication.run
         * It passes a reference to the LogicodeWebAppApplication
         *class to SpringApplication.run(), along with the command-line arguments, to kick
         *off the application.
         */
        SpringApplication.run(LogicodeWebAppApplication.class, args);
	}

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addRedirectViewController("/", "/userList");
    }
}
