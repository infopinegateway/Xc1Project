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

import com.infopine.ItemMasterRequirements.entity.Item;
import com.infopine.ItemMasterRequirements.service.ItemService;

@RestController
public class ItemController {
	@Autowired
	private ItemService service;
	
	
	//creating post mapping that post the Items detail in the database  
		@PostMapping("/Items")  
		private int saveItem(@RequestBody Item items)   
		{  
		service.saveOrUpdate(items);  
		return items.getId(); 
		}  
		
	//creating a get mapping that retrieves all the items detail from the database
	
	@GetMapping("/items")  
	private List<Item> getAllBooks()   
	{  
	return service.getAllItems();  
	}  
	
	
	//creating a get mapping that retrieves the detail of a specific item
	
	@GetMapping("/Item/{itemId}")  
	private Item getItems(@PathVariable("itemId") int itemId)   
	{  
	return service.getItemssById(itemId);
	} 
	
	
	
	//creating a delete mapping that deletes a specified Item 
	@DeleteMapping("/item/{itemId}")  
	private void deleteItem(@PathVariable("itemId") int itemId)   
	{  
	service.delete(itemId);
	}  
	
	//creating put mapping that updates the Item detail   
	@PutMapping("/items")  
	private Item update(@RequestBody Item items)   
	{  
	service.saveOrUpdate(items);
	return items;  
	}  

}
