public class Day8 {
    public static void main(String[] args) {
        // Deklarasi dan inisialisasi variabel String
        String nama = "Melani";
        String salam = "Apa kabar?";
        String kalimat = "Belajar ki java Lewat 100DaysOfCoding";

        // Menampilkan nilai String
        System.out.println("Nama: " + nama);
        System.out.println("Salam: " + salam);
        System.out.println("Kalimat: " + kalimat);

        // Operasi dasar String
        System.out.println("\n--- Operasi String ---");
        System.out.println("Panjang nama: " + nama.length()); // menghitung jumlah karakter
        System.out.println("Nama dalam huruf besar: " + nama.toUpperCase()); // uppercase
        System.out.println("Nama dalam huruf kecil: " + nama.toLowerCase()); // lowercase
        System.out.println("Apakah kalimat mengandung 'Java'? " + kalimat.contains("Java")); // cek kata
        System.out.println("Huruf pertama nama: " + nama.charAt(0)); // ambil karakter pertama
    }
}
