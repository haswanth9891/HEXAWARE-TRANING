package com.hexaware.springrestjpa.restcontroller;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.client.RestTemplate;


import com.hexaware.springrestjpa.entities.Hotel;

@SpringBootTest
class HotelRestControllerTest {
	
	@Autowired
	RestTemplate restTemplate;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	void testAddHotel() {
		Hotel hotel = new Hotel((long) 123, "Have Fun Stay", "Chennai", true, false);
		ResponseEntity<Hotel> response = restTemplate.postForEntity("http://localhost:8081/api/hotels/add", hotel, Hotel.class);
		Hotel h = response.getBody();
		assertEquals(hotel.getHotelID(), h.getHotelID());
		
	}

	@Test
	void testUpdateHotel() {
		Hotel hotel = new Hotel((long) 102, "Pleasant Stay", "Raipur", true, false);
		restTemplate.put("http://localhost:8081/api/hotels/update", hotel);
		ResponseEntity<Hotel> response = restTemplate.getForEntity("http://localhost:8081/api/hotels/get/102", Hotel.class);
	    Hotel h1 = response.getBody();
	    assertEquals("Pleasant Stay", h1.getHotelName());
		
		
	}

	@Test
	void testGetHotelById() {
		int hid = 102;
		ResponseEntity<Hotel> response = restTemplate.getForEntity("http://localhost:8081/api/hotels/get/"+hid, Hotel.class);
		Hotel h1 = response.getBody();
		assertNotNull(h1);
		
	}

	@Test
	void testGetAll() {
		ResponseEntity<List> response = restTemplate.getForEntity("http://localhost:8081/api/hotels/getall",List.class);
		List<Hotel> list = response.getBody();
		assertTrue(list.size()>0);
		
	}

	@Test
	void testDeleteByID() {
		
		 restTemplate.delete("http://localhost:8081/api/hotels/delete/150");
		 ResponseEntity<Hotel> response = restTemplate.getForEntity("http://localhost:8081/api/hotels/get/150", Hotel.class);
		 Hotel hotel = response.getBody();
	     assertNull(hotel);
		
	}

}
