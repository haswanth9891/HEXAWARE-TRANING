package com.hexaware.finaldemo.dao;

import java.util.Set;

import com.hexaware.finaldemo.entity.HotelOwner;
import com.hexaware.finaldemo.entity.Reservation;

public interface IAdministratorDao {
	public boolean deleteHotelbyId(int hotelId);
	public HotelOwner getHotelById(int hotelId);
	public Set<HotelOwner> getAllHotel();
	public Set<Reservation> getAllReservation();
	public boolean deleteReservationbyId(int reservationId);
	public Reservation getReservationById(int reservationId);

}
