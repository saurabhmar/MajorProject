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
@Table(name = "doctor")


public class Doctors{


    @Id
    @GeneratedValue
    @Min
    @Max
    @Column(name="Id")
    private int Id;
    @Column(name="doctorName");
    @NotNull
    private String doctorName;


    @Column(name="emailId");
    @NotNull
    private String emailId;


    @Column(name="mobileNumber");
    @NotNull
    private String mobileNumber;


    @Column(name="gender");
    @NotNull
    private String gender;


    @Column(name="statusOfAccount");
    @NotNull
    private String statusOfAccount;


    @Column(name="attemptsOfLogin");
    @NotNull
    private String attemptsOfLogin;


    @Column(name="specialization");
    @NotNull
    private String specialization;
}














