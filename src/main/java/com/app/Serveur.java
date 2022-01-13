package com.app;

import java.util.ArrayList;

import java.util.List;

public class Serveur {


    private ArrayList<Table> tables = new ArrayList<>();
    private String nom;
    private double salaire;
    public Serveur(){}


    public Serveur(String nom, double salaire)
    {
        this.nom = nom;
        this.salaire = salaire;
    }

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
