package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej číslo:");
        float a = sc.nextInt();
        float b = a + 1;
        a = 1;
        float celkem = 0;
        while (a != b) {
            float vystup = (1 / a);
            System.out.println("1" + "/" + a + "=>" + " " + vystup);
            a++;
            celkem += vystup;
        }
        System.out.println("celkem =>" + " " + celkem);
    }
}