package com.prettier.service.abstracts;

import com.prettier.entity.concretes.City;
import com.prettier.payload.request.concretes.CityRequest;
import com.prettier.payload.request.concretes.CityUpdateRequest;
import com.prettier.payload.response.concretes.CityResponse;
import com.prettier.shared.utils.enums.Language;
import org.springframework.data.domain.Page;

import java.io.Serializable;

public interface CityService extends Serializable {

    Page<CityResponse> getCities(Language language, int page, int size, String sort, String type);

    CityResponse getByCityId(Language language, Long id);

    CityResponse add(Language language, CityRequest cityRequest);

    CityResponse update(Language language, CityUpdateRequest cityUpdateRequest, Long id);
//  CityResponse update2(Language language,CityUpdateRequest cityUpdateRequest, Long id);

    CityResponse softDelete(Language language, Long id);
}
