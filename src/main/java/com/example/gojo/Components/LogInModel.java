package com.example.gojo.Components;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class LogInModel {

    private String username;
    private String password;
}
