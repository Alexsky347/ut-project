package com.app;

import java.util.ArrayList;
import java.util.List;

public class Restaurant {
    public Object TablesesLibres;
    ArrayList<Table> tablesPrises;

    public Restaurant( ArrayList<Table> tables) {
        this.tablesPrises = tables;
    }

    public void DébuterService() {
    }

    public void ajouteTable(Table table) {
        tablesPrises.add(table);
    }

    public ArrayList<Table> getTablesPrises(){
        return this.tablesPrises;
    }
}
