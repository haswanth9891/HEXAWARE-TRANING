package com.hexaware.hibernateass.dao;

import java.util.List;

import com.hexaware.hibernateass.entity.User;

public interface IUserDao {

    public boolean createUser(User user);

    public boolean updateUser(User user);

    public boolean deleteUserById(int userId);

    public User selectUserByName(String userName);

    public List<User> selectAllUsers();
}

