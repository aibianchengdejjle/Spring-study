package com.jjl.pojo;

import java.util.*;

public class Student {
    private  String name;
    private  Address address;

    public void setAddress(Address address) {
        this.address = address;
    }

    private  String []book;
    private List<String> hobbys;
    private Map<String,String> card;
    private Set<String> game;
    private Properties info;
    private  String wife;

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", address=" + address.getAddress() +
                ", book=" + Arrays.toString(book) +
                ", hobbys=" + hobbys +
                ", card=" + card +
                ", game=" + game +
                ", info=" + info +
                ", wife='" + wife + '\'' +
                '}';
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String[] getBook() {
        return book;
    }

    public void setBook(String[] book) {
        this.book = book;
    }

    public List<String> getHobbys() {
        return hobbys;
    }

    public void setHobbys(List<String> hobbys) {
        this.hobbys = hobbys;
    }

    public Map<String, String> getCard() {
        return card;
    }

    public void setCard(Map<String, String> card) {
        this.card = card;
    }

    public Set<String> getGame() {
        return game;
    }

    public void setGame(Set<String> game) {
        this.game = game;
    }

    public Properties getInfo() {
        return info;
    }

    public void setInfo(Properties info) {
        this.info = info;
    }

    public String getWife() {
        return wife;
    }

    public void setWife(String wife) {
        this.wife = wife;
    }

}
