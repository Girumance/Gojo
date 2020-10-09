package com.example.gojo.Services;


import com.example.gojo.Domain.Property;
import com.example.gojo.Repository.PropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class PropertyService {

    @Autowired
    private PropertyRepository propertyRepository;

    public Property createProperty(Property property){

            Property prop=propertyRepository.insert(property);

        return prop;
    }

    public boolean removeProperty(String id) {

        propertyRepository.deleteById(id);


        return true;
    }

    public ArrayList<Property> getPropertyByOwnerId(String id){

            ArrayList<Property> property = propertyRepository.findAllByOwnerId(id);
        return  property;
    }


    public ArrayList<Property> getPropertyByCityContains(String city){

        ArrayList<Property> property = propertyRepository.findAllByCityAndApproved(city,true);
        return  property;
    }

    public boolean updateProperty(Property property){


        return true;
    }

    public ArrayList<Property> getAllByNotApproved(){
        return  propertyRepository.findAllByApproved(false);
    }
}
