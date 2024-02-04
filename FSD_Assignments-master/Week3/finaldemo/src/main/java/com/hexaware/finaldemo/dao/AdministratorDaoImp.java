package com.hexaware.finaldemo.dao;

import java.util.Set;

import com.hexaware.finaldemo.entity.HotelOwner;
import com.hexaware.finaldemo.entity.Reservation;

public class AdministratorDaoImp implements IAdministratorDao {

	@Override
	public boolean deleteHotelbyId(int hotelId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public HotelOwner getHotelById(int hotelId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<HotelOwner> getAllHotel() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Reservation> getAllReservation() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteReservationbyId(int reservationId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Reservation getReservationById(int reservationId) {
		// TODO Auto-generated method stub
		return null;
	}

}
