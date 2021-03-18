package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
	    Scanner scan = new Scanner(System.in);
	    double ile;
        System.out.println("ile chcesz kulek lodow:  ");
        ile = scan.nextDouble();
        Lodziarnia lody = new Lodziarnia();
        System.out.println(lody.obliczCene(ile));
    }
}
