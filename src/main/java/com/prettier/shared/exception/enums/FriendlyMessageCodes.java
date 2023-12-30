package com.prettier.shared.exception.enums;

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
    CITY_NOT_CREATED_EXCEPTION(1600),
    CITY_SUCCESSFULLY_CREATED(1601),
    CITY_NOT_FOUND_EXCEPTION(1602),
    CITY_SUCCESSFULLY_UPDATED(1603);
    private final int value;

    FriendlyMessageCodes(int value) {
        this.value = value;
    }

    @Override
    public int getFriendlyMessageCode() {
        return value;
    }
}
