public class Day2 {
    public static void main(String[] args) {
        //println()
        System.out.println("Setiap pemanggilan println akan pindah baris.");

        //print()
        System.out.print("Teks ini tidak otomatis pindah baris. ");
        System.out.print("Harus ditambahkan \\n kalau mau pindah baris.\n");

        //printf()
        String nama = "Melani";
        int umur = 20;
        double ipk = 3.75;
        System.out.printf("Nama saya %s, umur %d tahun dengan IPK %.2f%n", nama, umur, ipk);
    }
}
