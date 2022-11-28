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

	@DeleteMapping("/delete{id}")
	public ResponseEntity<String> deleteAdmin(@PathVariable int id) {
		adminService.deleteAdmin(id);
		Admin admin = adminService.getAdminById(id);

		return new ResponseEntity<String>("Admin del successfully", HttpStatus.CREATED);

	}

	@PutMapping("/update{id}")
	public ResponseEntity<String> updateAdmin(@PathVariable int id, @RequestBody Admin admin) {
	adminService.updateAdmin(id, admin);
		return new ResponseEntity<String>("Admin updated successfully", HttpStatus.CREATED);

	}
	
	 @GetMapping("/name{name}")
	 public ResponseEntity<List<Admin>> getAdmin(@PathVariable String name) {
		 List<Admin> adminList =(List<Admin>) adminService.getAdminByName(name);
		 
		 return new ResponseEntity<List<Admin>>(adminList, HttpStatus.OK);}

		 
		
	

}