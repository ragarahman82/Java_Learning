package Perulangan;

import java.util.Scanner;

public class Lat6 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int angka;
        int total = 0;

        while (true) {
            System.out.print("Masukkan angka (0 untuk berhenti): ");
            angka = input.nextInt();

            if (angka == 0) {
                break;
            }

            total += angka;
        }

        System.out.println("Jumlah total = " + total);
        input.close();
    }
}

