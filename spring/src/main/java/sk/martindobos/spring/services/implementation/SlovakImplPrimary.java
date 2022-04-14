package sk.martindobos.spring.services.implementation;

import org.springframework.context.annotation.Primary;
import org.springframework.context.annotation.Profile;
import org.springframework.stereotype.Service;
import sk.martindobos.spring.services.ExampleService;

@Service
@Primary
@Profile("svk")
public class SlovakImplPrimary implements ExampleService {
    @Override
    public void printSomething() {
        System.out.println("niečo po slovensky");
    }
}
