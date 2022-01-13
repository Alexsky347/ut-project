package com.app.utils.waiter;

import com.app.Serveur;

public interface ServeurGenerator {

    ServeurBuilder builder = new ServeurBuilder();

    public default Iterable<Serveur> generate(int nombre)
    {
        for(var i = 0; i < nombre; i++)
        {
             builder.build();
        }
        return null;
    }

    public default ServeurBuilder Nomme(String nom)
    {
      return builder.withNom(nom);
    }

}
