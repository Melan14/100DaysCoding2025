public class Day53 {
    public static void main(String[] args) {
         for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                System.out.println("Perulangan dihentikan pada i = " + i);
                break;
            }
            System.out.println("Nilai i: " + i);
        }
        System.out.println("Program selesai.");
    }
}
