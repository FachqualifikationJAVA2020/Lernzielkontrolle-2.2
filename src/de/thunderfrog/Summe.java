package de.thunderfrog;

public class Summe {
    public static void main(String[] args) {

        int [] ausgabe = new int [10];
        ausgabe[0] = 1;
        ausgabe[1] = 1;

        for (int i = 2; i < 10; i++) {
            int summe = ausgabe[i-2] + ausgabe[i-1];
            ausgabe[i] = summe;
        }
        for (int i = 0; i<ausgabe.length; i++) {
            if (i<ausgabe.length-1) {
                System.out.print(ausgabe[i]+",");
                }
            else {
                System.out.print(ausgabe[i]);
            }
        }

    }
}
