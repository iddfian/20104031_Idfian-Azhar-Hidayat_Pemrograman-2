# TUGAS BESAR PRAKTIKUM PEMROGRAMAN 2 SEMESTER 3

# Dosen Pengampu : Arif Amrulloh, S.Kom., M.Kom

# Asistem Praktikum : Muslimin Dita H

## TEAM

* Alissyah Putri (20104013)
* Dani Azka Faz (20104024)
* Elan Bagaskoro (20104027)
* Idfian Azhar Hidayat (20104031)
* `LINK Presentasi :` [Tic-tac-toe oop](https://drive.google.com/file/d/1GkO6SHeWWhk7rJWGmNLQSlnAwk8GDknj/view)

## TicTacToe :x::o:

# SINOPSIS GAME

Tic-tac-toe merupakan permainan klasik berjenis permainan papan (board-game) dengan ukuran 3x3. Cara memainkan Permainan tersebut dengan memberikan Nilai X atau O pada tiap kotak papan. Dalam Permainan ini hasil permainan yang didapat berupa menang, kalah, atau seri. 

(cara bermainya)

Seorang player akan bermain tic-tac-toe bersama player lainnya. Dia memiliki kesempatan berfikir dan memilih meletakkan huruf ❌ atau ⭕ untuk memenangkan permainan. Kunci utamanya untuk memenangkan permainan ini ada di huruf ❌ dan ⭕ yang salah satunya misal ⭕ tersusun satu deret sebanyak tiga ⭕ mengisi bagian kotak.

Player ❌ akan memulai permainan terlebih dahulu dan dilanjutkan dengan Player ⭕.

Jika salah satu player berhasil meletakkan huruf ❌ atau huruf ⭕ secara sejajar dalam satu deret baik itu secara horizontal, vertikal, atau diagonal sebagai contoh :

| |:o:|:x: |
| -- |-- | -- |
| :o:|:x:|:o: |
| :x:||:x: |

Maka player tersebutlah pemenang permainan.

Jika simbol huruf ❌ dan ⭕ tidak sejajar dalam satu deret maka permainan ini akan seri sebagai contoh :

| |:o:|:x: |
| -- |-- | -- |
| :o:|:x:|:o: |
| :o:|:o:|:x: |

Saat player ❌ atau player ⭕ memenangkan permainan akan muncul "Pemenangnya : ❌ / ⭕"

Dikarenakan salah satu player sudah memenangkan permainannya, maka permainan pun selesai 🎉🎉

## Struktur Dasar Dalam Game Tic-tac-toe

# Class 
* main.class
* game.class

## Mekanisme Game

* GamePlay
* Klik pada tempat yang masih kosong
* Game akan terus berlanjut sampai semua kotak terisi simbol :x: / :o:

## MATERI YANG RELEVAN DENGAN PEMROGRAMAN 2 

1. OOP atau Pemrograman Berorientasi Objek OOP atau Pemrograman Berorientasi Objek merupakan pemrograman yang berorientasikan kepada objek, yang mana semua data dan fungsi dibungkus dalam class atau object. Dalam penggunaan OOP sendiri meliputi Deklarasi Class, Deklarasi Atribut, Deklarasi Method serta Mengakses Objek. Penerapan Class dalam pemrograman kami yaitu pada bagian :

````java
Class game {....}
Class Main {....}
````

* Untuk penggunaan Enkapsulasi, seluruh class menggunakan akses modifire `public` agar dapat diakses oleh main dengan mudah.
* Kemudian penggunakan modifire `private` digunakan dalam deklarasi variable pada Class game, ini digunakan agar saat dalam pemanggilan dalam class lain tidak ada kesalahan pemanggilan.
* Kami juga menggunakan modifire `protected` dalam Class Area, penggunaan modifire protected dalam class Area difungsikan agar hanya class turunan Area yang dapat menggunakannya, seperti class Pemain.

2. Dasar Pemrograman Berorientasi Objek

Dasar pada pemrograman berorientasi objek yaitu diantaranya terdapat :

* Keyword Sebuah identifier yang telah dipesan untuk melakukan pendefinisian sebelumnya oleh java yang digunakan untuk tujuan tertentu.
* Tipe-Tipe Data Dasar Dalam dasar pemrograman java terdapat 8 tipe dasar yaitu boolean, char, byte, short, int, long, float, dan double, contoh penerapan nya yaitu :

````java
int baris;
````
Diatas adalah contoh dari penerapan tipe data dasar yaitu integer dimana gunanya adalah untuk melakukan pendeklarasian data dengan bertipe data dasar integer yang hanya dapat menerima data angka. -Variabel Variabel merupakan sebuah wadah yang digunakan untuk penyimpanan data pada java, contoh penerapan nya yaitu :

````java
int kolom;
````
Diatas merupakan contoh penerapan variabel dalam java, dimana diatas terjadi pendeklarasian variabel code dengan bertipe data integer. 

3. Mengelola Class Pada java dalam pengelolaan class terdapat 2 bagian yaitu :

* Package Package yaitu merupakan sebuah metode enkapsulasi yang digunakan untuk melakukan pengelompokan class, sub package dan interfaces, package ini digunakan selain untuk mealkukan pengelompokan juga digunakan untuk mencegah konflik penamaan terhadap file file, layaknya dalam folder didalam sebuah directory.
* Import Import digunakan untuk melakukan pemanggilan sehingga, function - function dalam class tersebut dapat diakses biasanya digunakan untuk memanggil sebuah package beserta isinya dan juga dapat digunakan untuk memanggil interface.

4. Inheritance Inheritance atau Pewarisan merupakan sebuah konsep Object Oriented Programming, dimana sebuah class yang baru mewarisi atau memiliki metode - metode atau bagian - bagian dari class yang sebelumnya yang sudah ada, Konsep Pewarisan ini dalam penggunaannya menggunakan sistem hirarki atau sistem yang bertingkat dimana apabila submenu tersebut lebih spesifik maka akan semakin spesifik juga isi didalamnya itu juga berlaku dalam konsep pewarisan OOP apabila semakin spesifik subclassnya maka akan semakin sedikit pula bagian - bagian yang dapat diwarisi class tersebut kepada class berikutnya, contoh dari penerapan inheritance :

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

Diatas merupakan contoh inheritance dimana class Area merupakan parent class dari class Pemain sedangkan class Pemain merupakan child class dari Area.

5. Overloading & Overriding

Pada java terdapat 2 metode yang dapat dilakukan untuk meringkas bagian pemrograman, 2 metode tersebut yaitu overloading dan overriding.

Overloading Overloading merupakan sebuah metode yang digunakan untuk memungkinkan banyak metode - metode yang memiliki perbedaan dalam parameter dan hasil return yang berbeda untuk memiliki nama yang sama, dikarenakan oleh itu penggunaan metode Overloading bermanfaat yaitu tidak perlu lagi membuat fungsi - fungsi yang memiliki perbedaan nama namun bertugas sama, syarat yang harus terpenuhi apabila ingin melakukan metode Overloading yaitu :

````java
    -  Nama metode harus sama
    -  Daftar Parameter harus berbeda
    -  Return type dapat sama namun juga boleh berbeda;
````
Overriding Overriding merupakan sebuah metode yang digunakan untuk mengimplementasikan sebuah fungsi spesifik di subclass dimana fungsi tersebut berada di superclass, syarat yang harus terpenuhi apabila ingin menggunakan metode Overriding yaitu :

````java
    - Nama metode harus sama
    - Daftar Parameter harus sama
    - Return type harus sama 
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
Tugas Besar ini kami membuat permainan tic-tac-toe menggunakan java oop. Tic-tac-toe merupakan permainan klasik berjenis permainan papan (board-game) dengan ukuran 3x3. Cara memainkan Permainan tersebut dengan memberikan Nilai X atau O pada tiap kotak papan. Dalam Permainan ini hasil permainan yang didapat berupa menang, kalah, atau seri.
