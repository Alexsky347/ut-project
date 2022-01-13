package com.app.utils;

import com.app.Serveur;

import java.util.ArrayList;

public interface ServeurGenerator {
    ServeurBuilder _builder = new ServeurBuilder();

    ArrayList<Serveur> services = new ArrayList<Serveur>();

    public default ArrayList<Serveur> generateServices(int nombre){
        for (int i = 0; i < nombre ; i++) {
            services.add( _builder.createServeur());
        }
        return services;
    }

}
