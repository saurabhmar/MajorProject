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
import javax.validation.constraints.Size;

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
@Table(name = "Admin")

public class Admin{


    @Id
    @GeneratedValue
   
    @Column(name="AdminId")
    private int AdminId;
   
    @Column(name="AdminFirstName")
    @NotNull
    private String AdminFirstName;

    @Column(name="AdminLastName")
    @NotNull
    private String AdminLastName;

    
    @Column(name="Email")
    @NotNull
    private String Email;

    @Size(min=6,message="Password not long enough")
    @Column(name="Password")
    @NotNull 
    private String Password;
    
    @Max(value = 10)
    @Column(name="Contact")
    @NotNull
    private String Contact;




   


}
