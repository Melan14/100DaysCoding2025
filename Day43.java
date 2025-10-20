import java.util.Scanner;

public class Day43 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();

        boolean kelipatan3 = angka % 3 == 0;
        boolean kelipatan5 = angka % 5 == 0;

        if (kelipatan3 || kelipatan5) {
            if (kelipatan3 && kelipatan5) {
                System.out.println(angka + " adalah kelipatan 3 dan 5.");
            } else if (kelipatan3) {
                System.out.println(angka + " adalah kelipatan 3.");
            } else {
                System.out.println(angka + " adalah kelipatan 5.");
            }
        } else {
            System.out.println(angka + " bukan kelipatan 3 maupun 5.");
        }
    }
}
