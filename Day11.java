import java.util.Scanner;

public class Day11 {
    public static void main(String[] args) {
        // Membuat objek Scanner untuk membaca input dari keyboard
        Scanner input = new Scanner(System.in);

        // Membaca data string
        System.out.print("Masukkan nama : ");
        String nama = input.nextLine();

        // Membaca data integer
        System.out.print("Masukkan umur : ");
        int umur = input.nextInt();

        // Membaca data double
        System.out.print("Masukkan tinggi badan (cm): ");
        double tinggi = input.nextDouble();

        // Menampilkan hasil input
        System.out.println("\n--- Data Anda ---");
        System.out.println("Nama   : " + nama);
        System.out.println("Umur   : " + umur + " tahun");
        System.out.println("Tinggi : " + tinggi + " cm");
    }
}
