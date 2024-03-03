package com.hexaware.hibernateass.service;

import java.util.List;

import com.hexaware.hibernateass.dao.IUserDao;
import com.hexaware.hibernateass.dao.UserDaoImp;
import com.hexaware.hibernateass.entity.User;


public class UserServiceImp implements IUserService {

	IUserDao dao = new UserDaoImp();

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
