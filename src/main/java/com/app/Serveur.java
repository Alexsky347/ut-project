package com.app;

import java.util.ArrayList;
<<<<<<< HEAD
import java.util.List;

public class Serveur {

    private final List<CommandeNourriture> commandesPrises = new ArrayList<CommandeNourriture>();

    private String nom;
    private double salaire;

    public Serveur(String nom, double salaire)
    {
        this.nom = nom;
        this.salaire = salaire;
    }

    public void PrendreCommande(CommandeNourriture commande)
    {

    }

    public void PrendreCommande(CommandeBoissons commande)
    {
    }
=======

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

>>>>>>> 55a8d0b (ut done)
}
