package de.thunderfrog;

import java.util.Scanner;

public class Palidrom {
    public static void main (String[]  args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Gib eine Zeichenkette ein und prüfe, ob es sich um ein Palidrom handelt.");
        String input = sc.next();

        boolean isPalindrome = true;
        int i = 0, j = input.length() - 1;
        while (i < j) {
            if (input.charAt(i) != input.charAt(j))
                isPalindrome = false;
            i++;
            j--;
        }
        if (!isPalindrome) {
            System.out.println("Kein Palindrom");
        } else {
            System.out.println("Es ist ein Palindrom");
        }
        sc.close();
    }
}
