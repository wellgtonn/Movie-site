package welington.dsmovie.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import welington.dsmovie.entities.Score;
import welington.dsmovie.entities.ScorePK;


public interface ScoreRepository extends JpaRepository<Score, ScorePK> {

}