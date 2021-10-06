package com.hospital.HospitalManagement.Repository;

import java.util.Optional;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import com.hospital.HospitalManagement.Entity.AppAdmin;


public interface AppAdminRepository extends CrudRepository<AppAdmin,String>{
	
	@Query(value="Select * from app_Admin where user_Id=?1", nativeQuery=true)
	public Optional<AppAdmin> getLoginDetails(String userID);

}
