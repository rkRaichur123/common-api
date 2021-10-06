package com.hospital.HospitalManagement.Entity;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
@Entity(name="app_admin")
public class AppAdmin {


  @Id
  @Column(name="user_Id")
  private String userId;
  
  @Column(name="user_Pwd")
  private String userPwd;
  
  @Column(name="user_type")
  private String userType;

  public AppAdmin() {}

public String getUserId() {
	return userId;
}

public void setUserId(String userId) {
	this.userId = userId;
}

public String getUserPwd() {
	return userPwd;
}

public void setUserPwd(String userPwd) {
	this.userPwd = userPwd;
}

public String getUserType() {
	return userType;
}

public void setUserType(String userType) {
	this.userType = userType;
}

@Override
public String toString() {
	return "appAdmin [userId=" + userId + ", userPwd=" + userPwd + ", userType=" + userType + "]";
}

  
}