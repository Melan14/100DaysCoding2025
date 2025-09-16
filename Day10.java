public class Day10 {
    public static void main(String[] args) {
        // Membuat konstanta dengan kata kunci final
        final double PHI = 3.14159;
        final int KECEPATAN_MAKSIMUM = 120;

        // Contoh: KECEPATAN_MAKSIMUM tidak bisa diubah karena final
        // KECEPATAN_MAKSIMUM = 150; // <-- Akan error jika diaktifkan

        System.out.println("Nilai PHI: " + PHI);
        System.out.println("Kecepatan Maksimum: " + KECEPATAN_MAKSIMUM + " km/jam");
    }
}
