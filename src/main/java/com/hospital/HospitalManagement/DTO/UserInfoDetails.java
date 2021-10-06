package com.hospital.HospitalManagement.DTO;

import java.util.Date;

public class UserInfoDetails {

	private String userId;
	private String userPwd;
	private String userType;
	private String address;
	private String dob;
	private String email;
	private String fName;
	private String lName;
	private String mobile;
	
	@Override
	public String toString() {
		return "UserInfoDetails [userId=" + userId + ", userPwd=" + userPwd + ", userType=" + userType + ", address="
				+ address + ", dob=" + dob + ", email=" + email + ", fName=" + fName + ", lName=" + lName + ", mobile="
				+ mobile + "]";
	}
	public String getAddress() {
		return address;
	}
	public void setAddress(String address) {
		this.address = address;
	}
	public String getDob() {
		return dob;
	}
	public void setDob(String dob) {
		this.dob = dob;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getfName() {
		return fName;
	}
	public void setfName(String fName) {
		this.fName = fName;
	}
	public String getlName() {
		return lName;
	}
	public void setlName(String lName) {
		this.lName = lName;
	}
	public String getMobile() {
		return mobile;
	}
	public void setMobile(String mobile) {
		this.mobile = mobile;
	}
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
	
}
