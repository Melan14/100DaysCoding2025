import java.util.Scanner;

public class Day31 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int angka1 = scanner.nextInt();

        System.out.print("Masukkan angka kedua: ");
        int angka2 = scanner.nextInt();
      
        if (angka1 > 0 && angka2 > 0) {
            System.out.println("Kedua angka positif.");
        } else {
            System.out.println("Salah satu atau kedua angka tidak positif.");
        }
    }
}
