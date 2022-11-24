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
@Table(name = "feedback")


public class Complaints{


    @Id
    @GeneratedValue
    @Min
    @Max

    @Column(name="Id");
    @NotNull
    @Unique
    private int Id;


    @Column(name="pId")
    @NotNull
    private int pId;



    @Column(name="dId");
    @NotNull
    private String doctorName;


    @Column(name="text");
    @NotNull
    private String text;


    @Column(name="date");
    @NotNull
    private String date;



    


}

