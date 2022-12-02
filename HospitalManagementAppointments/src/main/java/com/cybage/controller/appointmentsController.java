
package com.cybage.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.cybage.model.Appointmentt;
import com.cybage.service.appointmentsService;

@RestController
@RequestMapping("/appointments")
@CrossOrigin
public class appointmentsController {

	@Autowired
	AppointmentsService appointmentsService;

	@GetMapping("/fetchallappointments")
	public ResponseEntity<List<Appointmentt>> getAllAppointments() {
		List<Appointmentt> appointment1 = appointmentsService.getAppointments();
		return new ResponseEntity<List<Appointmentt>>(appointment1, HttpStatus.OK);
	}

	@PostMapping("/addappointments")
	public ResponseEntity<String> addAppointment(@RequestBody Appointmentt appointmentt) {
		String appointment1 = appointmentsService.addAppointment(appointmentt);
		return new ResponseEntity<String>(appointment1, HttpStatus.BAD_REQUEST);
	}

	@PutMapping("/updateappointmentt/{appointmentId}")
	public ResponseEntity<String> updateAppointment(@RequestBody Appointmentt appointmentt,
			@PathVariable int appointmentId) {
		String appointment1 = appointmentsService.updateAppointment(appointmentt,
				appointmentId);
		return new ResponseEntity<String>(appointment1, HttpStatus.BAD_REQUEST);
	}

	@GetMapping("/change-status/{appointmentId}/{status}")
	public ResponseEntity<String> changeAppointmentStatus(@PathVariable int appointmentId,
			@PathVariable String status) {
		String appointment1 = appointmentsService.changeAppointmentStatus(appointmentId, status);
		return new ResponseEntity<String>(appointment1, HttpStatus.OK);
	}

}
