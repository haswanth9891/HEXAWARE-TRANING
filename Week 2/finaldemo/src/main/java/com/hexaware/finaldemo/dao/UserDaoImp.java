package com.hexaware.finaldemo.dao;

import java.util.Date;
import java.util.Set;

import com.hexaware.finaldemo.entity.Hotel;
import com.hexaware.finaldemo.entity.Reservation;
import com.hexaware.finaldemo.entity.Room;
import com.hexaware.finaldemo.entity.User;

public class UserDaoImp implements IUserDao {

	@Override
	public User getUserById(int userId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean deleteUserById(int userId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean updateUserById(int userId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Set<Hotel> getAllHotels() {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Hotel getHotelById(int hotelId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Set<Room> getAllRoomByHotelId(int hotelId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Reservation makeReservation(int hotelId, Room room, Date checkInDate, Date checkOutDate, int numberOfAdults,
			int numberOfChildren, double totalAmount) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean updateReservationById(int reservationId, Room room, Date checkInDate, Date checkOutDate,
			int numberOfAdults, int numberOfChildren, double totalAmount) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean deleteReservationById(int reservationId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean giveReview(int hotelId, int rating, String reviewText, Date reviewDate) {
		// TODO Auto-generated method stub
		return false;
	}

}
