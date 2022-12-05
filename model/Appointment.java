package com.cybage.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="Appointment")
public class Appointment {

	@Id
	@GeneratedValue
	@Column(name="AppointmentId")
	private int AppointmentId;
	
	//@Column(name="")
	
}
