package com.example.gojo.Domain;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;


import javax.persistence.GeneratedValue;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

@Data
@Document
@Component
public class Message {

    @Id
    @GeneratedValue
    private String id;
    private String reciverId;
    private String propertyId;
    private String firstName;
    private String lastName;
    private String email;
    private String phone;
    private String message;
    Date dateobj = new Date();

}
