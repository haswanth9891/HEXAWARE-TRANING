package com.hexaware.springrestjpa.restcontroller;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import com.hexaware.springrestjpa.entities.Hotel;
import com.hexaware.springrestjpa.service.IHotelService;

import jakarta.validation.Valid;

@RestController
@RequestMapping("/api/hotels")
public class HotelRestController {
	
	Logger logger = LoggerFactory.getLogger(HotelRestController.class);
	@Autowired
	IHotelService service;
	
	@PostMapping("/add")
	public Hotel addHotel(@RequestBody Hotel hotel) {
		logger.info("In Hotel Rest Controller");
		
		return service.insertHotel(hotel);
	}
	
	@PutMapping("/update")
	public Hotel updateHotel(@RequestBody Hotel hotel) {
		return service.updateHotel(hotel);
	}
	
	@GetMapping("/get/{hid}")
	public Hotel getHotelById(@PathVariable long hid) {
		 return service.getHotelById(hid);
	}
	
	@GetMapping("/getall")
	public List<Hotel> getAll(){
		
		return service.getAllHotels();
	}
	
	@DeleteMapping("/delete/{hid}")
	public String deleteByID(@PathVariable long hid) {
		return service.deleteHotelById(hid);
	}
	
	@GetMapping("/getbyname/{name}")
	public List<Hotel> getHotelByName(@PathVariable String name) {
		 return service.getByName(name);
	}
	
	@GetMapping("/getdining")
	public List<Hotel> getDiningTrue() {
		 return service.findByDiningTrue();
	}
	
	@GetMapping("/getparking")
	public List<Hotel> getParkingTrue() {
		 return service.findByParkingTrue();
	}
	
	@GetMapping("/locationh")
	public List<Hotel> getLocationH() {
		 return service.getByLocstartingWithH();
	}
	
	@PutMapping("/hotelsuffix")
	public String changeHotel() {
		int count = 0;
		count= service.changeHotelName();
		return "Hotel suffix added to " + count + " hotels";
	}
	
	

}
