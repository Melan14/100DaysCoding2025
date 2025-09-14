import java.util.Scanner;

public class Day7 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan satu huruf: ");
        char huruf = input.next().charAt(0);
        boolean isA = (huruf == 'A');
        System.out.println("Apakah huruf sama dengan 'A'? " + isA);
    }
}
