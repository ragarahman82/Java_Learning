package ArrayMethodString;

public class main {
    public static void main(String[] args) {
        int[] data = {4, 9, 2, 7, 5};
        int total = 0;
        int max = data[0];

        for (int d : data) {
            total += d;
            if (d > max) {
                max = d;
            }
        }

        System.out.println("Total: " + total);
        System.out.println("Max: " + max);
    }
}