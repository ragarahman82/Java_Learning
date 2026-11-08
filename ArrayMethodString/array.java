package ArrayMethodString;

public class array {
    public static void main(String[] args) {
        int[] angka = {10, 20, 30, 40, 50}; // langsung isi
        int[] nilai = new int[5];           // kosong, 5 slot (isi awal 0)

        System.out.println(angka[0]);       // 10 (index mulai dari 0)
        angka[2] = 99;                      // ubah isi
        System.out.println(angka.length);   // 5 (tanpa kurung!)
        System.out.println(nilai[0]);
    }
}