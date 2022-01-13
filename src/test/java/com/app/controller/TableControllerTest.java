package com.app.controller;

import com.app.Table;
import org.json.simple.parser.ParseException;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import static org.valid4j.Assertive.*;
import static org.valid4j.Validation.*;

class TableControllerTest {

    TableController tableController;

    @BeforeEach
    void setUp() {
        tableController = new TableController();
    }

    @AfterEach
    void tearDown() {
    }

    @Test
    void getAll() throws IOException, ParseException {
        ensure(tableController.getAll().size() == 4);
    }

    @Test
    void findById() {
    }

    @Test
    void create() throws IOException {
        tableController.create(new Table("654"));
    }

    @Test
    void update() {
    }

    @Test
    void delete() {
    }
}