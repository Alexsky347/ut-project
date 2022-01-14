package com.app.controller;

import com.app.Table;
import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.concurrent.atomic.AtomicReference;


public class TableController {

    private static final String FILE_PATH = "src/main/resources/json/table.json";

    /**
     * @param jsonParser
     * @return
     * @throws IOException
     * @throws ParseException
     */
    private JSONArray readInfile(JSONParser jsonParser) throws IOException, ParseException {
        try (FileReader reader = new FileReader(FILE_PATH)) {
            Object obj = jsonParser.parse(reader);
            return (JSONArray) obj;
        }
    }

    /**
     * @return
     * @throws IOException
     * @throws ParseException
     */
    public ArrayList<Object> getAll() throws IOException, ParseException {

        ArrayList<Object> finalData = new ArrayList<>();

        JSONParser jsonParser = new JSONParser();

        this.readInfile(jsonParser).forEach(emp -> {
            finalData.add(parseObject((JSONObject) emp));

        });

        return finalData;
    }

    /**
     * @param id
     * @return
     * @throws IOException
     * @throws ParseException
     */
    public HashMap<String, String> findById(String id) throws IOException, ParseException {

        AtomicReference<HashMap<String, String>> finalData = new AtomicReference<>();

        JSONParser jsonParser = new JSONParser();

        this.readInfile(jsonParser).forEach(emp -> {

            String idObj = parseObject((JSONObject) emp).get("id");
            if (idObj.equals(id)) {
                finalData.set(parseObject((JSONObject) emp));
            }

        });

        return finalData.get();
    }

    /**
     * Create
     *
     * @param object
     * @return
     * @throws IOException
     */
    public boolean create(Table object) throws IOException {
        try {

            JSONObject table = new JSONObject();
            table.put("name", object.getNumero());

            JSONArray tableList = new JSONArray();
            ArrayList<Object> allData = this.getAll();
            tableList.addAll(allData);

            table.put("id", Integer.toString(allData.size() + 1));
            tableList.add(table);

            this.writeInFile(tableList);
            return true;
        } catch (Exception e) {
            return false;
        }

    }

    /**
     * @param data
     * @throws IOException
     */
    public void writeInFile(JSONArray data) throws IOException {
        //Write JSON file
        try (FileWriter file = new FileWriter(FILE_PATH)) {
            //We can write any JSONArray or JSONObject instance to the file
            file.write(data.toJSONString());
            file.flush();
        }
    }

    /**
     * @param id
     * @param object
     * @return
     * @throws IOException
     */
    public boolean update(String id, Table object) throws IOException {
        try {
            HashMap<String, String> obj = new HashMap<String, String>(this.findById(id));


            JSONObject table = new JSONObject();
            table.put("name", object.getNumero());

            JSONArray tableList = new JSONArray();
            ArrayList<Object> allData = this.getAll();
            allData.remove(obj);
            tableList.addAll(allData);
            table.put("id", obj.get("id"));
            tableList.add(table);

            this.writeInFile(tableList);

            return true;
        } catch (Exception ex) {
            return false;
        }
    }

    /**
     * @param obj
     * @return
     */
    private static HashMap<String, String> parseObject(JSONObject obj) {

        HashMap<String, String> hmap = new HashMap<String, String>();

        String id = (String) obj.get("id");
        hmap.put("id", id);

        String name = (String) obj.get("name");
        hmap.put("name", name);

        return hmap;

    }

    /**
     * @param id
     * @return
     */
    public boolean delete(String id) {
        try {
            HashMap<String, String> obj = new HashMap<String, String>(this.findById(id));
            JSONArray tableList = new JSONArray();
            ArrayList<Object> allData = this.getAll();
            allData.remove(obj);
            tableList.addAll(allData);
            this.writeInFile(tableList);

            return true;
        } catch (Exception ex) {
            return false;
        }
    }
}
