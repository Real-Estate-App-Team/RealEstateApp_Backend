package com.prettier.payload.mapper;

import com.prettier.entity.concretes.Favorite;
import com.prettier.payload.request.concretes.FavoriteRequest;
import com.prettier.payload.response.concretes.FavoriteResponse;
import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;


import java.util.List;

@Mapper
public interface FavoriteMapper {

    FavoriteMapper INSTANCE = Mappers.getMapper(FavoriteMapper.class);

    Favorite toFavorite(FavoriteRequest favoriteRequest);

    FavoriteResponse toResponse(Favorite favorite);

    List<FavoriteResponse> toResponseList(List<Favorite> favorites);

//    @Autowired
//    private ModelMapper modelMapper;
//
//    public Favorite toFavorite(FavoriteRequest favoriteRequest) {
//
//        return modelMapper.map(favoriteRequest, Favorite.class);
//    }
//
//    public FavoriteResponse toResponse(Favorite favorite) {
//
//        return modelMapper.map(favorite, FavoriteResponse.class);
//    }
//    public List<FavoriteResponse> toResponseList(List<Favorite> favorites) {
//
//        return (List<FavoriteResponse>) modelMapper.map(favorites, FavoriteResponse.class);
//    }
}
