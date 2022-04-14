package sk.martindobos.spring;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;
import sk.martindobos.spring.services.ExampleService;
import sk.martindobos.spring.services.MovieService;

@Component
public class AppRun {

    //different type of dependency injected
    //pri chýbaní @Autowired -> hodí nullpointerException

    //inject
    @Autowired
    MovieService movieService;

    /*
    @Autowired
    @Qualifier("slovakImplPrimary")
    ExampleService exampleService;
     */


    /*
    //inject
    public AppRun(MovieService movieService) {
        this.movieService = movieService;
    }
     */

    /*
    //inject
    @Autowired
    public void setMovieService(MovieService movieService) {
        this.movieService = movieService;
    }
     */

    public void run(){
        movieService.createAndAddMovie();
        //exampleService.printSomething();
    }
}
