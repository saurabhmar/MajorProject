package com.cybage.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.NotNull;

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
@Table(name = "Appointment")




public class Appointment{


    @Id
    @GeneratedValue
    

    @Column(name="Id")
    @NotNull
   
    private int Id;


    @Column(name="PatientId")
    @NotNull
    private int PatientId;

    @Column(name="PatientFirstName")
    @NotNull
    private String PatientFirstName;
    

    @Column(name="PatientLastName")
    @NotNull
    private String PatientLastName;




    @Column(name="DoctorFirstName")
    @NotNull
    private String DoctorFirstName;
    

    @Column(name="DoctorLastName")
    @NotNull
    private String DoctorLastName;


    @Column(name="Specialization")
    @NotNull
    private String Specialization;



    @Column(name="Email")
    @NotNull
    private String Email;


    @Column(name="Time")
    @NotNull
    private String Time;


    @Column(name="date")
    @NotNull
    private String date;


    @Column(name="Prescription")
    @NotNull
    private String Prescription;


    @Column(name="status")
    @NotNull
    private String status;


    @Column(name="ratings")
    @NotNull
    private String ratings;
}