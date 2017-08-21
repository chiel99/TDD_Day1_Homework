package io.twincatstudio.tdd_dayonehomework;


import java.util.HashMap;

class Product {
    HashMap<String, Integer> mMap = new HashMap<>();

    public Product(int id, int cost, int revenue, int sellPrice) {
        set("Id", id);
        set("Cost", cost);
        set("Revenue", revenue);
        set("SellPrice", sellPrice);
    }

    public void set(String columnName, Integer value) {
        mMap.put(columnName, value);
    }

    public Integer get(String columnName) {
        return mMap.get(columnName);
    }

    public boolean has(String columnName) {
        return mMap.containsKey(columnName);
    }

}
