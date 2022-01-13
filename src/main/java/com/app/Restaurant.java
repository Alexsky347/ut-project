package com.app;

import java.util.ArrayList;

public class Restaurant {

    public Object tablesLibres;
    ArrayList<Table> tablesPrises;

    public Restaurant() {}

    public Object getTablesLibres() {
        return tablesLibres;
    }

    public void setTablesLibres(Object tablesLibres) {
        tablesLibres = tablesLibres;
    }

    public void débuterService() {
        System.out.println("le service du restaurant commence");
    }

    public void finirService() {
        System.out.println("le service du restaurant est terminé");
    }

    public void ajouteTable(Table table) {
        tablesPrises.add(table);
    }

    public void setTablesPrises(ArrayList<Table> tablesPrises) {
        this.tablesPrises = tablesPrises;
    }

    public ArrayList<Table> getTablesPrises(){
        return this.tablesPrises;
    }
}
