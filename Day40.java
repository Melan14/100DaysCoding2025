import java.util.Scanner;

public class Day40 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Masukkan angka pertama: ");
        double a = input.nextDouble();

        System.out.print("Masukkan operator (+, -, *, /): ");
        char op = input.next().charAt(0);

        System.out.print("Masukkan angka kedua: ");
        double b = input.nextDouble();

        if (op == '+')
            System.out.println("Hasil: " + (a + b));
        else if (op == '-')
            System.out.println("Hasil: " + (a - b));
        else if (op == '*')
            System.out.println("Hasil: " + (a * b));
        else if (op == '/')
            System.out.println("Hasil: " + (a / b));
        else
            System.out.println("Operator tidak dikenal!");
    }
}
