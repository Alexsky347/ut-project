package com.app;

import java.util.ArrayList;

public class Serveur {


    private ArrayList<Table> tables = new ArrayList<>();

    public Serveur(){}

    public ArrayList<Table> getTables() {
        return tables;
    }

    public void setTables(ArrayList<Table> tables) {
        this.tables = tables;
    }

    public void setTable(Table table) {
        this.tables.add(table);
    }

    public void débuterService() {
        System.out.println("le service du serveur commence");
    }
    public void finirService() {
        System.out.println("le service du serveur est terminé");
    }

}
