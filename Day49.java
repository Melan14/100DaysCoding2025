import java.util.Scanner;

public class Day49 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan nilai Anda: ");
        int nilai = input.nextInt();

        String hasil = (nilai >= 60) ? "Anda Lulus" : "Anda Tidak Lulus";
        System.out.println("Hasil: " + hasil);
    }
}
