package Perulangan;

import java.util.Scanner;

public class Lat13 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kalimat: ");
        String kalimat = input.nextLine();

        int vokal = 0;

        for (int i = 0; i < kalimat.length(); i++) {
            char huruf = Character.toLowerCase(kalimat.charAt(i));

            if (huruf == 'a' || huruf == 'i' || huruf == 'u' ||
                huruf == 'e' || huruf == 'o') {
                vokal++;
            }
        }

        System.out.println("Jumlah karakter: " + kalimat.length());
        System.out.println("Huruf besar: " + kalimat.toUpperCase());
        System.out.println("Jumlah huruf vokal: " + vokal);

        input.close();
    }
}

