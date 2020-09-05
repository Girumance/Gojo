package com.example.gojo.Domain;


import com.example.gojo.Constant.PropertyFOr;
import com.example.gojo.Constant.PropertyType;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

import javax.persistence.GeneratedValue;
import java.util.ArrayList;

@Data
@Document
@Component
public class Property {

    @Id
    @GeneratedValue
    private String Id;
    private String Titile;
    private String Description;
    private String price;
    private PropertyType propertyType;
    private PropertyFOr propertyFor;
    private int No_Of_BedRooms;
    private ArrayList<String> Amenities;
    private String date;
    private String Region;
    private String location;
    private String city;
    private String OwnerId;
}
