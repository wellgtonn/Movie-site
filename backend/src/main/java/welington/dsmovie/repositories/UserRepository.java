package welington.dsmovie.repositories;


import org.springframework.data.jpa.repository.JpaRepository;

import welington.dsmovie.entities.User;

public interface UserRepository extends JpaRepository<User, Long> {

	User findByEmail(String email);
}