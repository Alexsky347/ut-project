package com.app;

import com.app.repository.TableRepository;
import org.json.simple.parser.ParseException;

import java.io.IOException;
import java.util.ArrayList;


public class Table extends TableRepository {

    private String numero;


    public Table(){}

    public Table(String numero){
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void AffecterA(Client client) {

    }
    public ArrayList<Object> getAllTables() throws IOException, ParseException {
        return this.getAll();
    }


}
