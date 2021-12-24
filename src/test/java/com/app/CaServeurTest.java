package com.app;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class CaServeurTest {

    @Test
    @DisplayName("ÉTANT DONNÉ un nouveau serveur " +
            "QUAND on récupére son chiffre d'affaires " +
            "celui-ci est à 0")
    public void CaServeur_a_0(){

        //ÉTANT DONNÉ un nouveau serveur
        var waiter = new Serveur(0,0);

        //QUAND on récupére son chiffre d'affaires
        var getCa =  waiter.getChiffreAffaire();

        //celui-ci est à 0
        Assertions.assertEquals(0, getCa);
    }
    @Test
    @DisplayName("ÉTANT DONNÉ un nouveau serveur" +
            "QUAND il prend une commande" +
            "ALORS son chiffre d'affaires est le montant de celle-ci")
    public void CaServeur_avec_commande(){

        //ÉTANT DONNÉ un nouveau serveur
        var waiter = new Serveur(0,0);
        var order = new Commande();

        //QUAND il prend une commande
        var totalOrder = waiter.setChiffreAffaire(order.getOrderAmount());

        //ALORS son chiffre d'affaires est le montant de celle-ci
        Assertions.assertEquals(totalOrder,waiter.getChiffreAffaire());
    }
    @Test
    @DisplayName("ÉTANT DONNÉ un serveur ayant déjà pris une commande " +
            "QUAND il prend une nouvelle commande " +
            "ALORS son chiffre d'affaires est la somme des deux commandes")
    public void CaServeur_sommes_des_commandes(){

        //ÉTANT DONNÉ un serveur ayant déjà pris une commande


        // QUAND il prend une nouvelle commande


        //ALORS son chiffre d'affaires est le montant de celle-ci

    }
}
