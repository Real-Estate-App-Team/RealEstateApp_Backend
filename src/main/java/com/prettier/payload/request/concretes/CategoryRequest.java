package com.prettier.payload.request.concretes;

import com.prettier.entity.concretes.Advert;
import com.prettier.entity.concretes.CategoryPropertyKey;
import com.prettier.payload.request.abstracts.BaseEntityRequest;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.Set;
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
public class CategoryRequest extends BaseEntityRequest implements Serializable {

    @Column(name = "title", nullable = false)
    @Size(max = 150)
    private String title;

    @Column(name = "icon", nullable = false)
    private String icon;

    @Column(name = "built_in", nullable = false)
    private boolean builtIn;

    @Column(name = "seq", nullable = false)
    private int seq;

    @Column(name = "slug", nullable = false)
    @Size(min = 5, max = 200)
    private String slug;

    @Column(name = "is_active", nullable = false)
    private boolean active;


    private Set<Advert> advertSet;


    private Set<CategoryPropertyKey> categoryPropertyKeys;

}
