package com.hexaware.springrestjpa.restcontroller;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.hexaware.springrestjpa.entities.User;
import com.hexaware.springrestjpa.service.IUserService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/User")
public class UserRestController {
	@Autowired
	IUserService Service;
	
	
	 @PostMapping("/add")
	    public User addUser(@RequestBody @Valid User user) {
	        return Service.addUser(user);
	    }
	 @PutMapping("/update")
	    public User updateUser(@RequestBody @Valid User user) {
	        return Service.updateUser(user);
	    }
	 
	 @GetMapping("/get/{userId}")
	    public User getUserById(@PathVariable long userId) {
	        return Service.getUserById(userId);
	    }

	    @DeleteMapping("/delete/{userId}")
	    public String deleteUserById(@PathVariable long userId) {
	        return Service.deleteUserById(userId);
	    }
	    
	    @GetMapping("/getall")
	    public List<User> getAllUsers() {
	        return Service.getAllUsers();
	    }

	    @GetMapping("/getbyusername/{userName}")
	    public List<User> getByUserName(@PathVariable String userName) {
	        return Service.getByUserName(userName);
	    }
	    @GetMapping("/getbyemail/{email}")
	    public List<User> getByEmail(@PathVariable String email) {
	        return Service.getByEmail(email);
	    }

	    @GetMapping("/getbycontactnumber/{contactNumber}")
	    public List<User> getByContactNumber(@PathVariable String contactNumber) {
	        return Service.getByContactNumber(contactNumber);
	    }
	    
	   
}
