package com.prettier.service;

import com.prettier.entity.concretes.Category;
import com.prettier.entity.concretes.CategoryPropertyKey;
import com.prettier.payload.mapper.CategoryMapper;
import com.prettier.payload.request.concretes.CategoryRequest;
import com.prettier.payload.response.concretes.CategoryResponse;
import com.prettier.repository.CategoryPropertyKeyRepository;
import com.prettier.repository.CategoryPropertyValueRepository;
import com.prettier.repository.CategoryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.ResourceAccessException;

import java.util.Objects;
import java.util.Optional;
import java.util.Set;

@Service
@RequiredArgsConstructor
public class CategoryService {
    private final CategoryRepository categoryRepository;
    private final CategoryMapper categoryMapper;
    private final AdvertService advertService;
    private final CategoryPropertyKeyService categoryPropertyKeyService;
    private final CategoryPropertyKeyRepository categoryPropertyKeyRepository;
    private final CategoryPropertyValueRepository categoryPropertyValueRepository;

    public  Page<CategoryResponse> getIsActiveWithPage(int page, int size, String sort, String type) {

        Pageable pageable = PageRequest.of(page, size, Sort.by(sort).ascending());
        if (Objects.equals(type, "desc")) {
            pageable = PageRequest.of(page, size, Sort.by(sort).descending());
        }

        return categoryRepository.findIsActive(pageable).map(categoryMapper::toResponse);


    }

    public  Page<CategoryResponse> getAllWithPage(int page, int size, String sort, String type) {

        Pageable pageable = PageRequest.of(page, size, Sort.by(sort).ascending());
        if (Objects.equals(type, "desc")) {
            pageable = PageRequest.of(page, size, Sort.by(sort).descending());
        }

        return categoryRepository.findAll(pageable).map(categoryMapper::toResponse);


    }


    public CategoryResponse getById(Long id) {
        Category category =  categoryRepository.findById(id).orElseThrow(()->{
            throw new ResourceAccessException("");//todo
        });
        return categoryMapper.toResponse(category);
    }

    public ResponseEntity add(CategoryRequest categoryRequest) {

       Category category = categoryMapper.toCategory(categoryRequest);
       Category savedCategory = categoryRepository.save(category);
        return ResponseEntity.ok(HttpStatus.CREATED);


    }

    public ResponseEntity updateById(Long id, CategoryRequest categoryRequest) {



              if(!categoryRepository.existsById(id)){
              throw new ResourceAccessException("");//todo  ex olustur
        }
              //todo built in olna bakailmayacak
        Category category =  categoryRepository.findById(id).orElseThrow(()->{
            throw new ResourceAccessException("");//todo
        });

              categoryRequest.setId(id);
        Category updated = categoryMapper.toUpdateResponse(categoryRequest,category);

        categoryRepository.save(updated);

        return ResponseEntity.ok(HttpStatus.ACCEPTED);



    }

    public ResponseEntity<CategoryResponse> deleteById(Long id) {

        Category deleted =  categoryRepository.findById(id).orElseThrow(()->{
            throw new ResourceAccessException("");//todo
        });
        if (!categoryRepository.findById(id).get().isBuiltIn()){
            CategoryResponse categoryResponse=categoryMapper.toResponse(deleted);
            categoryRepository.deleteById(id);
            return new ResponseEntity<>(categoryResponse,HttpStatus.ACCEPTED);//todo postman siliyor ama cevap yok

        }
        return new ResponseEntity<>(categoryMapper.toResponse(deleted),HttpStatus.NOT_FOUND);
    }




    //todo dtolar yapilsin
    public ResponseEntity<Set<CategoryPropertyKey>> getCategoryProporties(Long categoryId) {
        Category category =  categoryRepository.findById(categoryId).orElseThrow(()->{
            throw new ResourceAccessException("");//todo
        });

        Set<CategoryPropertyKey> categoryProperties = category.getCategoryPropertyKeys();
        return ResponseEntity.ok(categoryProperties);

    }



    //todo categoryproportieskeyrepo kullanilacak
    public ResponseEntity<CategoryPropertyKey> createCategoryProperty(Long categoryId, CategoryPropertyKey categoryPropertyKey) {
        Category category =  categoryRepository.findById(categoryId).orElseThrow(()->{
            throw new ResourceAccessException("");//todo
        });
        categoryPropertyKey.setCategory(category);
        CategoryPropertyKey createdCategoryProperty = categoryPropertyKeyRepository.save(categoryPropertyKey);
        return ResponseEntity.ok(createdCategoryProperty);
    }

    public ResponseEntity<CategoryPropertyKey> updateCategoryProperty(Long propertyKeyId, CategoryPropertyKey updatedProperty) {

        CategoryPropertyKey existingProperty = categoryPropertyKeyRepository.findById(propertyKeyId).orElseThrow(()->{
            throw new ResourceAccessException("");//todo
        });

        if (existingProperty.isBuiltIn()) {
            return new ResponseEntity<>(existingProperty,HttpStatus.NOT_FOUND);
        }
        existingProperty.setName(updatedProperty.getName());
        existingProperty.setBuiltIn(updatedProperty.isBuiltIn());
        // todo category ve proporty value setlenecek

        CategoryPropertyKey updatedPropertyKey = categoryPropertyKeyRepository.save(existingProperty);
        return ResponseEntity.ok(updatedPropertyKey);

    }

    public ResponseEntity<CategoryPropertyKey> deleteCategoryProperty(Long propertyId) {
        CategoryPropertyKey existingProperty = categoryPropertyKeyRepository.findById(propertyId).orElseThrow(()->{
            throw new ResourceAccessException("");//todo
        });

        if (existingProperty.isBuiltIn()) {
            return new ResponseEntity<>(existingProperty,HttpStatus.NOT_FOUND);
        }
        //todo Delete related category_property_values
        //categoryPropertyValueRepository.deleteRelated(propertyId);

        categoryPropertyKeyRepository.delete(existingProperty);
        return ResponseEntity.ok(existingProperty);

    }










   private Category updatedCategory(Long id, CategoryRequest categoryRequest) {
        return Category.builder()
                .id(id)
                .advertSet(categoryRequest.getAdvertSet())
                .seq(categoryRequest.getSeq())
                .icon(categoryRequest.getIcon())
                .slug(categoryRequest.getSlug())
                .title(categoryRequest.getTitle())
                .builtIn(categoryRequest.isBuiltIn())
                .createAt(categoryRequest.getCreateAt())
                .active(categoryRequest.isActive())
                .categoryPropertyKeys(categoryRequest.getCategoryPropertyKeys())
                .updateAt(categoryRequest.getUpdateAt())
                //todo
                .build();
    }




    //class
}
