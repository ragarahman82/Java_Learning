package Perulangan;

import java.util.Scanner;

public class Lat14 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan kata: ");
        String kata = input.nextLine();

        boolean palindrom = true;

        for (int i = 0; i < kata.length() / 2; i++) {
            if (kata.charAt(i) != kata.charAt(kata.length() - 1 - i)) {
                palindrom = false;
                break;
            }
        }

        if (palindrom) {
            System.out.println("Kata tersebut adalah palindrom");
        } else {
            System.out.println("Kata tersebut bukan palindrom");
        }
        input.close();
    }
}

