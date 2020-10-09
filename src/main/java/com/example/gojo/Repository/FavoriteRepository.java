package com.example.gojo.Repository;

import com.example.gojo.Domain.Favorite;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


@Repository
public interface FavoriteRepository extends MongoRepository<Favorite,String> {

    Favorite findByLikerIdAndPropertyid(String likerid, String propertyid);
    boolean deleteByLikerIdAndPropertyid(String likerid,String propertyid);

}
