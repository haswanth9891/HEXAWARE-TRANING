package com.hexaware.finaldemo.service;


import org.hibernate.mapping.List;
import com.hexaware.finaldemo.entity.Room;



public class HotelOwnerServiceImp implements IHotelOwnerService {

	@Override
	public boolean loginHotelOwner(String username, String password) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean addRoom(Long hotelId, Room roomDetails) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean editRoom(Long roomId, Room updatedRoomDetails) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean removeRoom(Long roomId) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public List viewReservation(Long hotelId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean refundAmount(Long reservationId) {
		// TODO Auto-generated method stub
		return false;
	}

	
	
	
}
