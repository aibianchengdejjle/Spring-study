package com.jjl.pojo;

import java.lang.reflect.InvocationHandler;

public class Poxoy implements Rent {
    private  Host host;
    @Override
    public void rent() {
        host.rent();
        fee();
    }
    public  void fee(){
        System.out.println("收房租");
    }
    public Poxoy() {
    }

    public Poxoy(Host host) {
        this.host = host;
    }

}
