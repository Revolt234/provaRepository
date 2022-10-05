package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        float x,y;
        int z;
        System.out.println("Benvenuto caro\n");


        do {
            Scanner s=new Scanner(System.in);
            System.out.println("inserire due valori numerici");
            x=s.nextFloat();
            y=s.nextFloat();
            Calcolatrice c= new Calcolatrice(x,y);
            System.out.println(c);
            System.out.println("0 finisce\n1 addizione\n2 sottrazione\n3 moltiplicazione\n4 divisione\n5 potenza");
            z=s.nextInt();
            switch (z)
            {
                case 1: System.out.println(c.somma(c.getX(),c.getY()));
                    break;
                case 2:System.out.println(c.sottrazione(c.getX(),c.getY()));
                    break;
                case 3: System.out.println(c.moltiplicazione(c.getX(),c.getY()));
                    break;
                case 4: System.out.println(c.divisione(c.getX(),c.getY()));
                    break;
                case 5:
                    System.out.println(c.potenza(c.getX(),c.getY()));
                    break;
                default:
                    if(z!=0)
                    {
                        System.err.println("Nessuna opzione selezionata ");
                    }
            }

        }
        while(z!=0);
        System.out.println("Arrivederci pollo ");
    }
}