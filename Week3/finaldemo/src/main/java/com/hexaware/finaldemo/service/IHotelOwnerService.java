package com.hexaware.finaldemo.service;

import com.hexaware.finaldemo.entity.Room;

import org.hibernate.mapping.List;





public interface IHotelOwnerService {
	
	// Hotel owner login
    boolean loginHotelOwner(String username, String password);

    // Add a new room to the hotel
    boolean addRoom(Long hotelId, Room roomDetails);

    // Edit details of an existing room in the hotel
    boolean editRoom(Long roomId, Room updatedRoomDetails);

    // Remove a room from the hotel
    boolean removeRoom(Long roomId);

    // View booked tickets by users for rooms in the hotel
    List viewReservation(Long hotelId);

    // Refund amount for canceled booked tickets
    boolean refundAmount(Long reservationId);
}