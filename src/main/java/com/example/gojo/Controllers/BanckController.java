package com.example.gojo.Controllers;


import com.example.gojo.Components.BankWrapper;
import com.example.gojo.Services.BankService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/bank")
public class BanckController {

    @Autowired
    BankService bankService;

    @PostMapping("/pay")
    public int pay(@RequestBody BankWrapper wrapper){

        return bankService.pay(wrapper);

    }
}
