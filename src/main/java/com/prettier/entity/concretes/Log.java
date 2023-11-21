package com.prettier.entity.concretes;

import com.prettier.entity.abstracts.BaseEntity;
import com.prettier.entity.enums.LogAction;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.SuperBuilder;

import java.io.Serializable;
import java.util.Set;


@Entity
@Table(name = "logs")
@AllArgsConstructor
@NoArgsConstructor
@SuperBuilder
@Getter
@Setter
@ToString

public class Log extends BaseEntity implements Serializable {

    @Enumerated(EnumType.STRING)
    private LogAction logAction;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false)
    private User user;

    @ManyToOne
    @JoinColumn(name = "advert_id", nullable = false)
    private Advert advert;


    //Todo ilişkiler sonrası eklenecek


}
