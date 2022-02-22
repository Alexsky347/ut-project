package com.app.unitaire;

import com.app.Client;
import com.app.Table;
import org.junit.jupiter.api.Test;

import static org.valid4j.Assertive.ensure;

public class TableTest {

    private Table table = new Table("3");

    @Test
    public void testTable(){
        ensure(this.table.getNumero().equals("3"));

        Table table = new Table("4");
        ensure(table.getNumero().equals("4"));
    }

    @Test
    public void affectA(){
        ensure(this.table.AffecterA(new Client()));
    }
}
