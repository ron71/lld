package com.lld.bms.model;

import com.lld.common.model.LldBeanId;

import java.time.LocalDate;

public class Movie extends LldBeanId {
    private String title;
    private String language;
    private String genre;
    private LocalDate releaseDate;
    private String cityName;
}
