# Modul 3 : Dasar Pemrograman Java

## Dasar Teori
* Pemrograman Berorientasi Objek (PBO/OOP)

  Merupakan suatu metode pemrograman yang orientasinya kepada objek. Tujuan dari PBO adalah untuk mempermudah dalam pengembangan sebuah program, dimana semua data   dan fungsi dibungkus ke dalam class-class atau objek-objek. Ada beberapa karateristik dari BPO diantaranya adalah Abstraksi, Encapculation (pembungkusan),         Inheritance (pewarisan), dan Polymorphism (isi class yang berbeda-beda).

<hr>

## Praktikum
Soal :
1. Implementasi UML classs diagram dalam pemrograman, untuk membuat class Tabungan. 

Jawaban :
1. [Jawaban Soal 1](https://github.com/iddfian/20104031_Idfian-Azhar-Hidayat_Pemrograman-2/tree/Modul3/src/latihan)


````java
public void simpanUang(int jumlah) {
        saldo = saldo + jumlah;
    }
    public boolean ambilUang(int jumlah) {
        if (saldo - jumlah < 0){
            return false;
        }
        else {
            saldo -= jumlah;
            return true;
        }
    }
````
//Syntax diatas menampilkan error :
```java
Saldo awal : 10000
Jumlah uang yang disimpan : 8000
Jumlah uang yang diambil : 7000 ok
Jumlah uang yang disimpan : 1000
Jumlah uang yang diambil : 10000 ok
Jumlah uang yang diambil : 2500 gagal
Jumlah uang yang disimpan : 2000
Saldo sekarang = 4000
```
//Syntax error terjadi karena java mambaca syntax tersebut dengan tipe data integer, bukan tipe data long. Jika ingin menggunakan tipe data long seperti syntax diatas maka harus menambahkan huruf (suffix) "L" dibelakang angka agar java dapat membaca tipe data tersebut sebagai tipe data long.



<hr>

## Kesimpulan
//Dari prkatikum kali ini mendapatkan pelajaran awal dari java berprientasi objek untuk memajami aturan penamaan identifier, mengetahui tipe-tipe dasar yang ada di Java dan penggunaan variable pada Java.
