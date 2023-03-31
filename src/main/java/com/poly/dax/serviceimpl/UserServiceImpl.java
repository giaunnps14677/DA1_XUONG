package com.poly.dax.serviceimpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.poly.dax.model.User;
import com.poly.dax.repository.UserRepository;
import com.poly.dax.service.UserService;

@Service
public class UserServiceImpl implements UserService{
	private final UserRepository userRepository;

	public UserServiceImpl(UserRepository userRepository) {
	       this.userRepository = userRepository;
	   }
	
	@Override
	public List<User> getAllUser() {
		return (List<User>) userRepository.findAll();
	}
	
}
