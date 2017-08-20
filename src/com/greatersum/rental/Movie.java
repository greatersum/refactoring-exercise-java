package com.greatersum.rental;

public class Movie {
    private final String title;
    private final String code;

    public Movie(String title, String code) {

        this.title = title;
        this.code = code;
    }

    public String getTitle() {
        return title;
    }

    public String getCode() {
        return code;
    }
}
