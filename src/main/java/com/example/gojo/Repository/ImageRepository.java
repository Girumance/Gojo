package com.example.gojo.Repository;

import com.example.gojo.Domain.ImageStorage;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;

@Repository
public interface ImageRepository extends MongoRepository<ImageStorage,String> {

    public ImageStorage findImageStorageByOwnerId(String id);


    public ImageStorage findImageStorageByOwnerIdAndProfile(String ownerId, boolean profile);
    public ImageStorage findImageStorageByOwnerIdAndFileName(String ownerid,String filename);

    public ArrayList<ImageStorage> findAllByOwnerId(String id);

}