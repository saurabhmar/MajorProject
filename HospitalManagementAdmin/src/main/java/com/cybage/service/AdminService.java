 package com.cybage.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cybage.model.Admin;
import com.cybage.model.Doctors;
import com.cybage.repository.AdminRepository;

@Service
public class AdminService {
@Autowired
private AdminRepository adminRepository;
	public Admin addAdmin(Admin admin) 
{
	 return adminRepository.save(admin);
			
}
	public List<Admin> getAllAdmins(Admin admin) 
	{
		return adminRepository.findAll();

	}
	public Admin getAdminById(int id) 
{
	 return adminRepository.findById(id)
	 .orElse(null);
			
}
	public  void deleteAdmin(int id) {
		
		 adminRepository.deleteById(id);
						
	}
	
	
	
	
	public Admin updateAdmin(int id,Admin admin) {
		
		Admin admin1=adminRepository.findById(id).get();
		if(admin.getAdminName()!=null)
		admin1.setAdminName(admin.getAdminName());
		//if(admin.getPrice()!=0)
		//admin1.setPrice(admin.getPrice());
		
		 return adminRepository.save(admin);
			
	}
	


	public List<Admin> getAdminByName(String name) {
		// TODO Auto-generated method stub
		return null;
	}
	public boolean unBlockDoctorAccount(Long doctorId) {
		// TODO Auto-generated method stub
		return false;
	}
	public List<Admin> getAllPatients() {
		// TODO Auto-generated method stub
		return null;
	}
	public boolean unBlockPatientAccount(Long patientId) {
		// TODO Auto-generated method stub
		return false;
	}
	public boolean addDoctor(Doctors doctor) {
		// TODO Auto-generated method stub
		return false;
	}
	public void deleteDoctor(int id) {
		// TODO Auto-generated method stub
		
	}
	public void updateDoctor(int id, Admin admin) {
		// TODO Auto-generated method stub
		
	}
	public Admin getDoctorById(int id) {
		// TODO Auto-generated method stub
		return null;
	}
	public List<Admin> getAllDoctorWithpecialization(int specializationId) {
		// TODO Auto-generated method stub
		return null;
	}
	public void updateDoctor(int id, Doctors doctor) {
		// TODO Auto-generated method stub
		
	}


}
