package com.hexaware.hoteljdbc.dao;

import java.util.List;

import javax.sql.DataSource;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.hexaware.hoteljdbc.model.User;

@Repository
public class UserDaoImp implements IUserDao {

    private JdbcTemplate jdbcTemplate;

    @Autowired
    public UserDaoImp(DataSource dataSource) {
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }

    @Override
    public boolean createUser(User user) {
        String insertQuery = "INSERT INTO User(UserID, UserName, Password, Email, FirstName, LastName, ContactNumber, Address) " +
                "VALUES (?, ?, ?, ?, ?, ?, ?, ?)";

        int count = jdbcTemplate.update(insertQuery, user.getUserId(), user.getUserName(), user.getPassword(),
                user.getEmail(), user.getFirstName(), user.getLastName(), user.getContactNumber(), user.getAddress());

        return count > 0;
    }

    @Override
    public boolean updateUser(User user) {
        String updateQuery = "UPDATE User SET UserName = ?, Password = ?, Email = ?, FirstName = ?, LastName = ?, " +
                "ContactNumber = ?, Address = ? WHERE UserID = ?";

        int count = jdbcTemplate.update(updateQuery, user.getUserName(), user.getPassword(), user.getEmail(),
                user.getFirstName(), user.getLastName(), user.getContactNumber(), user.getAddress(), user.getUserId());

        return count > 0;
    }

    @Override
    public boolean deleteUserById(int userId) {
        String deleteQuery = "DELETE FROM User WHERE UserID = ?";

        int count = jdbcTemplate.update(deleteQuery, userId);

        return count > 0;
    }

    @Override
    public User selectUserByName(String userName) {
        String selectQueryByName = "SELECT * FROM User WHERE UserName = ?";

        User user = null;

        try {
            user = jdbcTemplate.queryForObject(selectQueryByName, new UserMapper(), userName);
        } catch (Exception e) {
            // Handle exception or log if necessary
        }

        return user;
    }

    @Override
    public List<User> selectAllUsers() {
        String selectQuery = "SELECT * FROM User";

        List<User> userList = jdbcTemplate.query(selectQuery, new UserMapper());

        return userList;
    }
}

