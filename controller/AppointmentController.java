package com.cybage.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cybage.model.Appointment;
import com.cybage.service.AppointmentService;

@RestController
@RequestMapping("/Appointment")
@CrossOrigin
public class AppointmentController {
	@Autowired
	AppointmentService appointmentservice;
	
	@PostMapping("/addAppointment")
	public ResponseEntity<Appointment> addAppointment(@RequestBody Appointment appointment){
		Appointment isappointmentAdded=appointmentservice.addAppointment(appointment);
		return new ResponseEntity<Appointment>(isappointmentAdded,HttpStatus.CREATED);
	}
	
	@PutMapping("/confirm/{id}")
	public ResponseEntity<Appointment> updateAppointmentStaus(@PathVariable int id, @RequestBody Appointment appointment){
		Appointment updatedApoointment =appointmentservice.updateStatusToConmfirm(id, appointment);
		return new ResponseEntity<Appointment>(updatedApoointment,HttpStatus.OK);
	}
	
	@PutMapping("/delcine/{id}")
	public ResponseEntity<Appointment> updateAppointmentStautsdec(@PathVariable int id, @RequestBody Appointment appointment){
		Appointment updatedApoointment =appointmentservice.updateStatusToDecline(id, appointment);
		return new ResponseEntity<Appointment>(updatedApoointment,HttpStatus.OK);
	}
	
}
