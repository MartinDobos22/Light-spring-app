package sk.martindobos.spring.services.implementation;

import sk.martindobos.spring.services.ExampleService;

public class HelloServiceFactory {

    public ExampleService blah(String language){
        switch(language){
            case "eng":
                return new EnglishImpl();
            case "svk":
                return new SlovakImplPrimary();
            case "cze":
                return new CzechImpl();
        }

        return null;
    }
}
