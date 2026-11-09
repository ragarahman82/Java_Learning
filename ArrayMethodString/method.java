package ArrayMethodString;

public class method {

    // method dengan return value
    public static int tambah(int a, int b) {
        return a + b;
    }

    // method tanpa return value → void
    public static void sapa(String nama) {
        System.out.println("Halo, " + nama);
    }

    public static void main(String[] args) {
        int hasil = tambah(5, 3);
        System.out.println(hasil);   // 8
        sapa("Raga");
    }
}

