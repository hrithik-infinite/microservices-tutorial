package com.contact.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.contact.entity.Contact;

@Service
public class ContactServiceImpl implements ContactService{

	List<Contact> list = List.of(
			new Contact(1L,"user1@gmail.com","Hrithik",1311L),
			new Contact(2L,"user2@gmail.com","User2",1312L),
			new Contact(3L,"user3@gmail.com","User3",1313L),
			new Contact(4L,"user4@gmail.com","User4",1314L)
			);
	
	
	@Override
	public List<Contact> getContactOfUser(Long userId) {
		// TODO Auto-generated method stub
		return list.stream().filter(contact -> contact.getUserId().equals(userId)).collect(Collectors.toList());
	}
	
	

}
