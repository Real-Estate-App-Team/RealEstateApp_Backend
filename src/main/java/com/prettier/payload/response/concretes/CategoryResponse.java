package com.prettier.payload.response.concretes;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.prettier.entity.concretes.Advert;
import com.prettier.entity.concretes.CategoryPropertyKey;
import com.prettier.payload.response.abstracts.BaseEntityResponse;
import jakarta.persistence.Column;
import jakarta.persistence.OneToMany;
import jakarta.validation.constraints.Size;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.Set;
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
@JsonInclude(JsonInclude.Include.NON_NULL)
public class CategoryResponse extends BaseEntityResponse implements Serializable {

    private String title;
    private String icon;
    private boolean builtIn;
    private int seq;
    private String slug;
    private boolean active;
    private Set<Advert> advertSet;
    private Set<CategoryPropertyKey> categoryPropertyKeys;
    //
}
