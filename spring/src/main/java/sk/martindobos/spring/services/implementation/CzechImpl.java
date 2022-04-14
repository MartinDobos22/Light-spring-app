package sk.martindobos.spring.services.implementation;

import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import sk.martindobos.spring.services.ExampleService;

@Service
@Profile("cze")
public class CzechImpl implements ExampleService {
    @Override
    public void printSomething() {
        System.out.println("neco po cesky");
    }
}
