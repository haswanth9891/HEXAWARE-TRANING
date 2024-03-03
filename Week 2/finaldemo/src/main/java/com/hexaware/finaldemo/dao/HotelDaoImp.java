package com.hexaware.finaldemo.dao;

import java.util.Set;

import com.hexaware.finaldemo.entity.Hotel;
import com.hexaware.finaldemo.entity.Review;
import com.hexaware.finaldemo.entity.Room;

public class HotelDaoImp implements IHotelDao{

	@Override
	public boolean updateHotelById(int hotelId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Hotel getHotelById(int hotelId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateReservationStatus(int reservationID) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean cancelReservationStatus(int reservationID) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteHotelbyId(int hotelId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Set<Review> getReviewById(int hotelId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Room> getAllRoomByHotelId(int hotelId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateRoomById(int roomId, Room room) {
		// TODO Auto-generated method stub
		return false;
	}

}
