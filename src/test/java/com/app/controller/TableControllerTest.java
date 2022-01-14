package com.app.controller;

import com.app.Table;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import java.io.IOException;
import org.json.simple.parser.ParseException;
import java.util.HashMap;

import static org.junit.jupiter.api.Assertions.*;
import static org.valid4j.Assertive.ensure;

class TableControllerTest {
    TableController tableController;

    @BeforeEach
    void setUp() {

        tableController = new TableController();
    }

    @AfterEach
    void tearDown() throws IOException {
        JSONObject obj1= new JSONObject();
        obj1.put("name", "Gupta");
        obj1.put("id", "1");

        JSONObject obj2= new JSONObject();
        obj2.put("name", "Gupto");
        obj2.put("id", "2");

        JSONObject obj3= new JSONObject();
        obj3.put("name", "Gupti");
        obj3.put("id", "3");

        JSONArray datas = new JSONArray();
        datas.add(obj1);
        datas.add(obj2);
        datas.add(obj3);

        tableController.writeInFile(datas);
    }

    @Test
    void getAll() throws IOException, ParseException, ParseException {
        ensure(tableController.getAll().size() == 3);
    }

    @Test
    void findById() throws IOException, ParseException {
        HashMap<String, String> hm = tableController.findById("1");

        ensure(hm.get("name").equals("Gupta"));
    }

    @Test
    void create() throws IOException, ParseException {
        Table table = new Table("654");
        boolean createTableResponse = tableController.create(table);

        ensure(createTableResponse);
        ensure(tableController.getAll().size() == 4);
    }

    @Test
    void update() throws IOException, ParseException {
        Table table = new Table("rr");
        boolean response = tableController.update("1", table);
        HashMap<String, String> hm = tableController.findById("1");
        ensure(response);
        ensure(hm.get("name").equals(table.getNumero()));
    }

    @Test
    void delete() throws IOException, ParseException {
        boolean response = tableController.delete("1");
        HashMap<String, String> hm = tableController.findById("1");
        ensure(response);
        ensure(hm == null);
    }
}