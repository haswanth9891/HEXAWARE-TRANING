package com.hexaware.springrestjpa.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.springrestjpa.dto.UserDTO;
import com.hexaware.springrestjpa.entities.User;
import com.hexaware.springrestjpa.repository.UserRepository;

import jakarta.transaction.Transactional;


@Transactional
@Service
public class UserServiceImp implements IUserService {
	
	@Autowired
	UserRepository repo;

	@Override
    public User addUser(User user) {
        return repo.save(user);
    }

    @Override
    public User updateUser(User user) {
        return repo.save(user);
    }

   

    @Override
    public List<User> getAllUsers() {
        return repo.findAll();
    }

    @Override
    public List<User> getByUserName(String userName) {
        return repo.findByUserName(userName);
    }

    @Override
    public List<User> getByEmail(String email) {
        return repo.findByEmail(email);
    }

    @Override
    public List<User> getByContactNumber(String contactNumber) {
        return repo.findByContactNumber(contactNumber);
    }

	@Override
	public User getUserById(long userId) {
		 return repo.findById(userId).orElse(null);
	}

	@Override
	public String deleteUserById(long userId) {
		repo.deleteById(userId);
        return "Record deleted";
	}

	
	
}
