package com.prettier.shared.utils;

import com.prettier.shared.exception.enums.IFriendlyMessageCode;
import com.prettier.shared.utils.enums.Language;
import lombok.experimental.UtilityClass;
import lombok.extern.slf4j.Slf4j;

import java.util.Locale;
import java.util.MissingResourceException;
import java.util.ResourceBundle;

@Slf4j //@Slf4j anatosyani Loglari daha iyi okumayabilmeyi ve efektif kullanamabilmeyi saglayan bir lombok özelligidir.
@UtilityClass
//@UtilityClass anatosyani kullanildiginda o class arka planda final olarak isaretlenir ve class'a ait tüm metotlar,field ler,innerclass lar static olarak isaretlenir
public class FriendlyMessageUtils {

    private static final String RESOURCE_BUNDLE_NAME = "FriendlyMessage";
    private static final String SPECIAL_CHARACTER = "__";

    public static String getFriendlyMessage(Language language, IFriendlyMessageCode messageCode) {
        String messageKey = null;
        try {
            //Language alani bos mu diye kontrol ediyoruz, eger bossa hata firlatmasi yerine EN olarak set ediyoruz
            String defaultLanguage = checkLanguageIsNull(language);

            Locale locale = new Locale(defaultLanguage);
            ResourceBundle resourceBundle = ResourceBundle.getBundle(RESOURCE_BUNDLE_NAME, locale); //Hangi dil bundle secilecegini geciyoruz
            messageKey = messageCode.getClass().getSimpleName() + SPECIAL_CHARACTER + messageCode;
            return resourceBundle.getString(messageKey);
        } catch (MissingResourceException missingResourceException) {
            log.error("Friendly message not found for key: {}", messageKey); //{} ilgili degiskenin degerini(messageKey) atamak icin kullanilir
            return null;
        }
    }

    private static String checkLanguageIsNull(Language language){

        if (language.name().isEmpty()){
           return Language.EN.name();
        }
        return language.name();
    }
}
