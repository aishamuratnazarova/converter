package com.example.aishaapp.domain;

import androidx.annotation.NonNull;

public enum ValutaItem {
    RUB("1"), US("R01235"), EUR("R01239"), JPY("R01820"), KZT("R01335");


    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    private ValutaItem(String id) {
        this.id = id;
    }


    @NonNull
    @Override
    public String toString() {
        return name();
    }
}
