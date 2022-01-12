package com.app;

import com.app.utils.TableGenerator;
import org.json.simple.parser.ParseException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.valid4j.Assertive.*;

public class DebutServiceTest implements TableGenerator{
    private ArrayList<Table> listeTables;

    @BeforeEach
    void setUp() {
        listeTables = generate(3);
    }

//https://www.baeldung.com/intellij-idea-java-builders
    @Test
    @DisplayName("ÉTANT DONNE un restaurant ayant 3 tables" +
            "QUAND le service commence" +
            "ALORS elles sont toutes affectées au Maître d'Hôtel")
    public void tablesAffectees() {

        // ÉTANT DONNE un restaurant ayant 3 tables
        Service service = new Service(listeTables);
        Restaurant restaurant = new Restaurant(listeTables);

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
    public void tableEditee() throws IOException, ParseException {

//        ÉTANT DONNÉ un restaurant ayant 3 tables dont une affectée à un serveur
        ArrayList<Table> listeTables = generate(3);
        Restaurant restaurant = new Restaurant(listeTables);
        ArrayList<Table> list = new ArrayList<Table>();
        list.add(listeTables.get(0));
        Service service = new Service(list);
        MaitreHotel maitreHotel = new MaitreHotel();
        Table t = new Table();
        System.out.println(t.getAll());
        HashMap<String, String> hmap = new HashMap<String, String>();
        System.out.println(t.create(new Table("33")));
        System.out.println("result => " + t.findById("1"));
        System.out.println("result => " + t.update("1", new Table("55")));
        System.out.println("result => " + t.delete("1"));
//        System.out.println("result => " + t.findById("10"));

//        QUAND le service débute
        service.commence();


//        ALORS la table éditée est affectée au serveur et les deux autres au maître d'hôtel
        ArrayList<Table> listeMaitreHotel = new ArrayList<Table>();
        listeMaitreHotel.add(listeTables.get(1));
        listeMaitreHotel.add(listeTables.get(2));
        maitreHotel.tablesAffectees(listeMaitreHotel);

        ensure(maitreHotel.getTablesAffectees().size() == 2);

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
