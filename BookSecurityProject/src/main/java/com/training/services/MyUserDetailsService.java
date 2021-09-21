package com.training.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.training.bean.MyUserDetails;
import com.training.bean.User;
import com.training.repo.UserRepo;

@Service
public class MyUserDetailsService implements UserDetailsService {
	
	@Autowired
	private UserRepo userRepo;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		//System.out.println("Username Entered.."+username);
		 User user=null;
		Optional<User> opUser = userRepo.findById(username);
		if(opUser.isPresent())
			user = opUser.get();
		
		
		return new MyUserDetails(user);
		
		
	}

}
