package com.example.gojo.Repository;


import com.example.gojo.Domain.Property;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface PropertyRepository extends MongoRepository<Property,String> {

    ArrayList<Property> findAllByOwnerId(String id);
}
