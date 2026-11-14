package Perulangan;

public class Lat11 {

    static double hitungLuas(double p, double l) {
        return p * l;
    }

    static boolean cekGenap(int n) {
        return n % 2 == 0;
    }

    static int faktorial(int n) {
        int hasil = 1;

        for (int i = 1; i <= n; i++) {
            hasil *= i;
        }

        return hasil;
    }

    public static void main(String[] args) {

        System.out.println("Luas: " + hitungLuas(10, 5));

        System.out.println("Cek genap: " + cekGenap(8));

        System.out.println("Faktorial: " + faktorial(5));
    }
}

