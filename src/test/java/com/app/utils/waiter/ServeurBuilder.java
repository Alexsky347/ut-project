package com.app.utils.waiter;

import com.app.Serveur;

public final class ServeurBuilder {
    private String nom;
    private double salaire;

    public ServeurBuilder() {
    }

    public static ServeurBuilder aServeur() {
        return new ServeurBuilder();
    }

    public ServeurBuilder withNom(String nom) {
        this.nom = nom;
        return this;
    }

    public ServeurBuilder withSalaire(double salaire) {
        this.salaire = salaire;
        return this;
    }

    public Serveur build() {
        return new Serveur(nom, salaire);
    }
}