import java.util.Scanner;

public class Day35 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka: ");
        int angka = input.nextInt();

        if (angka >= 0) {
            System.out.println("Angka tersebut adalah positif.");
        }else {
            System.out.println("angka bukan positif");
        }
    }
}
