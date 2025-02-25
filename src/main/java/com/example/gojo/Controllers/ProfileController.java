package com.example.gojo.Controllers;


import com.example.gojo.Components.NewPassWrapper;
import com.example.gojo.Constant.AccountType;
import com.example.gojo.Domain.Profile;
import com.example.gojo.Services.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/profile")
public class ProfileController {

    @Autowired
    private ProfileService service;


    @PostMapping("/signup")
    public boolean createAccount(@RequestBody Profile account){

        return  service.createAccount(account);

    }

    @GetMapping("/get/{id}")
    public Profile getProfile(@PathVariable  String id){

        return service.getById(id);
    }


    @PostMapping("/changePassword")
    public int changePassword(@RequestBody NewPassWrapper newPassWrapper){

        return service.changePassword(newPassWrapper);
    }

    @PostMapping("/update")
    public Profile updateAccount(@RequestBody Profile account){

        return service.updateAccount(account);

    }


    @GetMapping("getAll/{type}")
    public ArrayList<Profile> getAllbyAccountTpe(@PathVariable String type){
        AccountType typee= AccountType.valueOf(type);

        return service.getAllProfileByAccountType(typee);
    }

    @GetMapping("/SAVE")
    public void save(){
        service.addSuperAdmin();
        System.out.println("super Ademin saved");
    }


    @GetMapping("/delete/{id}")
    public boolean deleteUser(@PathVariable String id){

        return  service.deleteUser(id);
    }
}
