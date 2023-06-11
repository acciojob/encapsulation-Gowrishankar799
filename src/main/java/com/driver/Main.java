package com.driver;

public class Main {
    public static void main(String args[]){
        RWOnly one = new RWOnly();
       // one.name = "venu";
        //System.out.println(one.name);
        one.setName("venu");
        System.out.println(one.getName());

    }
  
}