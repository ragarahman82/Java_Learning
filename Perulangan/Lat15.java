package Perulangan;

import java.util.Scanner;

public class Lat15 {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[][] angka = new int[3][3];

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print("Masukkan angka [" + i + "][" + j + "]: ");
                angka[i][j] = input.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            int total = 0;

            for (int j = 0; j < 3; j++) {
                total += angka[i][j];
            }

            System.out.println("Jumlah baris " + (i + 1) + ": " + total);
        }
        input.close();
    }
}

