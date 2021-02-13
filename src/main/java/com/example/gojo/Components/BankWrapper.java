package com.example.gojo.Components;


import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class BankWrapper {

    private String phoneNumber;
    private String password;
    private double payment;
    private String id;
}
