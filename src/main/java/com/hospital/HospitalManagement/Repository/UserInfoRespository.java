package com.hospital.HospitalManagement.Repository;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.hospital.HospitalManagement.Entity.UserInfo;
@Repository
public interface UserInfoRespository extends CrudRepository<UserInfo,String>{

//	@Transactional
//	@Query(value="Select * from app_Admin where user_Id=?1", nativeQuery=true)
//	public Optional<AppAdmin> getLoginDetails(String userID);
}
