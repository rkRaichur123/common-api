package com.hospital.HospitalManagement.Service;

import java.text.SimpleDateFormat;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.hospital.HospitalManagement.DTO.UserInfoDetails;
import com.hospital.HospitalManagement.Entity.AppAdmin;
import com.hospital.HospitalManagement.Entity.UserInfo;
import com.hospital.HospitalManagement.Repository.AppAdminRepository;
import com.hospital.HospitalManagement.Repository.UserInfoRespository;

@Service
public class UserInfoServiceImpl implements UserInfoService{

	@Autowired
	AppAdminRepository appAdminRepository;
	
	@Autowired
	UserInfoRespository userInfoRepository;
	
	@Override
	@Transactional
	public String saveUserInfo(UserInfoDetails newuser) {
		
		String response="failed";
		AppAdmin appAdmin = new AppAdmin();
		UserInfo userInfo = new UserInfo();
		if(userInfo!=null) {
			
			try {
				SimpleDateFormat sdf1 = new SimpleDateFormat("dd-MM-yyyy");
				java.util.Date date = sdf1.parse(newuser.getDob());
				java.sql.Date sqlStartDate = new java.sql.Date(date.getTime());
				
				appAdmin.setUserId(newuser.getUserId());
				appAdmin.setUserPwd(newuser.getUserPwd());
				appAdmin.setUserType(newuser.getUserType());
				AppAdmin adminResponse=appAdminRepository.save(appAdmin);
				
				userInfo.setAddress(newuser.getAddress());
				userInfo.setDob(sqlStartDate);
				userInfo.setEmail(newuser.getEmail());
				userInfo.setfName(newuser.getfName());
				userInfo.setlName(newuser.getlName());
				userInfo.setMobile(newuser.getMobile());
				userInfo.setUserId(newuser.getUserId());
				UserInfo userInfoResponse=userInfoRepository.save(userInfo);
				if(adminResponse!=null && userInfoResponse!=null) {
					response="Sucess";
				}
			} catch (Exception e) {
				// TODO Auto-generated catch block
				System.out.println("Error in saving user and admin detaisl   "+e.getMessage());
			}
		}
		return response;
		
	}

}
