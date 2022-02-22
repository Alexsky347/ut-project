package com.app;

public class Table {

    private String numero;

    public Table(){}

    public Table(String numero){
        this.numero = numero;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }


    public boolean AffecterA(Client client) {
        return true;
    }

    public void LibererA() {

    }
}

