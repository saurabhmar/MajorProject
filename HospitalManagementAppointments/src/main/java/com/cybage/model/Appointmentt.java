
package com.cybage.model;

import java.util.List;


import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Entity;
import jakarta.persistence.Table;



@Entity
@Table(name = "appointmnets")




public class Appointmentt{


    @Id
    

    @Column(name="Id")
    @NotNull
    @Unique
    private int Id;


    @Column(name="pId")
    @NotNull
    private int pId;



    @Column(name="dId")
    @NotNull
    private String doctorName;


    @Column(name="emailId")
    @NotNull
    private String emailId;


    @Column(name="time")
    @NotNull
    private String time;


    @Column(name="date")
    @NotNull
    private String date;


    @Column(name="prescribtion");
    @NotNull
    private String prescribtion;


    @Column(name="status");
    @NotNull
    private String status;


    @Column(name="ratings");
    @NotNull
    private String ratings;


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


	public String getEmailId() {
		return emailId;
	}


	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}


	public String getTime() {
		return time;
	}


	public void setTime(String time) {
		this.time = time;
	}


	public String getDate() {
		return date;
	}


	public void setDate(String date) {
		this.date = date;
	}


	public String getPrescribtion() {
		return prescribtion;
	}


	public void setPrescribtion(String prescribtion) {
		this.prescribtion = prescribtion;
	}


	public String getStatus() {
		return status;
	}


	public void setStatus(String status) {
		this.status = status;
	}


	public String getRatings() {
		return ratings;
	}


	public void setRatings(String ratings) {
		this.ratings = ratings;
	}
}