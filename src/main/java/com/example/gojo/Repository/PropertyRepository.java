package com.example.gojo.Repository;


import com.example.gojo.Domain.Property;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface PropertyRepository extends MongoRepository<Property,String> {
    @Query(value="{OwnerId:?0}")
    ArrayList<Property> findAllByOwnerId(String id);

    Property findPropertyById(String Id);
    //@Query(value="{city:?0}")
    ArrayList<Property> findAllByCityAndApproved(String city,boolean approved);
    ArrayList<Property> findAllByApproved(boolean approved);





}
