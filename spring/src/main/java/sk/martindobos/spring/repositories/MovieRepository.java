package sk.martindobos.spring.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;
import sk.martindobos.spring.models.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {


}
