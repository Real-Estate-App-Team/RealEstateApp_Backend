package com.prettier.payload.response.concretes;


import com.fasterxml.jackson.annotation.JsonInclude;
import com.prettier.entity.concretes.Advert;
import com.prettier.entity.concretes.User;
import com.prettier.payload.response.abstracts.BaseEntityResponse;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
@Getter
@Setter
@NoArgsConstructor
@SuperBuilder
@JsonInclude(JsonInclude.Include.NON_NULL)

import com.prettier.entity.concretes.Advert;
import com.prettier.entity.concretes.User;
import com.prettier.payload.response.abstracts.BaseEntityResponse;

import java.io.Serializable;


public class FavoriteResponse extends BaseEntityResponse implements Serializable {

    private User user;
    private Advert advert;
}
