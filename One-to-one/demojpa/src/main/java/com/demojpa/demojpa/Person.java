package com.demojpa.demojpa;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.NoArgsConstructor;
import lombok.ToString;


@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ToString

public class Person {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private int age;

    private String emailAddress;

    @Column(columnDefinition = "nvarchar(25)")
    private String lastName;

    @Column(columnDefinition = "nvarchar(25)")
    private String firstName;


    @OneToOne
    @JoinColumn(name = "address_id")
    private Address address;
}
