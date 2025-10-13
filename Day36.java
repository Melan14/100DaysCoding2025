import java.util.Scanner;

public class Day36 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("nilai ujian anda: ");
        int nilai = input.nextInt();

        if (nilai >= 60) { 
            if (nilai >= 85) {
                System.out.println("Nilai Anda A (Sangat Baik)");
            } else {
                System.out.println("Nilai Anda B (Baik)");
            }
        } else {
            System.out.println("Nilai Anda C (Tidak Lulus)");
        }
    }
}
