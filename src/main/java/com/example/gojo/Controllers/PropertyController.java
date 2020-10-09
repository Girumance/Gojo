package com.example.gojo.Controllers;

import com.example.gojo.Domain.Property;
import com.example.gojo.Services.PropertyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/property")
public class PropertyController {

    @Autowired
    private PropertyService propertyService;

    @PostMapping("/save")
    public Property saveProperty(@RequestBody  Property property){

        return propertyService.createProperty(property);

    }

    @PostMapping("/remove")
    public boolean removeProperty(@RequestBody String id){

        return  propertyService.removeProperty(id);


    }

    @GetMapping("/owner/{id}")
    public ArrayList<Property> getPropertyByOwnerId(@PathVariable("id") String id){



        return  propertyService.getPropertyByOwnerId(id);

    }

    @GetMapping("/city/{city}")
    public ArrayList<Property> getPropertyByCity(@PathVariable String city){

        return propertyService.getPropertyByCityContains(city);
    }


    @GetMapping("/notApproved")
    public ArrayList<Property> getAllNotApproved(){

        return propertyService.getAllByNotApproved();
    }



}
