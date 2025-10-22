import java.util.Scanner;

public class Day45 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("1. Nasi Goreng");
        System.out.println("2. Mie Goreng");
        System.out.println("3. Sate Ayam");
        System.out.print("Pilih menu (1-3): ");
        int pilihan = input.nextInt();

        switch (pilihan) {
            case 1:
                System.out.println("Anda memilih Nasi Goreng");
                break;
            case 2:
                System.out.println("Anda memilih Mie Goreng");
                break;
            case 3:
                System.out.println("Anda memilih Sate Ayam");
                break;
            default:
                System.out.println("Menu tidak tersedia");
        }
    }
}
