package com.hospital.HospitalManagement.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.jboss.logging.Logger;
import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.HospitalManagement.DTO.AdminResponse;
import com.hospital.HospitalManagement.Entity.AppAdmin;
import com.hospital.HospitalManagement.Repository.AppAdminRepository;


@Service
public class AdminServiceImpl implements AdminService{

	@Autowired
	AppAdminRepository appAdminRepo;
	

	@Override
	public List<AdminResponse> getRegisteredUserDetaisl(String userID) {
		Logger logger = LoggerFactory.logger(AdminServiceImpl.class);
		List<AdminResponse> responseData = new ArrayList<AdminResponse>();
		try {
			Optional<AppAdmin> result=appAdminRepo.getLoginDetails(userID);
			AdminResponse adminResponse= new AdminResponse();
			if(result.isPresent()) {
				adminResponse.setNotRegiestered(false);
				AppAdmin obj = result.get();
				adminResponse.setUserID(obj.getUserId());
				adminResponse.setUserPwd(obj.getUserPwd());
				adminResponse.setUserType(obj.getUserType());
			}else {
				adminResponse.setNotRegiestered(true);
			}
			responseData.add(adminResponse);
		}catch(Exception exe) {
			logger.error("Error in Admin user details {}"+ exe.getMessage());
		}
		
		return responseData;
		
	}

}
