package com.example.gojo.Domain;


import com.example.gojo.Constant.PropertyFOr;
import com.example.gojo.Constant.PropertyType;
import lombok.Data;
import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import org.springframework.stereotype.Component;

import javax.persistence.GeneratedValue;
import java.util.ArrayList;
import java.util.Date;

@Data
@Document
@Component
public class Property {

    @Id
    @GeneratedValue
    private String id;
    private String Titile;
    private String Description;
    private int price;
    private String area;
    private PropertyType propertyType;
    private PropertyFOr propertyFor;
    private String No_Of_BedRooms;
    private String No_of_Bathrooms;
    private ArrayList<String> Amenities;
    private Date date=new Date();
    private String Region;
    private String location;
    private String city;
    private String OwnerId;
    private boolean payed=false;
    private boolean approved=false;



    public void setPropertyType(String role){

        this.propertyType=PropertyType.valueOf(role);
    }

    public String getAccountType(){

        return String.valueOf(propertyType);
    }

}
