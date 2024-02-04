package com.hexaware.springrestjpa.service;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.springrestjpa.entities.Hotel;
import com.hexaware.springrestjpa.repository.HotelRepository;
import com.hexaware.springrestjpa.restcontroller.HotelRestController;

import jakarta.transaction.Transactional;


@Service
@Transactional
public class HotelServiceImp implements IHotelService{
	
	Logger logger = LoggerFactory.getLogger(HotelRestController.class);
	
	@Autowired
	HotelRepository repo;

	@Override
	public Hotel insertHotel(Hotel hotel) {
		
		logger.info("In Hotel service class");
		logger.info("Inserting Hotel object");
		
		return repo.save(hotel);
	}

	@Override
	public Hotel updateHotel(Hotel hotel) {
		
		return repo.save(hotel);
	}

	@Override
	public Hotel getHotelById(long hotelId) {
		
		return repo.findById(hotelId).orElse(null);
	}

	@Override
	public String deleteHotelById(long hotelId) {
		
		repo.deleteById(hotelId);
		return hotelId + " record deleted";
	}

	@Override
	public List<Hotel> getAllHotels() {
		
		return repo.findAll();
	}

	@Override
	public List<Hotel> getByName(String hotelName) {
	 
		return repo.findByHotelName(hotelName);
	}

	@Override
	public List<Hotel> findByDiningTrue() {
		
		return repo.findByDiningTrue();
	}

	@Override
	public List<Hotel> findByParkingTrue() {
		
		return repo.findByParkingTrue();
	}

	@Override
	public List<Hotel> getByLocstartingWithH() {
		
		return repo.getByLocstartingWithH();
	}

	@Override
	public int changeHotelName() {
		
		return repo.changeHotelName();
	}
	
	
	

}
