package com.app.unitaire;

import com.app.MaitreHotel;
import com.app.Table;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import static org.valid4j.Assertive.ensure;


public class MaitreHotelTest {

    private MaitreHotel maitreHotel = new MaitreHotel();

    @Test
    public void tablesTest(){

        ArrayList<Table> listTables = new ArrayList<Table>();
        Table table = new Table("1");
        listTables.add(table);

        this.maitreHotel.tablesAffectees(listTables);
        ensure(this.maitreHotel.getTablesAffectees().size() == listTables.size());
    }
}
