package com.prettier.shared.exception.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum FriendlyMessageCodes implements IFriendlyMessageCode {
    OK(1000),
    ERROR(1001),
    SUCCESS(1002),

    ADVERT_NOT_CREATED_EXCEPTION(1500),
    ADVERT_SUCCESSFULLY_CREATED(1501),
    ADVERT_NOT_FOUND_EXCEPTION(1502),
    ADVERT_SUCCESSFULLY_UPDATED(1503),
    ADVERT_ALREADY_DELETED(1504),
    ADVERT_SUCCESSFULLY_DELETED(1505),
    ADVERT_ALREADY_EXISTS(1506),

    ADVERT_TYPE_NOT_CREATED_EXCEPTION(1600),
    ADVERT_TYPE_SUCCESSFULLY_CREATED(1601),
    ADVERT_TYPE_NOT_FOUND_EXCEPTION(1602),
    ADVERT_TYPE_SUCCESSFULLY_UPDATED(1603),
    ADVERT_TYPE_ALREADY_DELETED(1604),
    ADVERT_TYPE_SUCCESSFULLY_DELETED(1605),
    ADVERT_TYPE_ALREADY_EXISTS(1606),

    CATEGORY_NOT_CREATED_EXCEPTION(1700),
    CATEGORY_SUCCESSFULLY_CREATED(1701),
    CATEGORY_NOT_FOUND_EXCEPTION(1702),
    CATEGORY_SUCCESSFULLY_UPDATED(1703),
    CATEGORY_ALREADY_DELETED(1704),
    CATEGORY_SUCCESSFULLY_DELETED(1705),
    CATEGORY_ALREADY_EXISTS(1706),

    CATEGORY_PROPERTY_KEY_NOT_CREATED_EXCEPTION(1800),
    CATEGORY_PROPERTY_KEY_SUCCESSFULLY_CREATED(1801),
    CATEGORY_PROPERTY_KEY_NOT_FOUND_EXCEPTION(1802),
    CATEGORY_PROPERTY_KEY_SUCCESSFULLY_UPDATED(1803),
    CATEGORY_PROPERTY_KEY_ALREADY_DELETED(1804),
    CATEGORY_PROPERTY_KEY_SUCCESSFULLY_DELETED(1805),
    CATEGORY_PROPERTY_KEY_ALREADY_EXISTS(1806),

    CATEGORY_PROPERTY_VALUE_NOT_CREATED_EXCEPTION(1900),
    CATEGORY_PROPERTY_VALUE_SUCCESSFULLY_CREATED(1901),
    CATEGORY_PROPERTY_VALUE_NOT_FOUND_EXCEPTION(1902),
    CATEGORY_PROPERTY_VALUE_SUCCESSFULLY_UPDATED(1903),
    CATEGORY_PROPERTY_VALUE_ALREADY_DELETED(1904),
    CATEGORY_PROPERTY_VALUE_SUCCESSFULLY_DELETED(1905),
    CATEGORY_PROPERTY_VALUE_ALREADY_EXISTS(1906),

    CITY_NOT_CREATED_EXCEPTION(2000),
    CITY_SUCCESSFULLY_CREATED(2001),
    CITY_NOT_FOUND_EXCEPTION(2002),
    CITY_SUCCESSFULLY_UPDATED(2003),
    CITY_ALREADY_DELETED(2004),
    CITY_SUCCESSFULLY_DELETED(2005),
    CITY_ALREADY_EXISTS(2006),

    CONTACT_NOT_CREATED_EXCEPTION(2100),
    CONTACT_SUCCESSFULLY_CREATED(2101),
    CONTACT_NOT_FOUND_EXCEPTION(2102),
    CONTACT_SUCCESSFULLY_UPDATED(2103),
    CONTACT_ALREADY_DELETED(2104),
    CONTACT_SUCCESSFULLY_DELETED(2105),
    CONTACT_ALREADY_EXISTS(2106),

    COUNTRY_NOT_CREATED_EXCEPTION(2200),
    COUNTRY_SUCCESSFULLY_CREATED(2201),
    COUNTRY_NOT_FOUND_EXCEPTION(2202),
    COUNTRY_SUCCESSFULLY_UPDATED(2203),
    COUNTRY_ALREADY_DELETED(2204),
    COUNTRY_SUCCESSFULLY_DELETED(2205),
    COUNTRY_ALREADY_EXISTS(2206),

    DISTRICT_NOT_CREATED_EXCEPTION(2300),
    DISTRICT_SUCCESSFULLY_CREATED(2301),
    DISTRICT_NOT_FOUND_EXCEPTION(2302),
    DISTRICT_SUCCESSFULLY_UPDATED(2303),
    DISTRICT_ALREADY_DELETED(2304),
    DISTRICT_SUCCESSFULLY_DELETED(2305),
    DISTRICT_ALREADY_EXISTS(2306),

    FAVORITE_NOT_CREATED_EXCEPTION(2400),
    FAVORITE_SUCCESSFULLY_CREATED(2401),
    FAVORITE_NOT_FOUND_EXCEPTION(2402),
    FAVORITE_SUCCESSFULLY_UPDATED(2403),
    FAVORITE_ALREADY_DELETED(2404),
    FAVORITE_SUCCESSFULLY_DELETED(2405),
    FAVORITE_ALREADY_EXISTS(2406),

    IMAGE_NOT_CREATED_EXCEPTION(2500),
    IMAGE_SUCCESSFULLY_CREATED(2501),
    IMAGE_NOT_FOUND_EXCEPTION(2502),
    IMAGE_SUCCESSFULLY_UPDATED(2503),
    IMAGE_ALREADY_DELETED(2504),
    IMAGE_SUCCESSFULLY_DELETED(2505),
    IMAGE_ALREADY_EXISTS(2506),

    LOG_NOT_CREATED_EXCEPTION(2600),
    LOG_SUCCESSFULLY_CREATED(2601),
    LOG_NOT_FOUND_EXCEPTION(2602),
    LOG_SUCCESSFULLY_UPDATED(2603),
    LOG_ALREADY_DELETED(2604),
    LOG_SUCCESSFULLY_DELETED(2605),
    LOG_ALREADY_EXISTS(2606),

    ROLE_NOT_CREATED_EXCEPTION(2700),
    ROLE_SUCCESSFULLY_CREATED(2701),
    ROLE_NOT_FOUND_EXCEPTION(2702),
    ROLE_SUCCESSFULLY_UPDATED(2703),
    ROLE_ALREADY_DELETED(2704),
    ROLE_SUCCESSFULLY_DELETED(2705),
    ROLE_ALREADY_EXISTS(2706),

    TOUR_REQUEST_NOT_CREATED_EXCEPTION(2800),
    TOUR_REQUEST_SUCCESSFULLY_CREATED(2801),
    TOUR_REQUEST_NOT_FOUND_EXCEPTION(2802),
    TOUR_REQUEST_SUCCESSFULLY_UPDATED(2803),
    TOUR_REQUEST_ALREADY_DELETED(2804),
    TOUR_REQUEST_SUCCESSFULLY_DELETED(2805),
    TOUR_REQUEST_ALREADY_EXISTS(2806),

    USER_NOT_CREATED_EXCEPTION(2900),
    USER_SUCCESSFULLY_CREATED(2901),
    USER_NOT_FOUND_EXCEPTION(2902),
    USER_SUCCESSFULLY_UPDATED(2903),
    USER_ALREADY_DELETED(2904),
    USER_SUCCESSFULLY_DELETED(2905),
    USER_NAME_ALREADY_EXISTS(2906),
    EMAIl_ALREADY_EXISTS(2907),
    PHONE_NUMBER_ALREADY_EXISTS(2908),
    USER_LOGIN_SUCCESSFULLY(2909),
    USER_IMAGE_UPLOAD_SUCCESSFULLY(2910),

    SIGN_UP_SUCCESSFULLY(3000),
    LOGIN_SUCCESSFULLY(3002),
    LOGIN_FAILED_EXCEPTION(3003),
    USER_ALREADY_EXIST(3004);

    private final int value;

    @Override
    public int getFriendlyMessageCode() {

        return value;
    }
}
