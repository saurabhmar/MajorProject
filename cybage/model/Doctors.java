package com.cybage.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

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
@Table(name = "Doctors")
public class Doctors{


    @Id
    @GeneratedValue
    @Column(name="DoctorId")
    private int DoctorId;
   
    @Column(name="DoctorFirstName")
    @NotNull
    private String DoctorFirstName;

    @Column(name="DoctorLastName")
    @NotNull
    private String DoctorLastName;

    @Column(name="Email")
    @NotNull
    private String Email;

    @Size(min=6,max=13,message="Password not long enough")
    @Column(name="Password")
    @NotNull 
    private String Password;
   
    @Max(value = 10)
    @Column(name="Contact")
    @NotNull
    private String Contact;


    @Column(name="Gender")
    @NotNull
    private String Gender;


    @Column(name="AccountStatus")
    @NotNull
    private String AccountStatus;


    @Column(name="LoginAttempts")
    @NotNull
    private String LoginAttempts;


    @Column(name="Specialization")
    @NotNull
    private String Specialization;
}













