package com.infopine.ItemMasterRequirements.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.infopine.ItemMasterRequirements.Repository.ItemRepository;
import com.infopine.ItemMasterRequirements.entity.Item;

@Service
public class ItemService {
	@Autowired
	private ItemRepository repository;
	
	//getting all items record by using the method findaAll() of CrudRepository  
	public List<Item> getAllItems()   
	{  
	List<Item> items = new ArrayList<Item>();  
	repository.findAll().forEach(items1 -> items.add(items1));  
	return items;  
	}  
	//getting a specific record by using the method findById() of CrudRepository  
	public Item getItemssById(int id)   
	{  
	return repository.findById(id).get();  
	}  
	//saving a specific record by using the method save() of CrudRepository  
	public void saveOrUpdate(Item items)   
	{  
	repository.save(items);  
	}  
	//deleting a specific record by using the method deleteById() of CrudRepository  
	public void delete(int id)   
	{  
	repository.deleteById(id);  
	}  
	//updating a record  
	public void update(Item item, int id)   
	{  
	repository.save(item);  
	} 
}
