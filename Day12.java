import java.util.Scanner;

public class Day12 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Input data biodata
        System.out.println("=== Isi Biodata ===");
        System.out.print("Nama        : ");
        String nama = input.nextLine();
        System.out.print("Umur        : ");
        int umur = input.nextInt();
        System.out.print("Tinggi Badan (cm): ");
        double tinggi = input.nextDouble();

        input.nextLine(); // membersihkan buffer

        System.out.print("Alamat      : ");
        String alamat = input.nextLine();
        System.out.print("Status      : ");
        String status = input.nextLine();

        // Output biodata
        System.out.println("\n=== Biodata Anda ===");
        System.out.println("Nama   : " + nama);
        System.out.println("Umur   : " + umur + " tahun");
        System.out.println("Tinggi : " + tinggi + " cm");
        System.out.println("Alamat : " + alamat);
        System.out.println("Status : " + status);
    }
}
