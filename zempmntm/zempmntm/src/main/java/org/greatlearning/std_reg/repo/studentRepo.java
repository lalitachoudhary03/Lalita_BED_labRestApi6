package org.greatlearning.std_reg.repo;

import org.greatlearning.std_reg.entity.Student;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface studentRepoextends JpaRepository<Student, Integer> {
 

}
