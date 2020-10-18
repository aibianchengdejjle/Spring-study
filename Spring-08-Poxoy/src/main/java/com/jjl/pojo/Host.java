package com.jjl.pojo;

public class Host implements Rent {
    @Override
    public void rent() {
        System.out.println("房东租房");
    }
}
