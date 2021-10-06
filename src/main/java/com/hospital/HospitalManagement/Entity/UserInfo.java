package com.hospital.HospitalManagement.Entity;
import java.sql.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity(name="user_info")
public class UserInfo {


  @Id
  @Column(name="user_Id")
  private String userId;
  
  @Column(name="user_Fname")
  private String fName;
  
  @Column(name="user_Email")
  private String email;
  
  @Column(name="user_Mobile")
  private String mobile;
  
  @Column(name="user_Dob")
  private Date dob;
  
  @Column(name="user_address")
  private String address;
  
  @Column(name="user_Lname")
  private String lName;

  public UserInfo() {}

public String getUserId() {
	return userId;
}

public void setUserId(String userId) {
	this.userId = userId;
}

public String getfName() {
	return fName;
}

public void setfName(String fName) {
	this.fName = fName;
}

public String getEmail() {
	return email;
}

public void setEmail(String email) {
	this.email = email;
}

public String getMobile() {
	return mobile;
}

public void setMobile(String mobile) {
	this.mobile = mobile;
}

public Date getDob() {
	return dob;
}

public void setDob(Date dob) {
	this.dob = dob;
}

public String getAddress() {
	return address;
}

public void setAddress(String address) {
	this.address = address;
}

public String getlName() {
	return lName;
}

public void setlName(String lName) {
	this.lName = lName;
}

@Override
public String toString() {
	return "userInfo [userId=" + userId + ", fName=" + fName + ", email=" + email + ", mobile=" + mobile + ", dob="
			+ dob + ", address=" + address + ", lName=" + lName + "]";
}


}