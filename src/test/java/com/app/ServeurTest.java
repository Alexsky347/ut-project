package com.app;

import com.app.utils.waiter.ServeurBuilder;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.valid4j.Assertive.*;
import static org.junit.jupiter.api.Assertions.*;

class ServeurTest {

    @Test
    @DisplayName("ÉTANT DONNÉ un nouveau serveur " +
            "QUAND on récupére son chiffre d'affaires " +
            "celui-ci est à 0")
    public void CaServeur_a_0() {

        var serveur = new ServeurBuilder().withNom("stan").build();
    }

}