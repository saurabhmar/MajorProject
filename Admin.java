

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
@AllArgsConstructor
@Getter
@Setter
@ToString
@Entity
@Table(name = "admin")

public class Admin{


    @Id
    @GeneratedValue
   
    @Column(name="id")
    private int id;
    @Column(name="AdminName")
    @NotNull
    private String AdminName;


    @Column(name="emailId")
    @NotNull
    private String emailId;


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


	public Object getPrice() {
		// TODO Auto-generated method stub
		return null;
	}


	public void setPrice(Object price) {
		// TODO Auto-generated method stub
		
	}
 
	


}
