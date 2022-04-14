package sk.martindobos.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
import sk.martindobos.spring.services.implementation.HelloServiceFactory;

@Configuration
public class ExampleConfig {

    public HelloServiceFactory createFactory(){
        return new HelloServiceFactory();
    }

    @Bean
    @Profile("cze")
    public HelloServiceFactory czech(HelloServiceFactory helloService){
        return (HelloServiceFactory) helloService.blah("cze");
    }

}
