package com.hexaware.springrestjpa.entities;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.Pattern;

@Entity
@Table(name = "Hotel_Details")
public class Hotel {
	

	@Id
	private Long hotelID;
	@Pattern(regexp = "^[A-Za-z0-9\\s]+$")
    private String hotelName;
	@Pattern(regexp = "[A-Z][a-z]{3,10}")
    private String location;
    private boolean dining;
    private boolean parking;
    
	public Hotel() {
		super();
		
	}

	public Hotel(Long hotelID, @Pattern(regexp = "^[A-Za-z0-9\\s]+$") String hotelName,
		@Pattern(regexp = "[A-Z][a-z]{3,10}") String location, boolean dining, boolean parking) {
		super();
		this.hotelID = hotelID;
		this.hotelName = hotelName;
		this.location = location;
		this.dining = dining;
		this.parking = parking;
	}

	public Long getHotelID() {
		return hotelID;
	}

	public void setHotelID(Long hotelID) {
		this.hotelID = hotelID;
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

	public boolean isDining() {
		return dining;
	}

	public void setDining(boolean dining) {
		this.dining = dining;
	}

	public boolean isParking() {
		return parking;
	}

	public void setParking(boolean parking) {
		this.parking = parking;
	}

	@Override
	public String toString() {
		return "Hotel [hotelID=" + hotelID + ", hotelName=" + hotelName + ", location=" + location + ", dining="
				+ dining + ", parking=" + parking + "]";
	}

	
	
    
    

}
