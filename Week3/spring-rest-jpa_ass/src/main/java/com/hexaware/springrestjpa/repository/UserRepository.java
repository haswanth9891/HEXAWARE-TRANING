package com.hexaware.springrestjpa.repository;



import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.hexaware.springrestjpa.dto.UserDTO;
import com.hexaware.springrestjpa.entities.User;





public interface UserRepository extends JpaRepository<User,Long> {
	
	List<User> findByUserName(String userName);

    List<User> findByEmail(String email);

    List<User> findByContactNumber(String contactNumber);

    @Modifying
    
    @Query("delete from User u where u.userName = ?1")
    int deleteByUserName(String userName);


}
