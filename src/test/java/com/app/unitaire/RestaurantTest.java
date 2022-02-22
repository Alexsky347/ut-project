package com.app.unitaire;

import com.app.Restaurant;
import com.app.Table;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.util.ArrayList;
import static org.valid4j.Assertive.ensure;

public class RestaurantTest {

    private Restaurant restaurant;
    private ArrayList<Table> listTables = new ArrayList<Table>();

    @BeforeEach
    public void init(){
        Table table = new Table("1");
        this.listTables.add(table);
        this.restaurant = new Restaurant(listTables);
    }

    @Test
    public void addTable(){
        this.restaurant.ajouteTable(new Table("2"));
        ensure(this.restaurant.getTablesPrises().size() == 2);
    }

    @Test
    public void getTables(){
        ensure(this.restaurant.getTablesPrises().size() == listTables.size());
    }
}
