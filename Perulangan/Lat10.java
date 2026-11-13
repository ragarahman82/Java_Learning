package Perulangan;

import java.util.Scanner;

public class Lat10 {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int[] angka = new int[5];

        for (int i = 0; i < 5; i++) {
            System.out.print("Masukkan angka ke-" + (i + 1) + ": ");
            angka[i] = input.nextInt();
        }

        System.out.println("Urutan terbalik:");

        for (int i = 4; i >= 0; i--) {
            System.out.println(angka[i]);
        }
        input.close();
    }
}

