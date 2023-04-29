package org.greatlearning.std_reg.service;

import java.util.List;

import org.greatlearning.std_reg.entity.Student;
import org.greatlearning.std_reg.repo.StudentRepo;
import org.greatlearning.std_reg.serviceInterface.StudentServiceInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
	@Autowired
	private StudentRepo studentRepo;

	@Override
	public Student findById(int theId) {
		return this.studentRepo.findById(theId).orElseThrow(() -> new IllegalArgumentException("inavlid id"));
	}

	@Override
	public List<Student> findAll() {
		return this.studentRepo.findAll();
	}

	@Override
	public Student save(Student student) {
		return this.studentRepo.save(student);

	}

	@Override
	public void deleteById(int id) {
		this.studentRepo.deleteById(id);

	}

}
}
