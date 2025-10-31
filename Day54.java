public class Day54 {
    public static void main(String[] args) {
        System.out.println("Menampilkan angka 1 sampai 10 (kecuali 5):");

        for (int i = 1; i <= 10; i++) {
            if (i == 5) {
                continue;
            }
            System.out.println(i);
        }
        System.out.println("Program selesai!");
    }
}
