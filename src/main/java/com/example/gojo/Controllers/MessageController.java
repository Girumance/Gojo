package com.example.gojo.Controllers;



import com.example.gojo.Domain.Message;
import com.example.gojo.Services.Messageservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@RequestMapping("/message")
public class MessageController {


    @Autowired
    Messageservice messageservice;


    @PostMapping("/save")
    public boolean saveMessage(@RequestBody Message message){


        return messageservice.saveMessage(message);

    }



    @GetMapping("getbyreciverid/{id}")
    public ArrayList<Message> getAllMessagesByReciverId(@PathVariable String id){


        return messageservice.getMessageByReciverId(id);
    }
}
