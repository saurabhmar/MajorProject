

package com.cybage.model;

import java.util.List;
import java.util.Set;


import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.Column;
import jakarta.persistence.ColumnResult;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;

@NoArgsConstructor
//@AllArgsConstructor
//@Getter
//@Setter
//@ToString
@Entity
@Table(name = "admin")

public class Admin{




	public Admin(int id, @NotNull String adminName, @NotNull String email, @NotNull String password,
			@NotNull String mobileNumber, @NotNull String gender, @NotNull String statusOfAccount,
			@NotNull String attemptsOfLogin, String profileUrl) {
		super();
		this.id = id;
		AdminName = adminName;
		this.email = email;
		Password = password;
		this.mobileNumber = mobileNumber;
		this.gender = gender;
		this.statusOfAccount = statusOfAccount;
		this.attemptsOfLogin = attemptsOfLogin;
		ProfileUrl = profileUrl;
	}


	@Id
    @GeneratedValue
   
    @Column(name="id")
    private int id;
    @Column(name="AdminName")
    @NotNull
    private String AdminName;


    @Column(name="email")
    @NotNull
    private String email;


    @Column(name="Password")
    @NotNull 
    private String Password;

    @Column(name="mobileNumber")
    @NotNull
    private String mobileNumber;


    @Column(name="gender")
    @NotNull
    private String gender;


    @Column(name="statusOfAccount")
    @NotNull
    private String statusOfAccount;


    @Column(name="attemptsOfLogin")
    @NotNull
    private String attemptsOfLogin;



	@Column(name = "adminProfileUrl")
	private String ProfileUrl;



	public void setAdminName(Object adminName2) {
		// TODO Auto-generated method stub
		
	}


	public Object getAdminName() {
		// TODO Auto-generated method stub
		return null;
	}


	public int getId() {
		return id;
	}


	public void setId(int id) {
		this.id = id;
	}


	public String getEmailId() {
		return email;
	}


	public void setEmailId(String emailId) {
		this.email= email;
	}


	public String getPassword() {
		return Password;
	}


	public void setPassword(String password) {
		Password = password;
	}


	public String getMobileNumber() {
		return mobileNumber;
	}


	public void setMobileNumber(String mobileNumber) {
		this.mobileNumber = mobileNumber;
	}


	public String getGender() {
		return gender;
	}


	public void setGender(String gender) {
		this.gender = gender;
	}


	public String getStatusOfAccount() {
		return statusOfAccount;
	}


	public void setStatusOfAccount(String statusOfAccount) {
		this.statusOfAccount = statusOfAccount;
	}


	public String getAttemptsOfLogin() {
		return attemptsOfLogin;
	}


	public void setAttemptsOfLogin(String attemptsOfLogin) {
		this.attemptsOfLogin = attemptsOfLogin;
	}


	public String getProfileUrl() {
		return ProfileUrl;
	}


	public void setProfileUrl(String profileUrl) {
		ProfileUrl = profileUrl;
	}


	public void setAdminName(String adminName) {
		AdminName = adminName;
	}


	@Override
	public String toString() {
		return "Admin [id=" + id + ", AdminName=" + AdminName + ", email=" + email + ", Password=" + Password
				+ ", mobileNumber=" + mobileNumber + ", gender=" + gender + ", statusOfAccount=" + statusOfAccount
				+ ", attemptsOfLogin=" + attemptsOfLogin + ", ProfileUrl=" + ProfileUrl + "]";
	}
 
	


}
