package AngAng;
import java.sql.SQLOutput;
import java.util.Scanner;
public class AngAngAng {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        //Soal 1
        final short a;
        System.out.print("saat ini tahun ");
        a = in.nextShort();
        System.out.print("jadi tahun kemarin adalah ");
        short b = in.nextShort();
        System.out.print("tahun depan berarti ");
        int c = in.nextInt();

        System.out.printf("saat ini tahun %d \n",a);
        System.out.println("jadi tahun kemarin adalah tahun "+c);
        System.out.println("tahun depan berarti "+b);
        System.out.print(c);
        System.out.printf(" %d ",a);
        System.out.println(b);

        //Soal 2
        int A = in.nextInt();
        int B = in.nextInt();
        int C = in.nextInt();
        System.out.println("sebelum di shuffle A = "+A+", b = "+B+", C = "+C);

        int temp = A;
        A = C;
        C = B;
        B = temp;
        System.out.println("setelah di shuffle A = "+A+", b = "+B+", C = "+C);

        //Soal 3
        byte merah = in.nextByte();
        short hijau = in.nextShort();
        int biru = in.nextInt();

        System.out.printf("%d -> ",merah);

        hijau = merah;
        System.out.print(hijau+" -> ");

        biru = hijau;
        System.out.println(biru);
    }
}
