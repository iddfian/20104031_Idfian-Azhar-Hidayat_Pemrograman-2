package latihan;
import java.util.Scanner;

public class ABC {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a1;
        int a2;
        int a3;
        int hasil1;
        int hasil2;
        int i;
        System.out.print("Input jumlah testcase : ");
        i = in.nextInt();
        System.out.print("Nilai A1 : ");
        a1 = in.nextInt();
        System.out.print("Nilai B1 : ");
        a2 = in.nextInt();
        System.out.print("Nilai C1 : ");
        a3 = in.nextInt();
        hasil1 = a1 + a2 - a3;

        System.out.print("\nNilai A2 : ");
        a1 = in.nextInt();
        System.out.print("Nilai B2 : ");
        a2 = in.nextInt();
        System.out.print("Nilai C2 : ");
        a3 = in.nextInt();
        hasil2 = a1 + a2 - a3;

        System.out.print("\n - HASIL - ");
        System.out.println("\nHasil = " + hasil1);
        System.out.println("Hasil = " + hasil2);
    }
}
