package com.cybage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.util.LinkedMultiValueMap;
import org.springframework.util.MultiValueMap;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cybage.exception.InvalidInput;
import com.cybage.exception.RecordException;
import com.cybage.model.Patient;

import com.cybage.service.PatientService;

@RestController
@RequestMapping("/Patient")
@CrossOrigin
public class PatientController {
	@Autowired
	PatientService patientservice;
	
	@GetMapping("/hello")
	public String hello() {
		return "something from hello mapping";
	}
	
	@GetMapping("/getPatientById/{id}")
	public ResponseEntity<Patient>getPatientById(@PathVariable String id){
		MultiValueMap<String,String> headers=new LinkedMultiValueMap<String,String>();
		headers.add("headerMap1","headerValue1");
		
		boolean isInt=false;
		try {
			Integer.parseInt(id);
			isInt=true;
		}catch(NumberFormatException e) {
			isInt=false;
		}
		Patient patient=new Patient();
		if(isInt) {
			patient=PatientService.getPatientById(Integer.parseInt(id));
			if(patient==null)
				throw new RecordException("Patient not found");
		}
		else {
			throw new InvalidInput("Invalid input");
		}
		return new ResponseEntity<Patient>(patient,headers,HttpStatus.OK);
	}
	
	@GetMapping("/getPatientByName/{name}")
	public ResponseEntity<Patient> getPatientsByName(@PathVariable String name) {
		MultiValueMap<String, String> headers = new LinkedMultiValueMap<String, String>();
		headers.add("headerkey1", "headerValue1");
		return new ResponseEntity<Patient>(PatientService.getPatientByName(name), headers, HttpStatus.OK);
	}
	
	@PostMapping("/addPatient")
	public ResponseEntity<String> addPatient(@RequestBody Patient patient) {
		boolean isPatientAdded = PatientService.addPatient(patient);
		if (isPatientAdded)
			return new ResponseEntity<String>("Patient added successfully.", HttpStatus.CREATED);
		else
			return new ResponseEntity<String>("Some error.", HttpStatus.BAD_REQUEST);
	}
	
	@GetMapping("/delete/{id}")
	public ResponseEntity<String> deletePatientById(@PathVariable int id) {
		Patient patient = PatientService.getPatientById(id);
		boolean isPatientDeleted = PatientService.deletePatient(patient);
		if (isPatientDeleted)
			return new ResponseEntity<String>("Patient deleted successfully.", HttpStatus.CREATED);
		else
			return new ResponseEntity<String>("Some error.", HttpStatus.BAD_REQUEST);
	}
	
	@PutMapping("/update")
	public ResponseEntity<String> updatePatientById(@RequestBody Patient patient) {
		boolean isPatientUpdated = PatientService.updatePatient(patient);
		if (isPatientUpdated)
			return new ResponseEntity<String>("Patient updated successfully.", HttpStatus.CREATED);
		else
			return new ResponseEntity<String>("Some error.", HttpStatus.BAD_REQUEST);
	}
	
	@GetMapping("/show")
	public ResponseEntity<List<Patient>> getAllPatients() {
		List<Patient> allPatients = PatientService.getAllPatients();
		return new ResponseEntity<List<Patient>>(allPatients, HttpStatus.OK);
	}

}
