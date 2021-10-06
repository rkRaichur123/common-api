package com.hospital.HospitalManagement.Service;

import java.util.List;

import com.hospital.HospitalManagement.DTO.AdminResponse;



public interface AdminService {
	List<AdminResponse> getRegisteredUserDetaisl(String userID);
}
