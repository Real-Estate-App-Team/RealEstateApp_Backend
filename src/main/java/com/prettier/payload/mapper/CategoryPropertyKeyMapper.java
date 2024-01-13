package com.prettier.payload.mapper;

import com.prettier.config.MapStructConfig;
import com.prettier.entity.concretes.Category;
import com.prettier.entity.concretes.CategoryPropertyKey;
import com.prettier.payload.request.concretes.CategoryPropertyKeyRequest;
import com.prettier.payload.request.concretes.CategoryPropertyKeyUpdateRequest;
import com.prettier.payload.response.concretes.CategoryPropertyKeyResponse;
import org.mapstruct.*;
import org.mapstruct.factory.Mappers;

import java.util.Set;

@Mapper(config = MapStructConfig.class,
        uses = {CategoryMapper.class},
        nullValueMappingStrategy = NullValueMappingStrategy.RETURN_DEFAULT,
        nullValuePropertyMappingStrategy = NullValuePropertyMappingStrategy.IGNORE)
public interface CategoryPropertyKeyMapper {

    CategoryPropertyKeyMapper INSTANCE = Mappers.getMapper(CategoryPropertyKeyMapper.class);

    Set<CategoryPropertyKeyResponse> toResponseSet(Set<CategoryPropertyKey> categoryPropertyKeySet);

    CategoryPropertyKey toCategoryPropertyKey(CategoryPropertyKeyRequest categoryPropertyKeyRequest);

    @Mapping(target = "category", source = "categoryPropertyKeyUpdateRequest")
    CategoryPropertyKey toUpdatedCategoryPropertyKey(CategoryPropertyKeyUpdateRequest categoryPropertyKeyUpdateRequest, @MappingTarget CategoryPropertyKey existing);




}
