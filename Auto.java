package com.company;

public class Auto {
    String name;
    public Auto(){

    }
    public Auto(String name){
        this.name = name;
    }
    public double litryNaSto = 8.4;
    public double obliczPaliwo(double droga){
        double ileLitrow;
        ileLitrow = (litryNaSto/100.0)*droga;
        return ileLitrow;
    }
    public enum kolor {
        zolty, czerwony, niebieski;
    }
    public enum Silnik {
        v6, U_podobny, v4;
    }
    public enum paliwo {
        diesel,LPG, benzyna;
    }
}
