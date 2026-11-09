package ArrayMethodString;

public class duadimensi {
    public static void main(String[] args) {
        int[][] matriks = {
            {1, 2, 3},
            {4, 5, 6}
        };
        System.out.println(matriks[1][2]);   // 6 (baris 1, kolom 2)

        for (int i = 0; i < matriks.length; i++) {
            for (int j = 0; j < matriks[i].length; j++) {
                System.out.print(matriks[i][j] + " ");
            }
            System.out.println();
        }
    }
}
