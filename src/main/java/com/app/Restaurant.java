package com.app;

import java.util.ArrayList;

public class Restaurant {
    ArrayList<Table> TablesLibres;
    ArrayList<Table> TablesPrises;

    public Restaurant( ArrayList<Table> tables) {
        this.TablesPrises = tables;
    }

    public void DébuterService() {
    }

    public void ajouteTable(Table table) {
        TablesPrises.add(table);
    }

    public ArrayList<Table> getTablesPrises(){
        return this.TablesPrises;
    }
}
