package com.prettier.controller;

import com.prettier.payload.mapper.CityMapper;
import com.prettier.payload.request.concretes.CityRequest;
import com.prettier.payload.request.concretes.CityUpdateRequest;
import com.prettier.payload.response.FriendlyMessage;
import com.prettier.payload.response.InternalApiResponse;
import com.prettier.payload.response.concretes.CityResponse;
import com.prettier.service.concretes.CityManager;
import com.prettier.shared.exception.enums.FriendlyMessageCodes;
import com.prettier.shared.utils.FriendlyMessageUtils;
import com.prettier.shared.utils.enums.Language;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.data.domain.Page;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

@RestController
@RequiredArgsConstructor
@RequestMapping("cities")
@Slf4j
public class CityController {

    private final CityManager cityService;
    private final CityMapper cityMapper;

    //Not: getAll() *********************************************************************************************************************************

    @GetMapping(value = "/{language}/cities") // http://localhost:8080/cities/EN/cities
    public Page<CityResponse> getCities(
            @PathVariable("language") Language language,
            @RequestParam(value = "page", defaultValue = "0") int page,
            @RequestParam(value = "size", defaultValue = "41") int size,
            @RequestParam(value = "sort", defaultValue = "name") String sort,
            @RequestParam(value = "type", defaultValue = "asc") String type
    ) {
        return cityService.getCities(language, page, size, sort, type);
    }

    //Not: getById() *********************************************************************************************************************************
    @ResponseStatus(HttpStatus.OK)
    @GetMapping(value = "/{language}/get/{cityId}")
    public InternalApiResponse<CityResponse> getCity(@PathVariable("language") Language language,
                                                     @PathVariable("cityId") Long id) {
        log.debug("[{}][getCity] -> request cityId: {}", this.getClass().getSimpleName(), id);
        CityResponse cityResponse = cityService.getByCityId(language, id);

        log.debug("[{}][getCity] -> response: {}", this.getClass().getSimpleName(), cityResponse);
        return InternalApiResponse.<CityResponse>builder()
                .httpStatus(HttpStatus.OK)
                .hasError(false)
                .payload(cityResponse)
                .build();
    }

    //Not: add() ****************************************************************************************************************************************
    @ResponseStatus(HttpStatus.CREATED)
    @PostMapping(value = "/{language}/add")
    public InternalApiResponse<CityResponse> addCity(@PathVariable("language") Language language,
                                                     @RequestBody CityRequest cityRequest) {
        log.debug("[{}][createCity] -> request: {}", this.getClass().getSimpleName(), cityRequest);
        CityResponse cityResponse = cityService.add(language, cityRequest);

        log.debug("[{}][createCity] -> response: {}", this.getClass().getSimpleName(), cityResponse);

        return InternalApiResponse.<CityResponse>builder()
                .friendlyMessage(FriendlyMessage.builder()
                        .title(FriendlyMessageUtils.getFriendlyMessage(language, FriendlyMessageCodes.SUCCESS))
                        .description(FriendlyMessageUtils.getFriendlyMessage(language, FriendlyMessageCodes.CITY_SUCCESSFULLY_CREATED))
                        .build())
                .httpStatus(HttpStatus.CREATED)
                .hasError(false)
                .payload(cityResponse)
                .build();
    }

    //Not: update() *********************************************************************************************************************************
    @ResponseStatus(HttpStatus.OK)
    @PutMapping(value = "/{language}/update/{cityId}")
    public InternalApiResponse<CityResponse> updateCity(@PathVariable("language") Language language,
                                                        @PathVariable("cityId") Long id,
                                                        @RequestBody CityUpdateRequest cityUpdateRequest) {

        log.debug("[{}][updateCity] -> request: {} {}", this.getClass().getSimpleName(), id, cityUpdateRequest);
        CityResponse cityResponse = cityService.update(language, cityUpdateRequest, id);

        log.debug("[{}][updateCity] -> response: {}", this.getClass().getSimpleName(), cityResponse);

        return InternalApiResponse.<CityResponse>builder()
                .friendlyMessage(FriendlyMessage.builder()
                        .title(FriendlyMessageUtils.getFriendlyMessage(language, FriendlyMessageCodes.SUCCESS))
                        .description(FriendlyMessageUtils.getFriendlyMessage(language, FriendlyMessageCodes.CITY_SUCCESSFULLY_UPDATED))
                        .build())
                .httpStatus(HttpStatus.OK)
                .hasError(false)
                .payload(cityResponse)
                .build();
    }

    //Not: update2() - manuel mapping ********************************************************************************************************************
//    @ResponseStatus(HttpStatus.OK)
//    @PutMapping(value = "/{language}/update2/{cityId}")
//    public InternalApiResponse<CityResponse> updateCity2(@PathVariable("language") Language language,
//                                                         @PathVariable("cityId") Long id,
//                                                         @RequestBody CityUpdateRequest cityUpdateRequest) {
//
//        log.debug("[{}][updateCity] -> request: {} {}", this.getClass().getSimpleName(), id, cityUpdateRequest);
//        CityResponse cityResponse = cityService.update2(language, cityUpdateRequest ,id);
//        log.debug("[{}][updateCity] -> response: {}", this.getClass().getSimpleName(), cityResponse);
//
//        return InternalApiResponse.<CityResponse>builder()
//                .friendlyMessage(FriendlyMessage.builder()
//                        .title(FriendlyMessageUtils.getFriendlyMessage(language, FriendlyMessageCodes.SUCCESS))
//                        .description(FriendlyMessageUtils.getFriendlyMessage(language, FriendlyMessageCodes.CITY_SUCCESSFULLY_UPDATED))
//                        .build())
//                .httpStatus(HttpStatus.OK)
//                .hasError(false)
//                .payload(cityResponse)
//                .build();
//    }

    //Not: delete() *********************************************************************************************************************************
    @ResponseStatus(HttpStatus.OK)
    @DeleteMapping(value = "/{language}/delete/{cityId}")
    public InternalApiResponse<CityResponse> deleteCity(@PathVariable("language") Language language,
                                                        @PathVariable("cityId") Long id) {
        log.debug("[{}][deleteCity] -> request cityId: {}", this.getClass().getSimpleName(), id);
        CityResponse cityResponse = cityService.softDelete(language, id);

        log.debug("[{}][deleteCity] -> response: {}", this.getClass().getSimpleName(), cityResponse);
        return InternalApiResponse.<CityResponse>builder()
                .friendlyMessage(FriendlyMessage.builder()
                        .title(FriendlyMessageUtils.getFriendlyMessage(language, FriendlyMessageCodes.SUCCESS))
                        .description(FriendlyMessageUtils.getFriendlyMessage(language, FriendlyMessageCodes.CITY_SUCCESSFULLY_DELETED))
                        .build())
                .httpStatus(HttpStatus.OK)
                .hasError(false)
                .payload(cityResponse)
                .build();
    }
}
