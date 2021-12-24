package com.app;

import org.junit.jupiter.api.Order;

public class Serveur {
    private double chiffreAffaire;
    private double orderAmount;

    public Serveur(double chiffreAffaire, double orderAmount) {
        this.chiffreAffaire = chiffreAffaire;
        this.orderAmount = orderAmount;
    }

    public double getChiffreAffaire()
    {
        return chiffreAffaire;
    }

    public double setChiffreAffaire(double chiffreAffaire) {
        this.chiffreAffaire = chiffreAffaire;
        return chiffreAffaire;
    }

    public double getOrderAmount() {
        return orderAmount;
    }
    public void setOrderAmount(double orderAmount) {
        this.orderAmount = orderAmount;
    }
}
