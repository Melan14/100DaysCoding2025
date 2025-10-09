import java.util.Scanner;

public class Day32 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int angka1 = input.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int angka2 = input.nextInt();
      
        if (angka1 > 0 || angka2 > 0) {
            System.out.println("Salah satu atau kedua angka bernilai positif.");
        } else {
            System.out.println("Kedua angka bukan positif.");
        }
    }
}
