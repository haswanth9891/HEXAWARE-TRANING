package com.hexaware.hoteljdbc.dao;


import java.util.List;

import com.hexaware.hoteljdbc.model.User;

public interface IUserDao {

    public boolean createUser(User user);

    public boolean updateUser(User user);

    public boolean deleteUserById(int userId);

    public User selectUserByName(String userName);

    public List<User> selectAllUsers();
}

