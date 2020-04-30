package com.company;

public abstract class Restaurant {

    private String name;
    private String address;
    private String order;
    private static int totalOrderCount = 0;

    Restaurant(String name, String address, String order) {
        setName(name);
        setAddress(address);
        setOrder(order);
        totalOrderCount++;
    }

    public static int countInstances() {
        return totalOrderCount;
    }

    void setName(String name) {
        this.name = name;
    }

    String getName() {
        return name;
    }

    void setAddress(String address) {
        this.address = address;
    }

    String getAddress() {
        return address;
    }

    void setOrder(String order) {
        this.order = order;
    }

    String getOrder() {
        return order;
    }


    public abstract void lookAtMenu();

    public abstract void makeOrder();

    public abstract void pay();



}


