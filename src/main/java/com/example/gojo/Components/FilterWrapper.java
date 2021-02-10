package com.example.gojo.Components;

import com.example.gojo.Constant.PropertyFOr;
import com.example.gojo.Constant.PropertyType;
import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class FilterWrapper {

    private String min;
    private String max;
    private String city;
    private String propertyFor;
    private String PropertyType;
    private String beds;


}
