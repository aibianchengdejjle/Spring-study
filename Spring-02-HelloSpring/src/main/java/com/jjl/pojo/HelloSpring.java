package com.jjl.pojo;

public class HelloSpring {
    @Override
    public String toString() {
        return "HelloSpring{" +
                "str='" + str + '\'' +
                '}';
    }

    public String getStr() {
        return str;
    }

    public void setStr(String str) {
        this.str = str;
    }

    private  String str;
}
