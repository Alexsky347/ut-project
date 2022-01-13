package com.app;

import java.util.ArrayList;
import java.util.List;

public class MaitreHotel {

    public MaitreHotel(){}

    ArrayList<Table> tablesAffectees;

    public void tablesAffectees(ArrayList<Table> tablesPrises) {
        this.tablesAffectees = tablesPrises;
    }

    public ArrayList<Table> getTablesAffectees(){
        return this.tablesAffectees;
    }

}
