package Perulangan;

import java.util.Scanner;

public class Lat8 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] angka = new int[5];
        int total = 0;

        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = input.nextInt();
            total += angka[i];
        }

        double rataRata = (double) total / 5;

        System.out.println("Total: " + total);
        System.out.println("Rata-rata: " + rataRata);

        input.close();
    }
}
