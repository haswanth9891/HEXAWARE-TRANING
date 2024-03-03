package com.hexaware.springrestjpa.restcontroller;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;

import com.hexaware.springrestjpa.entities.User;


@SpringBootTest
class UserRestControllerTest {
	
	
	
	@Autowired
	RestTemplate restTemplate;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	 @Test
	    void testAddUser() {
	        // Create a user to be added
		 User user = new User(7L, "Joyoe", "password", "joyoe.doe@example.com",
	                "John", "Doe", "1234567890", "Some Address");

	        // Perform the addition
	        ResponseEntity<User> response = restTemplate.postForEntity("http://localhost:8081/api/User/add", user, User.class);
	        User addedUser = response.getBody();
	        assertNotNull(addedUser);

	        // Assert that the user details match
	        assertEquals(user.getUserId(), addedUser.getUserId());
	        assertEquals(user.getUserName(), addedUser.getUserName());

	     
	     
	    }

	@Test
	void testUpdateUser() {
		
	}

	@Test
	void testGetUserById() {
		
	}

	@Test
	void testDeleteUserById() {
		
	}
	@Test
    void testGetAllUsers() {
        ResponseEntity<List> response = restTemplate.getForEntity("http://localhost:8081/api/User/getall", List.class);
        List<User> userList = response.getBody();
        assertNotNull(userList);
        assertTrue(userList.size() > 0);
    }

}
