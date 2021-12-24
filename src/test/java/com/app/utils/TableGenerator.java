package com.app.utils;

import com.app.Table;

import java.util.ArrayList;

public interface TableGenerator {

    TableBuilder _builder = new TableBuilder();

    ArrayList<Table> tables = new ArrayList<Table>();

    public default ArrayList<Table> generate(int nombre){
        for (int i = 0; i < nombre ; i++) {
           _builder.setNumero(i+"");
           tables.add(_builder.createTable());
        }
        return tables;
    }

}
