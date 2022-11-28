package com.cybage.model;

import java.util.List;
import java.util.Set;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.Table;
import javax.validation.constraints.Max;
import javax.validation.constraints.NotNull;

import com.fasterxml.jackson.annotation.JsonIgnore;

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
@Table(name = "Complaints")




public class Complaints{


    @Id
    @GeneratedValue
 
    @Column(name="Id")
    @NotNull
    private int Id;


    @Column(name="PatientFirstName")
    @NotNull
    private int PatientFirstName;


    @Column(name="PatientLastName")
    @NotNull
    private int PatientLastName;

    @Column(name="DoctorFirstName")
    @NotNull
    private String DoctorFirstName;
  
    @Column(name="DoctorLastName")
    @NotNull
    private String DoctorLastName;

    @Max(value = 10)
    @Column(name="Contact")
    @NotNull
    private String Contact;
    
    @Column(name="text")
    @NotNull
    private String text;


    @Column(name="date")
    @NotNull
    private String date;


    @Column(name="Status")
    @NotNull
    private String Status;


    @Column(name="Reminder")
    @NotNull
    private String Reminder;


    


}