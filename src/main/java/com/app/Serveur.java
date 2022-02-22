package com.app;

import java.util.ArrayList;
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

    public boolean PrendreCommandeNourriture(CommandeNourriture commande)
    {
        return true;
    }

    public boolean PrendreCommandeBoisson(CommandeBoissons commande)
    {
        return true;
    }
}
