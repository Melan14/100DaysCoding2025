public class Day5 {
    public static void main(String[] args) {
        byte a = 100;            // -128 sampai 127
        short b = 20000;         // -32768 sampai 32767
        int c = 1_000_000;       // -2.147.483.648 sampai 2.147.483.647
        long d = 1_000_000_000L; // -9.223.372.036.854.775.808 sampai 9.223.372.036.854.775.807

        System.out.println("Contoh Tipe Data Numerik Bilangan Bulat:");
        System.out.println("byte  : " + a);
        System.out.println("short : " + b);
        System.out.println("int   : " + c);
        System.out.println("long  : " + d);
    }
}
