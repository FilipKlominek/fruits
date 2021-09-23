package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter number of vegetables");
        int n = sc.nextInt();
        System.out.println("Enter " + n + " vegetables");
        ArrayList<String> vegetables = new ArrayList<String>();
        for (int i = 0; i <= n; i++) {
            vegetables.add(sc.nextLine());
        }

        System.out.println("Enter number of fruits");
        int m = sc.nextInt();
        System.out.println("Enter " + m + " fruits");
        ArrayList<String> fruits = new ArrayList<String>();
        for (int i = 0; i <= m; i++) {
            fruits.add(sc.nextLine());
        }

        String input = sc.nextLine();
        while (!input.equals("END")) {

            if (vegetables.contains(input)) System.out.println("vegetable");
            else if (fruits.contains(input)) System.out.println("fruit");
            else System.out.println("other");


            input = sc.nextLine();
        }
    }
}
