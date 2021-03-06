package com.example.moviecatalogservice.models;

import lombok.Getter;
import lombok.Setter;

public class CatalogItem {

    @Getter @Setter private String name;
    @Getter @Setter private String desc;
    @Getter @Setter private int rating;

    public CatalogItem(String name, String desc, int rating) {
        this.name = name;
        this.desc = desc;
        this.rating = rating;
    }
}
