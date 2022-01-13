package com.app;


import com.app.utils.TableGenerator;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class InstallationClientTest implements TableGenerator {

    @Test
    @DisplayName("ÉTANT DONNE une table dans un restaurant ayant débuté son service " +
            "QUAND un client est affecté à une table " +
            "ALORS cette table n'est plus sur la liste des tables libres du restaurant")
    public void InstallationClient_RetireLaTable() {
        // ÉTANT DONNE une table dans un restaurant ayant débuté son service
        ArrayList<Table> listeTables = generateTables(1);
        var client = new Client();

        var restaurant = new Restaurant(listeTables);
        restaurant.DébuterService();

        // QUAND un client est affecté à une table
        listeTables.get(0).AffecterA(client);

        // ALORS cette table n'est plus sur la liste des tables libres du restaurant
        var tablesPrises = restaurant.getTablesPrises();

        assertThat(tablesPrises, is(tablesPrises));


    }


    @Test
    @DisplayName("ÉTANT DONNE une table occupée par un client" +
            "QUAND la table est libérée" +
            "ALORS cette table apparaît sur la liste des tables libres du restaurant")
    public void DésaffectationTable() {
        //ÉTANT DONNE une table occupée par un client
        ArrayList<Table> listeTables = generateTables(1);
        var restaurant = new Restaurant(listeTables);
        restaurant.DébuterService();
        var client = new Client();
        listeTables.get(0).AffecterA(client);

        // QUAND la table est libérée
        listeTables.get(0).LibererA();

        // ALORS cette table apparaît sur la liste des tables libres du restaurant
        var tablesLibres = restaurant.getTablesPrises();

        assertThat(tablesLibres, is(tablesLibres));
    }
}
