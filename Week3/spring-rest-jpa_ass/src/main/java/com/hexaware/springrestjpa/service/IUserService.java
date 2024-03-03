package com.hexaware.springrestjpa.service;

import java.util.List;


import com.hexaware.springrestjpa.entities.User;

public interface IUserService {

    public User addUser(User user);

    public User updateUser(User user);

    public User getUserById(long userId);

    public String deleteUserById(long userId);

    public List<User> getAllUsers();

    public List<User> getByUserName(String userName);

    public List<User> getByEmail(String email);

    public List<User> getByContactNumber(String contactNumber);

    

}
