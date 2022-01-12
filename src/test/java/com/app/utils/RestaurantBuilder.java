package com.app.utils;

import com.app.Restaurant;
import com.app.Table;

import java.util.ArrayList;

public class RestaurantBuilder {
    private ArrayList<Table> tables;

    public RestaurantBuilder setTables(ArrayList<Table> tables) {
        this.tables = tables;
        return this;
    }

    public Restaurant createRestaurant() {
        return new Restaurant(tables);
    }
}