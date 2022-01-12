package com.app;


import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import static org.hamcrest.Matchers.is;
import static org.hamcrest.MatcherAssert.assertThat;


public class InstallationClientTest {

    @Test
    @DisplayName("ÉTANT DONNE une table dans un restaurant ayant débuté son service " +
            "QUAND un client est affecté à une table " +
            "ALORS cette table n'est plus sur la liste des tables libres du restaurant")
    public void InstallationClient_RetireLaTable(){
        // ÉTANT DONNE une table dans un restaurant ayant débuté son service
        var table = new Table();
        var client = new Client();

        /*var restaurant = new Restaurant(table);
        restaurant.DébuterService();

        // QUAND un client est affecté à une table
        table.AffecterA(client);

        // ALORS cette table n'est plus sur la liste des tables libres du restaurant
        var tablesLibres = restaurant.TablesesLibres;

        assertThat(null, is(tablesLibres));

         */
    }
}
