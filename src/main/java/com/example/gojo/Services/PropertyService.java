package com.example.gojo.Services;


import com.example.gojo.Domain.Property;
import org.springframework.stereotype.Service;

@Service
public class PropertyService {

    public boolean createProperty(Property property){


        return true;
    }

    public boolean removeProperty(Property property) {

        return true;
    }

    public Property getPropertyByOwnerId(String id){


        return  new Property();
    }

    public boolean updateProperty(Property property){


        return true;
    }
}
