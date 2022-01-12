package com.app;

import com.app.utils.TableGenerator;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.valid4j.Assertive.*;

public class DebutServiceTest implements TableGenerator{

//https://www.baeldung.com/intellij-idea-java-builders
    @Test
    @DisplayName("ÉTANT DONNE un restaurant ayant 3 tables" +
            "QUAND le service commence" +
            "ALORS elles sont toutes affectées au Maître d'Hôtel")
    public void tablesAffectees() {

        // ÉTANT DONNE un restaurant ayant 3 tables
        ArrayList<Table> listeTables = generate(3);

        Service service = new Service();

        Restaurant restaurant = new RestaurantBuilder().setTables(listeTables).createRestaurant();

        // QUAND le service commence

        service.commence();

        // ALORS elles sont toutes affectées au Maître d'Hôtel
        MaitreHotel maitreHotel = new MaitreHotel();
        maitreHotel.tablesAffectees(restaurant.getTablesPrises());

        ensure(restaurant.getTablesPrises() == maitreHotel.getTablesAffectees());

    }

    @Test
    @DisplayName("ÉTANT DONNÉ un restaurant ayant 3 tables dont une affectée à un serveur" +
            "QUAND le service débute" +
            "ALORS la table éditée est affectée au serveur et les deux autres au maître d'hôtel")
    public void tableEditee() {

//        ÉTANT DONNÉ un restaurant ayant 3 tables dont une affectée à un serveur

//        QUAND le service débute

//        ALORS la table éditée est affectée au serveur et les deux autres au maître d'hôtel


    }

    @Test
    @DisplayName("ÉTANT DONNÉ un restaurant ayant 3 tables dont une affectée à un serveur" +
            "QUAND le service débute" +
            "ALORS il n'est pas possible de modifier le serveur affecté à la table")
    public void ImpossibleModifierServeur() {

//        ÉTANT DONNÉ un restaurant ayant 3 tables dont une affectée à un serveur

//        QUAND le service débute

//        ALORS il n'est pas possible de modifier le serveur affecté à la table


    }

    @Test
    @DisplayName("ÉTANT DONNÉ un restaurant ayant 3 tables dont une affectée à un serveur" +
            "ET ayant débuté son service" +
            "QUAND le service se termine" +
            "ET qu'une table est affectée à un serveur" +
            "ALORS la table éditée est affectée au serveur et les deux autres au maître d'hôtel")
    public void tableEditeeAffecteeServeurEtMaitreHotel() {

//        ÉTANT DONNÉ un restaurant ayant 3 tables dont une affectée à un serveur

//        ET ayant débuté son service

//        QUAND le service se termine

//        ET qu'une table est affectée à un serveur

//        ALORS la table éditée est affectée au serveur et les deux autres au maître d'hôtel


    }
}
