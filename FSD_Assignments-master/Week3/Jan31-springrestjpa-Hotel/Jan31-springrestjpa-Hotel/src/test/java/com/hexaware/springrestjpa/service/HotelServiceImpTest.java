package com.hexaware.springrestjpa.service;

import static org.junit.jupiter.api.Assertions.*;

import java.util.List;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.annotation.Rollback;


import com.hexaware.springrestjpa.entities.Hotel;

import jakarta.transaction.Transactional;

@SpringBootTest
//@Transactional
class HotelServiceImpTest {
	
	
	
	@Autowired
	IHotelService service;

	@BeforeAll
	static void setUpBeforeClass() throws Exception {
	}

	@Test
	@Rollback(false)
	void testInsertHotel() {
		
		Hotel hotel = new Hotel((long) 121, "Magha Stay", "Raipur", true, false);
		Hotel h1 = service.insertHotel(hotel);
		assertNotNull(h1);
		assertEquals(hotel.getHotelID(),h1.getHotelID());
		
	}

	@Test
	@Rollback(false)
	void testUpdateHotel() {
		Hotel hotel = new Hotel((long) 200, "Magha Stay", "Bangalore", true, true);
		Hotel h1 = service.updateHotel(hotel);
		assertNotNull(h1);
		assertEquals(hotel.getHotelID(),h1.getHotelID());
		
	}

	@Test
	@Rollback(false)
	void testGetHotelById() {
		
		Hotel hotel = service.getHotelById(101);
		assertEquals("Rest IN", hotel.getHotelName());
		
		
	}

	@Test
	@Rollback(false)
	void testDeleteHotelById() {
		
		 service.deleteHotelById(121);
	     Hotel hotel = service.getHotelById(121);
	     assertNull(hotel);
		
	}

	@Test
	@Rollback(false)
	void testGetAllHotels() {
		
		List list = service.getAllHotels();
		boolean flag = list.isEmpty();
		assertFalse(flag);
		
	}

}
