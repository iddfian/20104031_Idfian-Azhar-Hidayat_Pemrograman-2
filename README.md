# Tugas Besar : TicTacToeOOP

## Dasar Teori

````java
char[][] kotak = pkotak.kotak;
    bukan Bukan = new bukan();
    private int baris, kolom;
    void mulaibermain() { //overload
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                kotak[i][j] = '_';
            }
        }
````
````java
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

````
````java
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
````
````java
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

````

<hr>

## Praktikum

Soal :
1. [TicTacToeOOP](https://github.com/iddfian/20104031_Idfian-Azhar-Hidayat_Pemrograman-2/blob/tubes/src/game.java) 

Jawaban : 

Output program menampilkan :

````java
Cara Bermain: Tekan Enter, pilih angka Baris dan Kolom = (Baris '-' angka: 1, 2, 3) dan (Kolom '||' angka: 1, 2, 3) ENTER.
-------------
| _ | _ | _ | 
| _ | _ | _ | 
| _ | _ | _ | 
-------------
1
1

Cara Bermain: Tekan Enter, pilih angka Baris dan Kolom = (Baris '-' angka: 1, 2, 3) dan (Kolom '||' angka: 1, 2, 3) ENTER.
-------------
| X | _ | _ | 
| _ | _ | _ | 
| _ | _ | _ | 
-------------
2
2

Cara Bermain: Tekan Enter, pilih angka Baris dan Kolom = (Baris '-' angka: 1, 2, 3) dan (Kolom '||' angka: 1, 2, 3) ENTER.
-------------
| X | _ | _ | 
| _ | O | _ | 
| _ | _ | _ | 
-------------
3
3

Cara Bermain: Tekan Enter, pilih angka Baris dan Kolom = (Baris '-' angka: 1, 2, 3) dan (Kolom '||' angka: 1, 2, 3) ENTER.
-------------
| X | _ | _ | 
| _ | O | _ | 
| _ | _ | X | 
-------------
3
1

Cara Bermain: Tekan Enter, pilih angka Baris dan Kolom = (Baris '-' angka: 1, 2, 3) dan (Kolom '||' angka: 1, 2, 3) ENTER.
-------------
| X | _ | _ | 
| _ | O | _ | 
| O | _ | X | 
-------------
2
3

Cara Bermain: Tekan Enter, pilih angka Baris dan Kolom = (Baris '-' angka: 1, 2, 3) dan (Kolom '||' angka: 1, 2, 3) ENTER.
-------------
| X | _ | _ | 
| _ | O | X | 
| O | _ | X | 
-------------
4
4
Salah, angka di luar kotak
Coba lagi!
2
2
Sudah di isi
3
2

Cara Bermain: Tekan Enter, pilih angka Baris dan Kolom = (Baris '-' angka: 1, 2, 3) dan (Kolom '||' angka: 1, 2, 3) ENTER.
-------------
| X | _ | _ | 
| _ | O | X | 
| O | O | X | 
-------------
2
1

Cara Bermain: Tekan Enter, pilih angka Baris dan Kolom = (Baris '-' angka: 1, 2, 3) dan (Kolom '||' angka: 1, 2, 3) ENTER.
-------------
| X | _ | _ | 
| X | O | X | 
| O | O | X | 
-------------
3
1
Sudah di isi
2
3
Sudah di isi
1
2

Cara Bermain: Tekan Enter, pilih angka Baris dan Kolom = (Baris '-' angka: 1, 2, 3) dan (Kolom '||' angka: 1, 2, 3) ENTER.
-------------
| X | O | _ | 
| X | O | X | 
| O | O | X | 
-------------

Pemenagnya: O

Process finished with exit code 0
````




<hr>

## Kesimpulan
Tugas Besar
