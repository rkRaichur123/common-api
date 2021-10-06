package com.hospital.HospitalManagement.DTO;

import java.io.Serializable;

public class AdminResponse implements Serializable{

	/**
	 * 
	 */
	private static final long serialVersionUID = -726706259114192104L;
	
	
	private String userID;
	private String userPwd;
	private String userType;
	private boolean notRegiestered;
	public boolean isNotRegiestered() {
		return notRegiestered;
	}
	public void setNotRegiestered(boolean notRegiestered) {
		this.notRegiestered = notRegiestered;
	}
	public String getUserID() {
		return userID;
	}
	public void setUserID(String userID) {
		this.userID = userID;
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
		return "AdminResponse [userID=" + userID + ", userPwd=" + userPwd + ", userType=" + userType
				+ ", notRegiestered=" + notRegiestered + "]";
	}
	
	
	
}
