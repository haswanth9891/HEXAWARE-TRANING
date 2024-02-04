package com.hexaware.springrestjpa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;


import com.hexaware.springrestjpa.entities.Hotel;

@Repository
public interface HotelRepository extends JpaRepository<Hotel, Long>{
	
	List<Hotel> findByHotelName(String hotelName);
	
	List<Hotel> findByDiningTrue();
	
	List<Hotel> findByParkingTrue();
	
	@Query(nativeQuery = true, value = "select * from hotel_details where location like 'h%'")
	List<Hotel>  getByLocstartingWithH();
	
	@Modifying
	@Query(nativeQuery = true, value ="update hotel_details  set hotel_name=CONCAT(hotel_name,' Hotel')")
	int changeHotelName();
	
	
	

}
