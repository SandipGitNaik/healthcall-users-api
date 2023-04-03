package com.healthcalluser.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="user")
public class User {
@Id
@Column(name="user_id ")
private int user_id ;
@Column(name="user_first_name")
private String user_first_name;
@Column(name="user_last_name")
private String user_last_name;
@Column(name="user_mobile")
private String user_mobile;
@Column(name="user_email")
private String user_email;
@Column(name="user_address")
private String user_address;
@Column(name="user_pincode")
private String user_pincode;
@Column(name="user_password")
private String user_password;
public String getUser_password() {
	return user_password;
}
public void setUser_password(String user_password) {
	this.user_password = user_password;
}
public int getUser_id() {
	return user_id;
}
public void setUser_id(int user_id) {
	this.user_id = user_id;
}
public String getUser_first_name() {
	return user_first_name;
}
public void setUser_first_name(String user_first_name) {
	this.user_first_name = user_first_name;
}
public String getUser_last_name() {
	return user_last_name;
}
public void setUser_last_name(String user_last_name) {
	this.user_last_name = user_last_name;
}
public String getUser_mobile() {
	return user_mobile;
}
public void setUser_mobile(String user_mobile) {
	this.user_mobile = user_mobile;
}
public String getUser_email() {
	return user_email;
}
public void setUser_email(String user_email) {
	this.user_email = user_email;
}
public String getUser_address() {
	return user_address;
}
public void setUser_address(String user_address) {
	this.user_address = user_address;
}
public String getUser_pincode() {
	return user_pincode;
}
public void setUser_pincode(String user_pincode) {
	this.user_pincode = user_pincode;
}
public User(int user_id, String user_first_name, String user_last_name, String user_mobile, String user_email,
		String user_address,String user_pincode, String user_password) {
	super();
	this.user_id = user_id;
	this.user_first_name = user_first_name;
	this.user_last_name = user_last_name;
	this.user_mobile = user_mobile;
	this.user_email = user_email;
	this.user_address = user_address;
	this.user_pincode = user_pincode;
	this.user_password = user_password;
}
public User() {
	super();
}

}
