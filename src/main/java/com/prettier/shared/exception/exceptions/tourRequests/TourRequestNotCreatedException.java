package com.prettier.shared.exception.exceptions.tourRequests;

import com.prettier.shared.exception.enums.IFriendlyMessageCode;
import com.prettier.shared.utils.FriendlyMessageUtils;
import com.prettier.shared.utils.enums.Language;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;


@Slf4j
@Getter
public class TourRequestNotCreatedException extends RuntimeException {

    private final Language language;
    private final IFriendlyMessageCode friendlyMessageCode;

    public TourRequestNotCreatedException(Language language, IFriendlyMessageCode friendlyMessageCode, String message) {
        super(FriendlyMessageUtils.getFriendlyMessage(language,friendlyMessageCode)); //Runtime exception parent class'ina mesajimizi constructor yardimi ile gönderiyoruz
        this.language = language;
        this.friendlyMessageCode = friendlyMessageCode;
        log.error("[TourRequestNotCreatedException] --> message: {} developer message: {}",FriendlyMessageUtils.getFriendlyMessage(language,friendlyMessageCode),message);
    }
}
