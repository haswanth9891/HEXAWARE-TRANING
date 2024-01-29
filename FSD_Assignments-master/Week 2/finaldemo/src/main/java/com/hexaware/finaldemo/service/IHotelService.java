package com.hexaware.finaldemo.service;
import java.util.Set;
import com.hexaware.finaldemo.entity.Hotel;
import com.hexaware.finaldemo.entity.Review;
import com.hexaware.finaldemo.entity.Room;

public interface IHotelService {
	public boolean updateHotelById(int hotelId);
	public Hotel getHotelById(int hotelId);
	public boolean updateReservationStatus(int reservationID);
	public boolean cancelReservationStatus(int reservationID);
	public boolean deleteHotelbyId(int hotelId);
	public Set<Review> getReviewById(int hotelId);
	public Set<Room> getAllRoomByHotelId(int hotelId);
	public boolean updateRoomById(int roomId,Room room);
	
}
