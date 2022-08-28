package com.user.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.user.entity.User;

@Service
public class UserServiceImpl implements UserService {
	
	//test user list
		List<User> list = List.of(
				new User(1311L,"Hrithik","123456"),
				new User(1312L,"user2","22222"),
				new User(1313L,"user3","333333")
				);
		

	@Override
	public User getUser(Long id) {
		// TODO Auto-generated method stub
		return list.stream().filter(user -> user.getUserId().equals(id)).findAny().orElse(null);
	}
	
	

}
