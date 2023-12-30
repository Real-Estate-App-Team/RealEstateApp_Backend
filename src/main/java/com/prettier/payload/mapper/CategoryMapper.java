package com.prettier.payload.mapper;

import com.prettier.entity.concretes.Category;
import com.prettier.payload.request.concretes.CategoryRequest;
import com.prettier.payload.response.concretes.CategoryResponse;
import lombok.*;
import org.modelmapper.Condition;
import org.modelmapper.ModelMapper;
import org.modelmapper.TypeMap;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class CategoryMapper {

    @Autowired
    private ModelMapper modelMapper;

    public Category toCategory(CategoryRequest categoryRequest) {
        return modelMapper.map(categoryRequest, Category.class);
    }


    public CategoryResponse toResponse(Category category) {
        return modelMapper.map(category, CategoryResponse.class);
    }




public Category toUpdateResponse(CategoryRequest categoryRequest,Category existcategory) {
        modelMapper.map(categoryRequest, existcategory);
         return existcategory;
    }



}
