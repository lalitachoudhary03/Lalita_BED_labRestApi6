package org.greatlearning.std_reg.repo;

import java.util.Optional;

import org.greatlearning.std_reg.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<User, Long>{
	//Adding a find by username method
		Optional<User> findByUsername(String username);

}
