package com.prettier.service;

import com.prettier.repository.CategoryPropertyValueRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class CategoryPropertyValueService {

    private final CategoryPropertyValueRepository categoryPropertyValueRepository;

}
