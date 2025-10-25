import java.util.Scanner;

public class Day48 {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.print("angka pertama = ");
        double a = in.nextDouble();
        System.out.print("operator = ");
        char operator = in.next().charAt(0);
        System.out.print("angka kedua = ");
        double b = in.nextDouble();
        double hasil;

        switch (operator) {
            case '+':
               hasil = a + b;
                System.out.println("hasil = " +hasil);
                break;
            case '-':
                hasil = a - b;
                System.out.println("hasil = " +hasil);
                break;
            case '/':
                hasil = a / b;
                System.out.println("hasil = " +hasil);
                break;
            default:
                System.out.println("operator tidak valid");
                break;
        }
    }
}
