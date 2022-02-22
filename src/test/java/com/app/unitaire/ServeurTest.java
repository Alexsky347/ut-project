package com.app.unitaire;

import com.app.*;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.valid4j.Assertive.ensure;

public class ServeurTest {
    private Serveur serveur = new Serveur("nom", 15.5);

    @Test
    public void prendreCommandeBoissonTest(){
        ensure(serveur.PrendreCommandeBoisson(new CommandeBoissons()));
    }

    @Test
    public void prendreCommandeNourritureTest(){
        ensure(serveur.PrendreCommandeNourriture(new CommandeNourriture()));
    }
}
