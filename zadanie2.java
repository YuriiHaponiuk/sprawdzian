package com.company;

public class Main {

    public static void main(String[] args) {
	    StacjaBenzynowa sa = new Shell();
	    StacjaBenzynowa sa1 = new BP();
        System.out.println(sa.poziomPaliwa());
        System.out.println(sa1.poziomPaliwa());
    }
}
