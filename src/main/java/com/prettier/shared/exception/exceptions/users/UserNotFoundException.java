package com.prettier.shared.exception.exceptions.users;

import com.prettier.shared.exception.enums.IFriendlyMessageCode;
import com.prettier.shared.utils.FriendlyMessageUtils;
import com.prettier.shared.utils.enums.Language;
import lombok.Getter;
import lombok.extern.slf4j.Slf4j;

@Slf4j
@Getter
public class UserNotFoundException extends RuntimeException {

    private final Language language;
    private final IFriendlyMessageCode friendlyMessageCode;

    public UserNotFoundException(Language language, IFriendlyMessageCode friendlyMessageCode, String message) {
        super(FriendlyMessageUtils.getFriendlyMessage(language, friendlyMessageCode));
        this.language = language;
        this.friendlyMessageCode = friendlyMessageCode;
        log.error("[NotFoundException] -> message:{} developer message: {}", FriendlyMessageUtils.getFriendlyMessage(language, friendlyMessageCode), message);
    }


//    public NotFoundException(long id){
//        super(Messages.getMessageForLocale("FriendlyMessageCodes__USER_NOT_FOUND", LocaleContextHolder.getLocale(), id));
//    }
}