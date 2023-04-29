package com.greatlearning.std_reg.serviceInterface;

import java.util.List;

import org.greatlearning.std_reg.entity.Student;

public interface StudentServiceInterface {

	public Student findById(int theId);

	public List<Student> findAll();

	public Student save(Student student);

	public void deleteById(int id);


}
