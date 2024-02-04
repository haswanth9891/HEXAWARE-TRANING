package com.hexaware.springrestjpa.service;

import java.util.List;

import com.hexaware.springrestjpa.entities.Hotel;

public interface IHotelService {
	
	public Hotel insertHotel(Hotel hotel);
	public Hotel updateHotel(Hotel hotel);
	
	public Hotel getHotelById(long hotelId);
	public String deleteHotelById(long hotelId);
	
	public List<Hotel> getAllHotels();
	
	public List<Hotel> getByName(String hotelName);
	
	public List<Hotel> findByDiningTrue();
	
	public List<Hotel> findByParkingTrue();
	
	public List<Hotel>  getByLocstartingWithH();
	
	public int changeHotelName();

}
