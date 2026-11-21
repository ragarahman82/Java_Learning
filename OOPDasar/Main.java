package OOPDasar;

public class Main {
    public static void main(String[] args) {
        Mahasiswa m1 = new Mahasiswa();
        m1.nama = "Budi";
        m1.umur = 20;

        Mahasiswa m2 = new Mahasiswa();
        m2.nama = "Siti";
        m2.umur = 19;

        m1.perkenalan();
        m2.perkenalan();
    }
}
