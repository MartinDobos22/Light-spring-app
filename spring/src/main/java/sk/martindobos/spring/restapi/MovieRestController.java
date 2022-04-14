package sk.martindobos.spring.restapi;

import sk.martindobos.spring.models.Movie;
import sk.martindobos.spring.repositories.MovieRepository;
import sk.martindobos.spring.services.MovieService;

import java.util.List;

@RestController
@RequestMapping("/api")
public class MovieRestController {

    MovieRepository movieRepository;

    public MovieRestController(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @GetMapping("/movies")
    List<Movie> all(){
        return movieRepository.findAll();
    }
}
