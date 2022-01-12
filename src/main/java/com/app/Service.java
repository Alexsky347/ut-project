package com.app;

import java.util.ArrayList;

public class Service {

    private final ArrayList<Table> tables;

    public Service(ArrayList<Table> listeTables) {
        this.tables = listeTables;
    }


    public void commence() {
        System.out.println("Le service commence");
    }
}
