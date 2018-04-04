package com.iqmsoft.service;

public enum Language {
    EN("en"),
    DE("de");

    private final String key;

    Language(String key) {
        this.key = key;
    }

    public String getKey() {
        return key;
    }

    public static Language fromKey(String language) {
        if (Language.DE.getKey().equalsIgnoreCase(language)) {
            return Language.DE;
        }
     
        return Language.EN;
    }
}
