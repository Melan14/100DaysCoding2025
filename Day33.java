import java.util.Scanner;
public class Day33 {
    public static void main(String[] args) {
        Scanner in = new Scanner (System.in);

        System.out.print("masukkan angka : ");
        int angka = in.nextInt();

        if (!(angka > 5)) {
            System.out.println("Angka tidak lebih besar dari 5");
        } else {
            System.out.println("Angka lebih besar dari 5");
        }
    }
}
