package com.hexaware.finaldemo.entity;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;
@Entity
@Table(name = "hotel_details")
public class Hotel {
	@Id
    @Column(name = "hotel_id")
    private Long hotelId;

    @Column(name = "hotel_name")
    private String hotelName;

    private String location;

    @Column(name = "has_dining")
    private boolean hasDining;

    @Column(name = "has_parking")
    private boolean hasParking;

    @Column(name = "has_free_wifi")
    private boolean hasFreeWiFi;

    @Column(name = "has_room_service")
    private boolean hasRoomService;

    @Column(name = "has_swimming_pool")
    private boolean hasSwimmingPool;

    @Column(name = "has_fitness_center")
    private boolean hasFitnessCenter;
    @OneToMany(mappedBy = "Hotel", cascade = CascadeType.ALL)
    @JoinColumn(name="Hotel_id")
    private Set<Room> room = new HashSet<Room>() ;
   
    
    @OneToMany(mappedBy = "Hotel", cascade = CascadeType.ALL)
    @JoinColumn(name="Hotel_id")
    private Set<Reservation>reservation= new HashSet<Reservation>() ;  
    
    @OneToMany(mappedBy = "Hotel", cascade = CascadeType.ALL)
    @JoinColumn(name="Hotel_id")
    private Set<Review>review = new HashSet<Review>() ;

	public Hotel() {
		super();
	}

	public Hotel(Long hotelId, String hotelName, String location, boolean hasDining, boolean hasParking,
			boolean hasFreeWiFi, boolean hasRoomService, boolean hasSwimmingPool, boolean hasFitnessCenter,
			Set<Room> room, Set<Reservation> reservation, Set<Review> review) {
		super();
		this.hotelId = hotelId;
		this.hotelName = hotelName;
		this.location = location;
		this.hasDining = hasDining;
		this.hasParking = hasParking;
		this.hasFreeWiFi = hasFreeWiFi;
		this.hasRoomService = hasRoomService;
		this.hasSwimmingPool = hasSwimmingPool;
		this.hasFitnessCenter = hasFitnessCenter;
		this.room = room;
		this.reservation = reservation;
		this.review = review;
	}

	public Long getHotelId() {
		return hotelId;
	}

	public void setHotelId(Long hotelId) {
		this.hotelId = hotelId;
	}

	public String getHotelName() {
		return hotelName;
	}

	public void setHotelName(String hotelName) {
		this.hotelName = hotelName;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}

	public boolean isHasDining() {
		return hasDining;
	}

	public void setHasDining(boolean hasDining) {
		this.hasDining = hasDining;
	}

	public boolean isHasParking() {
		return hasParking;
	}

	public void setHasParking(boolean hasParking) {
		this.hasParking = hasParking;
	}

	public boolean isHasFreeWiFi() {
		return hasFreeWiFi;
	}

	public void setHasFreeWiFi(boolean hasFreeWiFi) {
		this.hasFreeWiFi = hasFreeWiFi;
	}

	public boolean isHasRoomService() {
		return hasRoomService;
	}

	public void setHasRoomService(boolean hasRoomService) {
		this.hasRoomService = hasRoomService;
	}

	public boolean isHasSwimmingPool() {
		return hasSwimmingPool;
	}

	public void setHasSwimmingPool(boolean hasSwimmingPool) {
		this.hasSwimmingPool = hasSwimmingPool;
	}

	public boolean isHasFitnessCenter() {
		return hasFitnessCenter;
	}

	public void setHasFitnessCenter(boolean hasFitnessCenter) {
		this.hasFitnessCenter = hasFitnessCenter;
	}

	public Set<Room> getRoom() {
		return room;
	}

	public void setRoom(Set<Room> room) {
		this.room = room;
	}

	public Set<Reservation> getReservation() {
		return reservation;
	}

	public void setReservation(Set<Reservation> reservation) {
		this.reservation = reservation;
	}

	public Set<Review> getReview() {
		return review;
	}

	public void setReview(Set<Review> review) {
		this.review = review;
	}

	@Override
	public String toString() {
		return "Hotel [hotelId=" + hotelId + ", hotelName=" + hotelName + ", location=" + location + ", hasDining="
				+ hasDining + ", hasParking=" + hasParking + ", hasFreeWiFi=" + hasFreeWiFi + ", hasRoomService="
				+ hasRoomService + ", hasSwimmingPool=" + hasSwimmingPool + ", hasFitnessCenter=" + hasFitnessCenter
				+ ", room=" + room + ", reservation=" + reservation + ", review=" + review + "]";
	}
    

}
