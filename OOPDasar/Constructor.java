package OOPDasar;

public class Constructor {
    String nama;
    int umur;

    // constructor: nama sama dengan class, tanpa return type
    public Constructor(String nama, int umur) {
        this.nama = nama;
        this.umur = umur;
    }

    void perkenalan() {
        System.out.println("Halo, saya " + nama + ", umur " + umur);
    }
}
