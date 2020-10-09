package com.example.gojo.Domain;


import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

import javax.persistence.GeneratedValue;

@Component
@Data
@Document
public class Favorite {


    @Id
    @GeneratedValue
    public String id;
    public String propertyid;
    public String likerId;

}
