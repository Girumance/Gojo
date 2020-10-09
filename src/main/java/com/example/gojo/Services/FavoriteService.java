package com.example.gojo.Services;


import com.example.gojo.Domain.Favorite;
import com.example.gojo.Repository.FavoriteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class FavoriteService {


    @Autowired
    private FavoriteRepository favoriteRepository;



    public boolean saveFavorite(Favorite favorite){

        return favoriteRepository.save(favorite) != null ? true : false;

    }


    public boolean deleteFavorite(String likerid, String propertyid){

        return favoriteRepository.deleteByLikerIdAndPropertyid(likerid,propertyid);
    }


    public boolean findBylikeridandpropertyid(String id, String propertyid){

        return favoriteRepository.findByLikerIdAndPropertyid(id,propertyid) !=null ? true : false;
    }
}
