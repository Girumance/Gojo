package com.example.gojo.Domain;


import lombok.Data;
import org.springframework.data.mongodb.core.mapping.Document;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Data
@Document
public class Bank {


    @GeneratedValue
    @Id
    private String id;
    private String firstName;
    private String lastName;
    private String phoneNumber;
    private String password;
    private double deposit;


}
