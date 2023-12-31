package com.prettier.payload.request.concretes;

import com.fasterxml.jackson.annotation.JsonIgnore;
import com.prettier.payload.request.abstracts.BaseEntityRequest;
import jakarta.validation.constraints.Size;
import lombok.*;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder(toBuilder = true)
//@EqualsAndHashCode(callSuper = true, onlyExplicitlyIncluded = true)
public class CityUpdateRequest extends BaseEntityRequest{

    @Size(min = 2, max = 50)
    private String name;

    private CountryRequest country;
}
