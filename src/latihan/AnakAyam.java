package latihan;
import java.util.Scanner;

public class AnakAyam {
    public static void main(String[] args) {
        int anak,i;
        Scanner input=new Scanner(System.in);
        System.out.print("Masukan jumlah anak ayam : ");
        anak=input.nextInt();
        for(i=anak;i>1;i--) {
            System.out.print("\nAnak ayam turun " + anak);
            anak=i-1;
            System.out.print(", Mati satu tinggal " + anak);
        }
        System.out.print("\nAnak ayam turun 1, Mati 1  tinggal Induknya");
    }
}
