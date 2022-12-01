package com.cybage.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;




@Entity
@Table(name = "feedback")
public class Feedback {

	public Feedback(int feedbackId, String feedbackMessage, int starsOverall, int doctorName, int patientId) {
		super();
		this.feedbackId = feedbackId;
		this.feedbackMessage = feedbackMessage;
		this.starsOverall = starsOverall;
		this.doctorName = doctorName;
		this.patientId = patientId;
	}




	@Id
    @GeneratedValue

    @Column(name="feedbackId")
    private int feedbackId;
	
    @Column(name="feedbackMessage")
    
    private String feedbackMessage;
    
    @Column(name="starsOverall")
    
    private int starsOverall;
    
    @Column(name="doctorName")
   
    private int doctorName;
    
    
    
    
    @Column(name="patientId")
    
    private int patientId;




	public int getFeedbackId() {
		return feedbackId;
	}




	public void setFeedbackId(int feedbackId) {
		this.feedbackId = feedbackId;
	}




	public String getFeedbackMessage() {
		return feedbackMessage;
	}




	public void setFeedbackMessage(String feedbackMessage) {
		this.feedbackMessage = feedbackMessage;
	}




	public int getStarsOverall() {
		return starsOverall;
	}




	public void setStarsOverall(int starsOverall) {
		this.starsOverall = starsOverall;
	}




	public int getDoctorName() {
		return doctorName;
	}




	public void setDoctorName(int doctorName) {
		this.doctorName = doctorName;
	}




	public int getPatientId() {
		return patientId;
	}




	public void setPatientId(int patientId) {
		this.patientId = patientId;
	}




	@Override
	public String toString() {
		return "Feedback [feedbackId=" + feedbackId + ", feedbackMessage=" + feedbackMessage + ", starsOverall="
				+ starsOverall + ", doctorName=" + doctorName + ", patientId=" + patientId + "]";
	}


	
}