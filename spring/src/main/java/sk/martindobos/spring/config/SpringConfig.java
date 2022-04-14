package sk.martindobos.spring.config;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;
import org.springframework.context.annotation.PropertySources;
import sk.martindobos.spring.services.implementation.PrintService;

@Configuration
@PropertySources({
        @PropertySource("classpath:spring.properties"),
        @PropertySource("")
})
public class SpringConfig {

    @Value("${spring.name}")
    String name;
    @Value("${spring.name}")
    String surname;


    @Bean
    public PrintService printService() {
        PrintService printService = new PrintService();
        printService.setData(name + " " + surname);
        return printService;
    }

}
