package Perulangan;

import java.util.Scanner;

public class Perulangan {
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            System.out.println("Perulangan ke-" + i);
        }

        int total = 0;
        for (int i = 1; i <= 10; i++) {
            total += i;
        }
        System.out.println("Total: " + total);  // 55

        for (int i = 5; i >= 1; i--) {
        System.out.println(i); // untuk menghitung mundur dari 5 hingga 1
        }

        int angka = 1;
        while (angka <= 5) {
        System.out.println(angka);
        angka++; //while: dipakai kalau jumlah ulangnya nggak pasti
        }

        Scanner input = new Scanner(System.in);
        int tebakan = 0;

        while (tebakan != 7) {
        System.out.print("Tebak angka: ");
        tebakan = input.nextInt();
        }
        System.out.println("Benar!"); // while: dipakai kalau jumlah ulangnya nggak pasti
    
        int pilihan;
        do {
        System.out.print("Masukkan angka 1-5: ");
        pilihan = input.nextInt();
        } 
        while (pilihan < 1 || pilihan > 5); // do-while: jalan minimal sekali


        for (int i = 1; i <= 10; i++) {
        if (i == 3) continue;   // lewati putaran ini, lanjut ke i berikutnya
        if (i == 7) break;      // berhenti total dari loop
        System.out.println(i); // Output: 1 2 4 5 6 
        }   // break → keluar dari loop, continue → lompat ke putaran berikutnya

        for (int baris = 1; baris <= 3; baris++) {
        for (int kolom = 1; kolom <= 4; kolom++) {
        System.out.print("* ");
        }
        System.out.println(); //Nested loop (loop di dalam loop)
        }
        input.close();
    }
}