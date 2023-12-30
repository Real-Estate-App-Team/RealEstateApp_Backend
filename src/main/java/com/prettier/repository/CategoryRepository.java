package com.prettier.repository;

import com.prettier.entity.concretes.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


public interface CategoryRepository extends JpaRepository<Category,Long> {

    @Query("SELECT c FROM Category c WHERE c.active = true") //TODO BAK
    Page<Category> findIsActive(Pageable pageable);

    @Query("SELECT CASE WHEN COUNT(c) > 0 THEN true ELSE false END FROM Category c WHERE c.builtIn = true") //TODO BAK
    boolean findByBuiltIn();
//
}
