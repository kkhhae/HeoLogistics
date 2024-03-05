package com.heologistics.entity;


import jakarta.persistence.*;
import lombok.Data;

@Data
@Entity
public class UserData {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "USER_NUMBER")
    private int userNumber;

    @Column(name = "USER_NAME")
    private String userName;
    @Column(name = "USER_AGE")
    private int userAge;
    @Column(name = "USER_ADDRESS")
    private String userAddress;

}
