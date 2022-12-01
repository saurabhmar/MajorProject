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

import com.cybage.model.Complaints;
import com.cybage.service.complaintsService;

@RestController
@RequestMapping("/complaints")
public class complaintsController {
	@Autowired
	private ComplaintsService complaintsService;

	@PostMapping("/addcomplaints")
	public ResponseEntity<String> addComplaints(@RequestBody Complaints complaints) {
		Complaints complaints1 = complaintsService.addComplaints(complaints);
		return new ResponseEntity<String>("record added successfully", HttpStatus.CREATED);

	}

	@GetMapping("/getallcomplaintss")
	public ResponseEntity<List<Complaints>> getAllComplaintss() {
		List<Complaints> complaintsList = complaintsService.getAllComplaintss(null);
		return new ResponseEntity<List<Complaints>>(complaintsList, HttpStatus.OK);
	}


	///DELETE complaints

	@DeleteMapping("/delete{id}")
	public ResponseEntity<String> deleteComplaints(@PathVariable int id) {
		complaintsService.deleteComplaints(id);
		Complaints complaints = complaintsService.getComplaintsById(id);

		return new ResponseEntity<String>("Complaints deleteddddd successfully", HttpStatus.CREATED);

	}
}




























































