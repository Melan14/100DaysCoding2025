import java.util.Scanner;

public class Day46 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("=== MENU MINUMAN ===");
        System.out.println("1. Kopi");
        System.out.println("2. Teh");
        System.out.println("3. Jus Jeruk");
        System.out.println("4. Air Mineral");
        System.out.print("Masukkan pilihan (1-4): ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Anda memilih Kopi. Harga: Rp10.000");
                break;
            case 2:
                System.out.println("Anda memilih Teh. Harga: Rp7.000");
                break;
            case 3:
                System.out.println("Anda memilih Jus Jeruk. Harga: Rp12.000");
                break;
            case 4:
                System.out.println("Anda memilih Air Mineral. Harga: Rp5.000");
                break;
            default:
                System.out.println("Pilihan tidak tersedia!");
        }
    }
}
