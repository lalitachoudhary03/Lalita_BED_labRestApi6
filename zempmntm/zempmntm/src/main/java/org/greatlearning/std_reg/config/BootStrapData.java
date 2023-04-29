package org.greatlearning.std_reg.config;

import org.greatlearning.std_reg.entity.Role;
import org.greatlearning.std_reg.entity.Student;
import org.greatlearning.std_reg.entity.User;
import org.greatlearning.std_reg.repo.StudentRepo;
import org.greatlearning.std_reg.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.context.event.ApplicationReadyEvent;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.event.EventListener;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.transaction.annotation.Transactional;





@Configuration
public class BootStrapData {
	@Autowired
	private StudentRepo studentRepo;
	@Autowired
	private UserRepo userRepo;
	@Autowired
	private PasswordEncoder passwordEncoder;

	// Dummy data for student table
	@EventListener(ApplicationReadyEvent.class)
	@Transactional
	public void initializeData(ApplicationReadyEvent readyEvent) {
		Student Suresh = new Student("Suresh", "Reddy", "B.Tech", "India");
		Student Marali = new Student("Marali", "Mohan", "B.Arch", "Canada");
		Student Daniel = new Student("Daniel", "Denson", "B.Tech", "New Zealand");
		Student Tanya = new Student("Tanya", "Gupta", "B.Com", "USA");

		this.studentRepo.save(Suresh);
		this.studentRepo.save(Marali);
		this.studentRepo.save(Daniel);
		this.studentRepo.save(Tanya);
	}

	// Dummy data for users and roles
	@EventListener(ApplicationReadyEvent.class)
	@Transactional
	public void initializeUsersData(ApplicationReadyEvent readyEvent) {
		User shahid = new User("lalita", passwordEncoder.encode("lalita"));
		User sam = new User("sam", passwordEncoder.encode("sam"));

		Role userRole = new Role("ROLE_USER");
		Role adminRole = new Role("ROLE_ADMIN");

		lalita.addrole(userRole);

		sam.addRole(adminRole);

		this.userRepo.save(sam);
		this.userRepo.save(lalita);
	}
}

