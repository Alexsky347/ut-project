package com.app.utils;

import com.app.Table;

public class TableBuilder {
    private String numero;

    public TableBuilder setNumero(String numero) {
        this.numero = numero;
        return this;
    }

    public Table createTable() {
        return new Table();
    }
}