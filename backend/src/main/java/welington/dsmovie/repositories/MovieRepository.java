package welington.dsmovie.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import welington.dsmovie.entities.Movie;

public interface MovieRepository extends JpaRepository<Movie, Long> {

}
