package com.hexaware.springrestjpa.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;

import com.hexaware.springrestjpa.entities.User;

import jakarta.transaction.Transactional;

@SpringBootTest
@Transactional
class UserServiceImpTest {
	
	@Autowired
	IUserService service;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	@Rollback(false)
	public void testaddUser() {
	    User user = new User(1L, "JohnDoe", "password", "john.doe@example.com",
	            "John", "Doe", "1234567890", "Some Address");

	    User insertedUser = service.addUser(user);

	    assertNotNull(insertedUser);
	    assertEquals(user.getUserId(), insertedUser.getUserId());
	    assertEquals(user.getUserName(), insertedUser.getUserName());
	    assertEquals(user.getPassword(), insertedUser.getPassword());
	    assertEquals(user.getEmail(), insertedUser.getEmail());
	    assertEquals(user.getFirstName(), insertedUser.getFirstName());
	    assertEquals(user.getLastName(), insertedUser.getLastName());
	    assertEquals(user.getContactNumber(), insertedUser.getContactNumber());
	    assertEquals(user.getAddress(), insertedUser.getAddress());
	}

	@Test
	void testUpdateUser() {
		
	}
	@Test
	@Rollback(false)
	public void testGetAllUsers() {
	    List<User> userList = service.getAllUsers();

	    assertFalse(userList.isEmpty());
	}
	@Test
	void testGetByUserName() {
	    // Assuming you have a user with the specified username
	    String userName = "JohnDoe";

	    // Get users by username
	    List<User> users = service.getByUserName(userName);

	    // Assert that the list is not empty
	    assertFalse(users.isEmpty());

	   
	    
	}


	@Test
	void testGetByEmail() {
	    // Assuming you have a user with the specified email
	    String email = "john.doe@example.com";

	    // Get users by email
	    List<User> users = service.getByEmail(email);

	    // Assert that the list is not empty
	    assertFalse(users.isEmpty());

	  
	}
	@Test
	void testGetByContactNumber() {
	    // Assuming you have a user with the specified contact number
	    String contactNumber = "1234567890";

	    // Get users by contact number
	    List<User> users = service.getByContactNumber(contactNumber);

	    // Assert that the list is not empty
	    assertFalse(users.isEmpty());

	    	}

	@Test
	@Rollback(false)
	void testGetUserById() {
	    // Assuming you have a user with ID 1
	    long userId = 1L;

	    // Get the user by ID
	    User user = service.getUserById(userId);

	    // Perform assertions
	    assertNotNull(user);
	    assertEquals(userId, user.getUserId());
	    assertEquals("JohnDoe", user.getUserName());
	    assertEquals("john.doe@example.com", user.getEmail());
	    
	}

	@Test
	@Rollback(false)
	void testDeleteUserById() {
	    // Assuming you have a user with ID 1 to delete
	    long userIdToDelete = 1L;

	    // Delete the user
	    service.deleteUserById(userIdToDelete);

	    // Check if the user is not present after deletion
	    User deletedUser = service.getUserById(userIdToDelete);
	    assertNull(deletedUser);
	}
}
