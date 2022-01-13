package com.app.fonctionnel;

import com.app.MaitreHotel;
import com.app.Restaurant;
import com.app.Serveur;
import com.app.Table;
import com.app.utils.ServeurBuilder;
import com.app.utils.ServeurGenerator;
import com.app.utils.TableGenerator;
import org.json.simple.parser.ParseException;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import java.util.*;
import static org.valid4j.Assertive.*;
import static org.valid4j.Validation.*;

class DebutServiceTest implements TableGenerator, ServeurGenerator {

    private ArrayList<Table> listeTables;
    private ArrayList<Serveur> listeServeurs;
    Restaurant restaurant;
    MaitreHotel maitreHotel;

    @BeforeEach
    void setUp() {
        listeTables = generateTables(3);
        listeServeurs = generateServices(2);
        restaurant = new Restaurant();
        maitreHotel = new MaitreHotel();
    }

    @Test
    @DisplayName("ÉTANT DONNE un restaurant ayant 3 tables" +
            "QUAND le service commence" +
            "ALORS elles sont toutes affectées au Maître d'Hôtel")
    void tablesAffectees() {

        // ÉTANT DONNE un restaurant ayant 3 tables
        listeServeurs.get(0).setTable(this.listeTables.get(0));
        restaurant.setTablesPrises(listeTables);

        // QUAND le service commence
        restaurant.débuterService();

        // ALORS elles sont toutes affectées au Maître d'Hôtel
        maitreHotel.tablesAffectees(restaurant.getTablesPrises());

        ensure(restaurant.getTablesPrises() == maitreHotel.getTablesAffectees());

    }

    @Test
    @DisplayName("ÉTANT DONNÉ un restaurant ayant 3 tables dont une affectée à un serveur" +
            "QUAND le service débute" +
            "ALORS la table éditée est affectée au serveur et les deux autres au maître d'hôtel")
    void tableEditee() throws IOException, ParseException {

//        ÉTANT DONNÉ un restaurant ayant 3 tables dont une affectée à un serveur
        restaurant.setTablesPrises(listeTables);
        Serveur service = new ServeurBuilder().createServeur();
        service.setTable(this.listeTables.get(0));
        MaitreHotel maitreHotel = new MaitreHotel();
//        Table t = new Table();
//        System.out.println(t.getAll());
//        HashMap<String, String> hmap = new HashMap<String, String>();
//        System.out.println(t.create(new Table("33")));
//        System.out.println("result findById => " + t.findById("2"));
//        System.out.println("result => " + t.update("1", new Table("55")));
//        System.out.println("result => " + t.delete("1"));
//        System.out.println("result => " + t.findById("10"));

//        QUAND le service débute
        restaurant.débuterService();

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
    void ImpossibleModifierServeur() {

//        ÉTANT DONNÉ un restaurant ayant 3 tables dont une affectée à un serveur
        restaurant.setTablesPrises(listeTables);
        listeServeurs.get(0).setTable(this.listeTables.get(0));

//        QUAND le service débute
        restaurant.débuterService();

//        ALORS il n'est pas possible de modifier le serveur affecté à la table
        ensure( listeServeurs.get(0).getTables().size() == 1);
    }

    @Test
    @DisplayName("ÉTANT DONNÉ un restaurant ayant 3 tables dont une affectée à un serveur" +
            "ET ayant débuté son service" +
            "QUAND le service se termine" +
            "ET qu'une table est affectée à un serveur" +
            "ALORS la table éditée est affectée au serveur et les deux autres au maître d'hôtel")
    void tableEditeeAffecteeServeurEtMaitreHotel() {

//        ÉTANT DONNÉ un restaurant ayant 3 tables dont une affectée à un serveur
        restaurant.setTablesPrises(listeTables);
        listeServeurs.get(0).setTable(this.listeTables.get(0));

//        ET ayant débuté son service
        listeServeurs.get(0).débuterService();

//        QUAND le service se termine
        listeServeurs.get(0).finirService();

//        ET qu'une table est affectée à un serveur


//        ALORS la table éditée est affectée au serveur et les deux autres au maître d'hôtel


    }
}
