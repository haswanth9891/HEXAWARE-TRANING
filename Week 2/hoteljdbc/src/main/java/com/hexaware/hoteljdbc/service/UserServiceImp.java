package com.hexaware.hoteljdbc.service;



import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hexaware.hoteljdbc.dao.IUserDao;
import com.hexaware.hoteljdbc.model.User;

@Service
public class UserServiceImp implements IUserService {

    @Autowired
    IUserDao dao;

    @Override
    public boolean createUser(User user) {
        return dao.createUser(user);
    }

    @Override
    public boolean updateUser(User user) {
        return dao.updateUser(user);
    }

    @Override
    public boolean deleteUserById(int userId) {
        return dao.deleteUserById(userId);
    }

    @Override
    public User selectUserByName(String userName) {
        return dao.selectUserByName(userName);
    
    }

    @Override
    public List<User> selectAllUsers() {
        return dao.selectAllUsers();
    }
}

