package com.infopine.ItemMasterRequirements.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.infopine.ItemMasterRequirements.entity.User;
import com.infopine.ItemMasterRequirements.service.UserService;

@RestController
public class UserController {
	@Autowired
	private UserService service;
	//creating post mapping that post the User detail in the database  
			@PostMapping("/Users")  
			private int saveUser(@RequestBody User users)   
			{  
			service.saveOrUpdate(users);  
			return users.getId(); 
			}  
			
		//creating a get mapping that retrieves all the Users detail from the database
		
		@GetMapping("/users")  
		private List<User> getAllUsers()   
		{  
		return service.getAllUsers();
		}  
		
		
		//creating a get mapping that retrieves the detail of a specific User
		
		@GetMapping("/User/{userId}")  
		private User getItems(@PathVariable("userId") int userId)   
		{  
		return service.getUsersById(userId);
		} 
		
		
		
		//creating a delete mapping that deletes a specified User 
		@DeleteMapping("/User/{userId}")  
		private void deleteUser(@PathVariable("userId") int userId)   
		{  
		service.delete(userId);
		}  
		
		//creating put mapping that updates the User detail   
		@PutMapping("/users")  
		private User update( @RequestBody User users)
		{
			service.saveOrUpdate(users);
		return users;
		}  


}
