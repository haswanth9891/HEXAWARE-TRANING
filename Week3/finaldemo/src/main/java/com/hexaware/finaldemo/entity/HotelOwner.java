package com.hexaware.finaldemo.entity;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.*;

@Entity
@Table(name = "HotelOwner_Details")
public class HotelOwner {
	@Column(name ="hotelOwnerId")
	 private Long hotelOwnerId;
    @Column(name = "user_name")
    private String hotelOwnerName;

    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;
     
    @OneToMany(mappedBy = "HotelOwner", cascade = CascadeType.ALL)
    @JoinColumn(name="hotel_id")
    private Set<Hotel> hotel = new HashSet<Hotel>();

	public HotelOwner() {
		super();
	}

	public HotelOwner(Long hotelOwnerId, String hotelOwnerName, String password, String email, Set<Hotel> hotel) {
		super();
		this.hotelOwnerId = hotelOwnerId;
		this.hotelOwnerName = hotelOwnerName;
		this.password = password;
		this.email = email;
		this.hotel = hotel;
	}

	public Long getHotelOwnerId() {
		return hotelOwnerId;
	}

	public void setHotelOwnerId(Long hotelOwnerId) {
		this.hotelOwnerId = hotelOwnerId;
	}

	public String getHotelOwnerName() {
		return hotelOwnerName;
	}

	public void setHotelOwnerName(String hotelOwnerName) {
		this.hotelOwnerName = hotelOwnerName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public Set<Hotel> getHotel() {
		return hotel;
	}

	public void setHotel(Set<Hotel> hotel) {
		this.hotel = hotel;
	}

	@Override
	public String toString() {
		return "HotelOwner [hotelOwnerId=" + hotelOwnerId + ", hotelOwnerName=" + hotelOwnerName + ", password="
				+ password + ", email=" + email + ", hotel=" + hotel + "]";
	}

	
}