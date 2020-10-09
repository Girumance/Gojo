package com.example.gojo.Controllers;



import com.example.gojo.Domain.Favorite;
import com.example.gojo.Services.FavoriteService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/favorite")
public class FavoriteController {

    private FavoriteService favoriteService;


    @PostMapping("/save")
    public boolean saveFavorite(@RequestBody Favorite favorite){

        return  favoriteService.saveFavorite(favorite);

    }


    @GetMapping("/ismarked/{likerid}/{propertyid}")
    public boolean isMarked(@PathVariable  String likerid,@PathVariable String propertyid){
           System.out.println(likerid);
        return favoriteService.findBylikeridandpropertyid(likerid,propertyid);

    }

    @GetMapping("/removemarked/{likerid}/{propertyid}")
    public boolean removeMark(@PathVariable String likerid,@PathVariable String propertyid){

        return favoriteService.deleteFavorite(likerid,propertyid);

    }
}
