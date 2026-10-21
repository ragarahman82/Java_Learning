package Percobaan;

import java.util.Scanner;

public class main1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        double angka1 = input.nextDouble();

        System.out.print("Masukkan angka kedua: ");
        double angka2 = input.nextDouble();

        System.out.println("Hasil tambah: " + (angka1 + angka2));
        System.out.println("Hasil kurang: " + (angka1 - angka2));
        System.out.println("Hasil kali: " + (angka1 * angka2));
        if (angka2 != 0) {
            System.out.println("Hasil bagi: " + (angka1 / angka2));
        } else {
            System.out.println("Hasil bagi tidak bisa dihitung karena pembagi 0.");
        }

        System.out.print("Masukkan panjang persegi panjang: ");
        double panjang = input.nextDouble();

        System.out.print("Masukkan lebar persegi panjang: ");
        double lebar = input.nextDouble();

        double luas = panjang * lebar;
        System.out.println("Luas persegi panjang: " + luas);

        input.close();
    }
}
