package com.prettier.config;

import com.prettier.payload.mapper.*;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class MapperConfig {

    @Bean
    public AdvertMapper advertMapper(){
        return new AdvertMapperImpl();
    }

    @Bean
    public CategoryMapper categoryMapper(){
        return new CategoryMapperImpl();
    }

    @Bean
    public CityMapper cityMapper(){
        return new CityMapperImpl();
    }

    @Bean
    public CountryMapper countryMapper(){
        return new CountryMapperImpl();
    }

    @Bean
    public DistrictMapper districtMapper(){
        return new DistrictMapperImpl();
    }

    @Bean
    public FavoriteMapper favoriteMapper(){
        return new FavoriteMapperImpl();
    }

}
