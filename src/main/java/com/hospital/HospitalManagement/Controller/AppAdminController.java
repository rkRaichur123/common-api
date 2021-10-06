package com.hospital.HospitalManagement.Controller;

import java.util.List;

import org.hibernate.annotations.common.util.impl.LoggerFactory;
import org.jboss.logging.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.hospital.HospitalManagement.DTO.AdminResponse;
import com.hospital.HospitalManagement.DTO.UserInfoDetails;
import com.hospital.HospitalManagement.Service.AdminServiceImpl;
import com.hospital.HospitalManagement.Service.UserInfoServiceImpl;


@RestController
@RequestMapping(value="/admin")
public class AppAdminController {
	Logger logger = LoggerFactory.logger(AdminServiceImpl.class);
	
	@Autowired
	UserInfoServiceImpl userInfoservice;
	
	@Autowired
	AdminServiceImpl adminService;
	@GetMapping(value="/getUserDetails/{userId}")
	@ResponseBody
	public List<AdminResponse> getUserDetails(@PathVariable String userId){
		
		List<AdminResponse> loginDetails= adminService.getRegisteredUserDetaisl(userId);
		return loginDetails;
		
	}
	
	@PostMapping(value="/saveUserInfo")
	public ResponseEntity<String> create(@RequestBody UserInfoDetails newUser) throws Exception {
		String user = userInfoservice.saveUserInfo(newUser);
	    if (user == null) {
	        throw new Exception();
	    } else {
	        return new ResponseEntity<>(user, HttpStatus.CREATED);
	    }
	}
}
	
