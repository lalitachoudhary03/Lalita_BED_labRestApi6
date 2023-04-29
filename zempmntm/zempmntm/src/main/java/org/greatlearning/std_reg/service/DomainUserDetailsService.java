package org.greatlearning.std_reg.service;

import org.greatlearning.std_reg.entity.DomainUserDetails;
import org.greatlearning.std_reg.repo.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class DomainUserDetailsService  implements UserDetailService {

	@Autowired
	private UserRepo userRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		return this.userRepo.findByUsername(username).map(DomainUserDetails::new)
				.orElseThrow(() -> new UsernameNotFoundException("Wrong credentials"));
	}


}
