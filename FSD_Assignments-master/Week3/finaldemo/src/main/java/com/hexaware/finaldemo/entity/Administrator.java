package com.hexaware.finaldemo.entity;
import javax.persistence.*;

@Entity
@Table(name = "Administrator_Details")
public class Administrator {

    @Id
    @Column(name = "admin_id")
    private Long adminId;

    @Column(name = "user_name")
    private String userName;

    
    @Column(name = "password")
    private String password;

    @Column(name = "email")
    private String email;

	public Administrator() {
		super();
	}

	public Administrator(Long adminId, String userName, String password, String email) {
		super();
		this.adminId = adminId;
		this.userName = userName;
		this.password = password;
		this.email = email;
	}

	public Long getAdminId() {
		return adminId;
	}

	public void setAdminId(Long adminId) {
		this.adminId = adminId;
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

	@Override
	public String toString() {
		return "Administrator [adminId=" + adminId + ", userName=" + userName + ", password=" + password + ", email="
				+ email + "]";
	}

	
}

