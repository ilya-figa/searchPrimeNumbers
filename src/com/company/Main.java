package com.company;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner num = new Scanner(System.in);
        int where = num.nextInt();

        for (int i = 2; i <= where; i++ ) {
            boolean prime = true;
            for (int j = 2; j  <= (i / 2); j++ ) {
                if (i % j == 0) {
                    prime = false;
                    break;
                }
            }

            if (prime) {
                System.out.println(" " + i + " - " + prime);
            }
        }
    }
}
