package com.example.gojo.Services;

import com.example.gojo.Domain.Message;
import com.example.gojo.Repository.MessageRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;

@Service
public class Messageservice {

    @Autowired
    private MessageRepository messageRepository;

    public boolean saveMessage(Message message){

        return messageRepository.save(message)!=null ? true : false;
    }

    public boolean deleteMessageById(String id){

        messageRepository.deleteById(id);

        return  true;

    }

    public ArrayList<Message> getMessageByReciverId(String id){

        return messageRepository.findAllByReciverId(id);
    }
}
