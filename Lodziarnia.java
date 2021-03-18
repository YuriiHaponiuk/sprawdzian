package com.company;

public class Lodziarnia {
    public final double cena_za_kulke = 1;
    public double obliczCene(double ilosc){
        double vat = cena_za_kulke * 0.23 * ilosc;
        double cena = cena_za_kulke*ilosc + vat;
        return cena;
    }
    public String nazwa;

    public String getNazwa() {
        return nazwa;
    }

    public void setNazwa(String nazwa) {
        this.nazwa = nazwa;
    }
}
