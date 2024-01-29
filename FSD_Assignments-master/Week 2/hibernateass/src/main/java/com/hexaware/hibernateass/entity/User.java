package com.hexaware.hibernateass.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.NamedQueries;
import javax.persistence.NamedQuery;
import javax.persistence.Table;



@Entity
@Table(name = "User_Details")
@NamedQueries({
	@NamedQuery(name = "getAllUsers", query = "SELECT u FROM User u"),
	@NamedQuery(name = "selectUserByName", query = "SELECT u FROM User u WHERE u.userName = :name")
    
})
public class User {

    @Id
    private int userId;
   
    private String userName;

    private String password;
    private String email;
    private String firstName;
    private String lastName;

    @Column(name = "contact_number")
    private String contactNumber;

    private String address;

    public User() {
        super();
    }

    public User(int userId, String userName, String password, String email, String firstName, String lastName,
                String contactNumber, String address) {
        super();
        this.userId = userId;
        this.userName = userName;
        this.password = password;
        this.email = email;
        this.firstName = firstName;
        this.lastName = lastName;
        this.contactNumber = contactNumber;
        this.address = address;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getContactNumber() {
        return contactNumber;
    }

    public void setContactNumber(String contactNumber) {
        this.contactNumber = contactNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "User [userId=" + userId + ", userName=" + userName + ", password=" + password + ", email=" + email
                + ", firstName=" + firstName + ", lastName=" + lastName + ", contactNumber=" + contactNumber
                + ", address=" + address + "]";
    }
}

