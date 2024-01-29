package com.hexaware.hoteljdbc.service;

import java.util.List;

import com.hexaware.hoteljdbc.model.User;

public interface IUserService {

    public boolean createUser(User user);

    public boolean updateUser(User user);

    public boolean deleteUserById(int userId);

    public User selectUserByName(String userName);

    public List<User> selectAllUsers();
}

