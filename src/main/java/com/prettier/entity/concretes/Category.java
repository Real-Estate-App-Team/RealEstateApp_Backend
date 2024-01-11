package com.prettier.entity.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.prettier.entity.abstracts.BaseEntity;
import jakarta.persistence.*;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.SuperBuilder;


import java.io.Serializable;
import java.util.Set;

@Entity
@Table(name = "categories")
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Getter
@Setter
public class Category extends BaseEntity{

    @Column(name = "title", nullable = false)
    @Size(max = 150)
    private String title;

    @Column(name = "icon", nullable = false)
    @Size(max = 50)
    private String icon;

    @Column(name = "built_in", nullable = false)
    private boolean builtIn;

    @Column(name = "seq", nullable = false)
    private int seq;

    @Column(name = "slug", nullable = false)
    @Size(min = 5, max = 200)
    private String slug;

    @Column(name = "is_active", nullable = false)
    private boolean active=true;

    @OneToMany(mappedBy = "category")
    @JsonIgnore
    private Set<Advert> advertSet;

    @OneToMany(mappedBy = "category")
    @JsonIgnore
    private Set<CategoryPropertyKey> categoryPropertyKeys;

}