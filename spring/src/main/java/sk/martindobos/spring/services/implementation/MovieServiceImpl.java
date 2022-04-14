package sk.martindobos.spring.services.implementation;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import sk.martindobos.spring.models.Movie;
import sk.martindobos.spring.repositories.MovieRepository;
import sk.martindobos.spring.services.MovieService;

//@service je povinná -> treba bean označenie
@Service
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class MovieServiceImpl implements MovieService {

    MovieRepository movieRepository;

    public MovieServiceImpl(MovieRepository movieRepository) {
        this.movieRepository = movieRepository;
    }

    @Override
    public Movie createAndAddMovie() {
        Movie movie = new Movie();
        movie.setName("Fast And Furious");

        return movieRepository.save(movie);
    }
}
