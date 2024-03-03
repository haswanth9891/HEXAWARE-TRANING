package pojo;

import java.util.Objects;

public class Hotel {
	
	private int hotelId;
	private String hotelName;
	private String location;
	
	public Hotel(){
		super();
	}
	
	public Hotel(int hotelId, String hotelName, String location) {
		this.hotelId = hotelId;
		this.hotelName = hotelName;
		this.location = location;
	}

	public int getHotelId() {
		return hotelId;
	}

	public void setHotelId(int hotelId) {
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

	@Override
	public String toString() {
		return hotelId + "";
	}

	@Override
	public int hashCode() {
		return Objects.hash(hotelId);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Hotel other = (Hotel) obj;
		return hotelId == other.hotelId;
	}
	
	

}
