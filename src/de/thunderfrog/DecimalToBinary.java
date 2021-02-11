package de.thunderfrog;

public class DecimalToBinary {
    public static void main(String[] args) {
        int decimal = 2542;
        String binary = "";

        while (decimal != 0) {
            binary = (decimal % 2) + binary;
            decimal = decimal / 2;
        }
        System.out.println(binary);
    }
}
