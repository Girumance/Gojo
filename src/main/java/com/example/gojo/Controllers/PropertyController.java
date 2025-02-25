package com.example.gojo.Controllers;

import com.example.gojo.Components.FilterWrapper;
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

    @GetMapping("/approve/{id}")
    public boolean makeItApproved(@PathVariable String id){

        return  propertyService.approveProperty(id);
    }



    @PostMapping("/filter")
    public Object minMax(@RequestBody FilterWrapper wrapper){

        return propertyService.Filter(wrapper);
    }


    @GetMapping("/getById/{id}")
    public Property getPropertyById(@PathVariable String id){

        return propertyService.findPropertyById(id);
    }


    @GetMapping("delete/{id}")
    public int deleteById(@PathVariable String id){

        return propertyService.deleteById(id);
    }

    @GetMapping("/count")
    public long totalProperty(){
        return  propertyService.totalProperties();
    }


    @PostMapping("/update/{id}")
    public boolean updateProperty(@RequestBody Property property,@PathVariable String id){

        return propertyService.updateProperty(property,id);
    }

}
