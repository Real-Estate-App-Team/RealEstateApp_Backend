package com.prettier.payload.mapper;

import com.prettier.entity.concretes.Advert;
import com.prettier.entity.concretes.Category;
import com.prettier.payload.request.concretes.AdvertRequest;
import com.prettier.payload.request.concretes.CategoryRequest;
import com.prettier.payload.response.concretes.AdvertResponse;
import com.prettier.payload.response.concretes.CategoryResponse;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class AdvertMapper {

    private ModelMapper modelMapper;

    public Advert toAdvert(AdvertRequest advertRequest) {
        return modelMapper.map(advertRequest, Advert.class);
    }

    public Advert toUpdatedAdvert(AdvertRequest advertRequest, Advert existAdvert) {

        modelMapper.map(advertRequest, Advert.class);
        return existAdvert;
    }

    public AdvertResponse toResponse(Advert advert) {
        return modelMapper.map(advert, AdvertResponse.class);
    }


}
