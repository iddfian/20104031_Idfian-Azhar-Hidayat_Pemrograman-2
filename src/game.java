import java.util.Scanner;

public class game {
    pkotak loc = new pkotak();
    private area Area = new area();
    pemain Pemain = new pemain();
    pemenangnya Pemenang = new pemenangnya();
    Scanner scanner = new Scanner(System.in);

    char[][] kotak = pkotak.kotak;
    bukan Bukan = new bukan();
    private int baris, kolom;
    void mulaibermain() { //overload
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                kotak[i][j] = '_';
            }
        }
        loc.pkotak();
        while (Pemenang.pemenang()) {
            baris = scanner.nextInt();
            kolom = scanner.nextInt();
            if (baris > 3 || kolom > 3) {
                System.out.println("Salah, angka di luar kotak\nCoba lagi!");
            } else {
                if (Area.isFull(baris, kolom)) {
                    System.err.println("Sudah di isi");
                } else {
                    kotak[baris - 1][kolom - 1] = Pemain.arahnya();
                    loc.pkotak();
                    Pemain.pilihpemain();
                }
            }
        }
        Pemain.pilihpemain();
        System.out.println("\nPemenagnya: " + Pemain.arahnya());

    }
}

class pemain extends area{ //interitance
    public char arah = 'X';
    public void pilihpemain() { //overload
        if (arah == 'X') {
            arah = 'O';
        } else {
            arah = 'X';
        }
    }
    public char arahnya() {
        return arah;
    }
}

class area {
    char[][] kotak = pkotak.kotak;
    public boolean isFull(int baris, int kolom) {
        return kotak[baris - 1][kolom - 1] == 'X' ||
                kotak[baris - 1][kolom - 1] == 'O';
    }
}

class bukan {
    char[][] kotak = pkotak.kotak; //polimorfisme
    public boolean luarkotak(int baris, int kolom) {
        if (baris > 3 || kolom > 3) {
            System.err.println("Ini bukan baris atau kolomnya");
            return true;
        }
        return false;
    }
}

class pkotak {
    public static char[][] kotak = new char[3][3];
    public void pkotak() { //overload
        System.out.print("\nCara Bermain: Tekan Enter, pilih angka Baris dan Kolom = (Baris '-' angka: 1, 2, 3) dan (Kolom '||' angka: 1, 2, 3) ENTER.\n");

        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(kotak[i][j] + " | ");
            }
            System.out.println();
        }
        System.out.println("-------------");
    }
}

class pemenangnya {
    char[][] Area = pkotak.kotak;
    public boolean pemenang() {
        if (Area[0][0] != '_' && Area[0][0] == Area[0][1] && Area[0][0] == Area[0][2])
            return false;
        if (Area[1][0] != '_' && Area[1][0] == Area[1][1] && Area[1][0] == Area[1][2])
            return false;
        if (Area[2][0] != '_' && Area[2][0] == Area[2][1] && Area[2][0] == Area[2][2])
            return false;
        if (Area[0][0] != '_' && Area[0][0] == Area[1][0] && Area[0][0] == Area[2][0])
            return false;
        if (Area[0][1] != '_' && Area[0][1] == Area[1][1] && Area[0][1] == Area[2][1])
            return false;
        if (Area[0][2] != '_' && Area[0][2] == Area[1][2] && Area[0][2] == Area[2][2])
            return false;
        if (Area[0][0] != '_' && Area[0][0] == Area[1][1] && Area[0][0] == Area[2][2])
            return false;
        return Area[0][2] == '_' || Area[0][2] != Area[1][1] || Area[0][2] != Area[2][0];
    }
}
