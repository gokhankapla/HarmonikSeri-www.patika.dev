package com.gokhankaplan.harmonikseri;

import java.util.Scanner;

public class HarmonikSeriHesabi {
    public static void main(String[] args) {
        int n;
        int i;
        double result=0, sum2;
        Scanner input = new Scanner(System.in);
        System.out.println("Sayı giriniz: ");
        n = input.nextInt();

        for (i=1; i<=n; i++) {
            sum2 = 1.0 / i;
            result += sum2;
        }
        System.out.println(result);
    }
}
