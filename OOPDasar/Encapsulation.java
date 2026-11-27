package OOPDasar;

public class Encapsulation {
    public class Mahasiswa {
    private String nama;
    private int umur;

    public Mahasiswa(String nama, int umur) {
        this.nama = nama;
        setUmur(umur);
    }

    // getter: membaca
    public String getNama() {
        return nama;
    }

    public int getUmur() {
        return umur;
    }

    // setter: mengubah, sambil validasi
    public void setUmur(int umur) {
        if (umur > 0) {
            this.umur = umur;
        } else {
            System.out.println("Umur tidak valid!");
        }
    }
}
}
