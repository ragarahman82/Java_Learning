package Perulangan;

import java.util.Scanner;

public class lat9 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] angka = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = input.nextInt();
        }

        int terbesar = angka[0];
        int terkecil = angka[0];

        for (int i = 0; i < 5; i++) {
            if (angka[i] > terbesar) {
                terbesar = angka[i];
            }

            if (angka[i] < terkecil) {
                terkecil = angka[i];
            }
        }

        System.out.println("Nilai terbesar: " + terbesar);
        System.out.println("Nilai terkecil: " + terkecil);

        input.close();
    }
}

