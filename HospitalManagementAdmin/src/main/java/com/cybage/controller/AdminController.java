package com.cybage.controller;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import com.cybage.exception.RecordNotFoundException;
import com.cybage.model.Admin;
import com.cybage.model.Doctors;
import com.cybage.service.AdminService;

@RestController
@RequestMapping("/admin")
public class AdminController {
	@Autowired
	private AdminService adminService;

	@PostMapping("/")
	public ResponseEntity<String> addAdmin(@RequestBody Admin admin) {
		Admin admin1 = adminService.addAdmin(admin);
		return new ResponseEntity<String>("record added successfully", HttpStatus.CREATED);

	}

	@GetMapping("/")
	public ResponseEntity<List<Admin>> getAllAdmins() {
		List<Admin> adminList = adminService.getAllAdmins(null);
		return new ResponseEntity<List<Admin>>(adminList, HttpStatus.OK);
	}

	@GetMapping("/{id}")
	public ResponseEntity<Admin> getAdmin(@PathVariable int id) throws RecordNotFoundException {
		Admin admin = adminService.getAdminById(id);
		if (admin == null)
			throw new RecordNotFoundException("Admin not found.................");
		return new ResponseEntity<Admin>(adminService.getAdminById(id), HttpStatus.OK);

	}
	///DELETE ADMIN

	@DeleteMapping("/delete{id}")
	public ResponseEntity<String> deleteAdmin(@PathVariable int id) {
		adminService.deleteAdmin(id);
		Admin admin = adminService.getAdminById(id);

		return new ResponseEntity<String>("Admin del successfully", HttpStatus.CREATED);

	}
	//UPDATE ADMIN

	@PutMapping("/update{id}")
	public ResponseEntity<String> updateAdmin(@PathVariable int id, @RequestBody Admin admin) {
	adminService.updateAdmin(id, admin);
		return new ResponseEntity<String>("Admin updated successfully", HttpStatus.CREATED);

	}
	// GET ADMIN BY NAME 
	
	 @GetMapping("/name{name}")
	 public ResponseEntity<List<Admin>> getAdmin(@PathVariable String name) {
		 List<Admin> adminList =(List<Admin>) adminService.getAdminByName(name);
		 
		 return new ResponseEntity<List<Admin>>(adminList, HttpStatus.OK);}
	 
	 
	 
	 
	 
	 
	 
	 
	 //specialiazation
	 
	 @GetMapping("/specializationdoctor/{specializationId}")
		public ResponseEntity<List<Admin>> getAllDoctorWithSpecialization(@PathVariable int specializationId) {
			List<Admin> allDoctors = adminService.getAllDoctorWithpecialization(specializationId);
			return new ResponseEntity<List<Admin>>(allDoctors, HttpStatus.OK);
		}
	 
	 
	 //ADD DOCTOR
	 
	 @PostMapping("/doctoradd")
		public ResponseEntity<String> addDoctor(@RequestBody Doctors doctor) {
			boolean wasDoctorRegistered = adminService.addDoctor(doctor);
			if (wasDoctorRegistered)
				return new ResponseEntity<String>("Doctor was registered successfully...........", HttpStatus.CREATED);
			else
				return new ResponseEntity<String>("Doctor was not registered successfully.........", HttpStatus.BAD_REQUEST);

		}
	 
	 
	 @PutMapping("/updateDoctor{id}")
		public ResponseEntity<String> updateDoctor(@PathVariable int id, @RequestBody Doctors doctor) {
		adminService.updateDoctor(id, doctor);
			return new ResponseEntity<String>("doctor updated successfully", HttpStatus.CREATED);

		}
	 @DeleteMapping("/deleteDoctor{id}")
		public ResponseEntity<String> deleteDoctor(@PathVariable int id) {
			adminService.deleteDoctor(id);
			Doctors doctor = adminService.getDoctorById(id);

			return new ResponseEntity<String>("doctor deleteddddd successfully", HttpStatus.CREATED);

		}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 
 
	 //LIST PATIENTS
	 
	 @GetMapping("/get-patients-all")
		public ResponseEntity<List<Admin>> getAllPatients() {
		 
			List<Admin> patientAll = adminService.getAllPatients();
			
			
			return new ResponseEntity<List<Admin>>(patientAll, HttpStatus.OK);
		}
	 
	 
	 
	 
	 
	 
	 
	 
	 
	 //UNBLOCK DOCTOR
		 
	 @GetMapping("/unBlockDoctort/{id}")
		public ResponseEntity<String> unBlockDoctorAccount(@PathVariable Long doctorId) {
			boolean wasAccountUnBlockedSuccessfully = adminService.unBlockDoctorAccount(doctorId);
			if (wasAccountUnBlockedSuccessfully)
				return new ResponseEntity<String>("Doctor account was unblocked successfully..................", HttpStatus.OK);
			else
				return new ResponseEntity<String>("Wasnt able to unblock Doctor account.......", HttpStatus.BAD_REQUEST);
		}
	 
	 
	 //UNBLOCK PATIENT
	 @GetMapping("/unBlockPatient/{id}")
		public ResponseEntity<String> unBlockPatientAccount(@PathVariable Long patientId) {
			boolean wasAccountUnBlockedSuccessfully = adminService.unBlockPatientAccount(patientId);
			if (wasAccountUnBlockedSuccessfully)
				return new ResponseEntity<String>("Patient account was unblocked successfully..................", HttpStatus.OK);
			else
				return new ResponseEntity<String>("Wasnt able to unblock Doctor account.......", HttpStatus.BAD_REQUEST);
		}
		
	
	 
	 
	 
	// @GetMapping("/otplogin/{email}/{otp}")
		//public ResponseEntity<String> loginWithOTP( @PathVariable int otp,  @PathVariable String email) {
			//String loginWithOTP = adminService.verifyLoginWithOTP(email, otp);
			//return new ResponseEntity<String>(loginWithOTP, HttpStatus.OK);
		//}

	// @GetMapping("/emaillogin/{email}")
		//public ResponseEntity<String> loginWithEmail(@PathVariable String email) {
			//String loginUserReponse = usersService.loginUserByEmail(email);
			//return new ResponseEntity<String>(loginUserReponse, HttpStatus.OK);
		//}

}