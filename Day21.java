public class Day21 {
    public static void main(String[] args) {
        int a = 4;
        int b = 9;
        System.out.print("Sebelum ditukar:");
        System.out.println("a = " + a + ", b = " + b);

        a = a * b; // a = 36
        b = a / b; // b = 36 / 9 = 4
        a = a / b; // a = 36 / 4 = 9
        System.out.print("Setelah ditukar:");
        System.out.println("a = " + a + ", b = " + b);
    }
}
