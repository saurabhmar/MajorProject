package com.cybage.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.NotNull;







@Entity
@Table(name = "complaints")




public class Complaints{

    @Id
    @GeneratedValue
    
    @Column(name="complaintsId")
   
    private int Id;


    @Column(name="pId")

    private int pId;



    @Column(name="dId")
    
    private String doctorName;


    @Column(name="text")
    
    private String text;


    @Column(name="date")
    
    private String date;


    @Column(name="status")
    
    private String status;


    @Column(name="reminder")
    
    private String reminder;


	public int getId() {
		return Id;
	}


	public void setId(int id) {
		Id = id;
	}


	public int getpId() {
		return pId;
	}


	public void setpId(int pId) {
		this.pId = pId;
	}


	public String getDoctorName() {
		return doctorName;
	}


	public void setDoctorName(String doctorName) {
		this.doctorName = doctorName;
	}


	public String getText() {
		return text;
	}


	public void setText(String text) {
		this.text = text;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getReminder() {
		return reminder;
	}


	public void setReminder(String reminder) {
		this.reminder = reminder;
	}


    


}