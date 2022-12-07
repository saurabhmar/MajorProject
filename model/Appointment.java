package com.cybage.model;



import java.sql.Date;
import java.sql.Time;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.ManyToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Appointment")
public class Appointment {



	@Id
	@GeneratedValue
	@Column(name="AppointmentId")
	private int AppointmentId;
	
	@ManyToOne
	@JoinColumn(name="DoctorId")
	private int DoctorId;
	
	@ManyToOne
	@JoinColumn(name="PatientId")
	private int PatientId;
	
	@Column(name="AppointmentDate")
	private Date AppointmentDate;
	
	@Column(name="AppointmentTime")
	private Time AppointmentTime;
	
	@Column(name="AppointmentStatus")
	private String AppointmentStatus;
	
	public Appointment() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Appointment(int doctorId, int patientId, Date appointmentDate, Time appointmentTime,
			String appointmentStatus) {
		super();
		DoctorId = doctorId;
		PatientId = patientId;
		AppointmentDate = appointmentDate;
		AppointmentTime = appointmentTime;
		AppointmentStatus = appointmentStatus;
	}

	public int getAppointmentId() {
		return AppointmentId;
	}

	public void setAppointmentId(int appointmentId) {
		AppointmentId = appointmentId;
	}

	public int getDoctorId() {
		return DoctorId;
	}

	public void setDoctorId(int doctorId) {
		DoctorId = doctorId;
	}

	public int getPatientId() {
		return PatientId;
	}

	public void setPatientId(int patientId) {
		PatientId = patientId;
	}

	public Date getAppointmentDate() {
		return AppointmentDate;
	}

	public void setAppointmentDate(Date appointmentDate) {
		AppointmentDate = appointmentDate;
	}

	public Time getAppointmentTime() {
		return AppointmentTime;
	}

	public void setAppointmentTime(Time appointmentTime) {
		AppointmentTime = appointmentTime;
	}

	public String getAppointmentStatus() {
		return AppointmentStatus;
	}

	public void setAppointmentStatus(String appointmentStatus) {
		AppointmentStatus = appointmentStatus;
	}


	
	
	
	
}
