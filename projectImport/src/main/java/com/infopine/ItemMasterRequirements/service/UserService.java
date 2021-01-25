package com.infopine.ItemMasterRequirements.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infopine.ItemMasterRequirements.Repository.UserRepository;
import com.infopine.ItemMasterRequirements.entity.User;

@Service
public class UserService {
	@Autowired
	private UserRepository repository;
	//getting all items record by using the method findaAll() of CrudRepository  
		public List<User> getAllUsers()   
		{  
		List<User> users = new ArrayList<User>();  
		repository.findAll().forEach(users1 -> users.add(users1));  
		return users;  
		}  
		//getting a specific record by using the method findById() of CrudRepository  
		public User getUsersById(int id)   
		{  
		return repository.findById(id).get();  
		}  
		//saving a specific record by using the method save() of CrudRepository  
		public void saveOrUpdate(User users)   
		{  
		repository.save(users);  
		}  
		//deleting a specific record by using the method deleteById() of CrudRepository  
		public void delete(int id)   
		{  
		repository.deleteById(id);  
		}  
		//updating a record  
		public void update(User user, int id)   
		{  
		repository.save(user);  
		} 

}
