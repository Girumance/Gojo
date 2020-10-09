package com.example.gojo.Repository;

import com.example.gojo.Domain.Message;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;



@Repository
public interface MessageRepository extends MongoRepository<Message,String> {

    ArrayList<Message> findAllByReciverId(String id);



}
