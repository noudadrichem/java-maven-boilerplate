package models;

import java.util.ArrayList;

public class Test {

    private ArrayList<String> keys;
    private String name;

    public Test(ArrayList<String> keys, String name) {
        this.keys = keys;
        this.name = name;
    }

    public ArrayList<String> getKeys() {
        return keys;
    }

    public boolean addKey(String key) {
        return keys.add(key);
    }

    public String getName() {
        return name;
    }
}
