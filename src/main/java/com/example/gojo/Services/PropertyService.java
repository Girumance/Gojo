package com.example.gojo.Services;



import com.example.gojo.Components.FilterWrapper;
import com.example.gojo.Domain.Property;
import com.example.gojo.Repository.PropertyRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Optional;
import java.util.logging.Filter;
import java.util.stream.Collectors;

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


    public boolean approveProperty(String id) {
        System.out.println(id);
        Property property = propertyRepository.findPropertyById(id);
        propertyRepository.deleteById(id);
        property.setApproved(true);
        propertyRepository.save(property);

        return true;
    }


    public Object Filter(FilterWrapper wrapper){

        boolean propertyfor= String.valueOf(wrapper.getPropertyFor()).equals("All") ? true : false;
        boolean beds = wrapper.getBeds().equals("0") ? true : false;
        boolean type = String.valueOf(wrapper.getPropertyType()).equals("All") ? true : false;


        return propertyRepository.findAllByCityAndApproved(wrapper.getCity(),true).stream().filter(x ->
                ((x.getPrice() > Integer.valueOf(wrapper.getMin()) && x.getPrice() < Integer.valueOf( wrapper.getMax())) &&
                        (beds ? true  : ( x.getNo_Of_BedRooms().equals(wrapper.getBeds()))) &&
                        (propertyfor ? true :  (String.valueOf(x.getPropertyFor()).equals(wrapper.getPropertyFor()))) &&
                        (type ? true : String.valueOf(x.getPropertyType()).equals(wrapper.getPropertyType()))
                )


        ).collect(Collectors.toList());
    }
}
