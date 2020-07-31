package com.example.gojo.Repository;

import com.example.gojo.Domain.Profile;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface ProfileRepository extends MongoRepository<Profile,String> {

    public Profile findByEmail(String email);
}
