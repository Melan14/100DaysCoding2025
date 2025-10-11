import java.util.Scanner;

public class Day34 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        int a = input.nextInt();
        System.out.print("Masukkan angka kedua: ");
        int b = input.nextInt();
        System.out.print("Masukkan angka ketiga: ");
        int c = input.nextInt();

        // Operator aritmatika
        int hasilAritmatika = (a + b) * c;
        System.out.println("\nHasil (a + b) * c = " + hasilAritmatika);

        // Operator perbandingan
        boolean perbandingan = hasilAritmatika > 50;
        System.out.println("Apakah hasil lebih besar dari 50? " + perbandingan);

        // Operator logika 
        boolean logika = (a > b) && (c > a);
        System.out.println("Apakah a lebih besar dari b DAN c lebih besar dari a? " + logika);
    }
}
