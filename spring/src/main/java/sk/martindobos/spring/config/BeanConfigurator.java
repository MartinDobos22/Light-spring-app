package sk.martindobos.spring.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import somepackage.idk;

@Configuration
public class BeanConfigurator {

    @Bean
    public idk meh(){
        return new idk();
    }
}
