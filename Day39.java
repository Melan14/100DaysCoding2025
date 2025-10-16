import java.util.Scanner;

public class Day39 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int pilihan;

        System.out.println("=== MENU MAKANAN ===");
        System.out.println("1. Nasi Goreng");
        System.out.println("2. Mie Ayam");
        System.out.println("3. Soto Ayam");
        System.out.println("4. Keluar ");
        pilihan = input.nextInt();

        if (pilihan == 1) {
            System.out.println("Anda memilih Nasi Goreng. Harga: Rp15.000");
        } 
        else if (pilihan == 2) {
            System.out.println("Anda memilih Mie Ayam. Harga: Rp12.000");
        } 
        else if (pilihan == 3) {
            System.out.println("Anda memilih Soto Ayam. Harga: Rp13.000");
        } 
        else if (pilihan == 4) {
            System.out.println("Terima kasih! Program selesai.");
        } 
        else {
            System.out.println("Pilihan tidak valid. Silakan coba lagi.");
        }
    }
}
