# Modul 3 : Pengenalah Pemrograman Berorientasi Objek

## Dasar Teori
* Pemrograman Berorientasi Objek (PBO/OOP)

  Merupakan suatu metode pemrograman yang orientasinya kepada objek. Tujuan dari PBO adalah untuk mempermudah dalam pengembangan sebuah program, dimana semua data   dan fungsi dibungkus ke dalam class-class atau objek-objek. Ada beberapa karateristik dari BPO diantaranya adalah Abstraksi, Encapculation (pembungkusan),         Inheritance (pewarisan), dan Polymorphism (isi class yang berbeda-beda).

<hr>

## Praktikum

|**Tabungan**|
|:-----:|
|+ saldo: int|
|+ tabungan(initsaldo : int)|
|+ getSaldo() : int|
|+ simpanUang(jumlah : int)|
|+ ambilUang(jumlah : int) : boolean|

Soal :
1. Implementasi UML classs diagram dalam pemrograman, untuk membuat class Tabungan. 

Jawaban :
1. [Jawaban Soal 1](https://github.com/iddfian/20104031_Idfian-Azhar-Hidayat_Pemrograman-2/tree/Modul3/src/latihan)

Pada soal pemrograman kali ini mengimplementasikan UML class diagram Tabungan (disimpan dan diambil) ke dalam pemrograman java. 
Pertama membuat class Tabuungan yang berisi saldo, pada UML class diagram tanda (+) berarti modifier public. Setelah itu, membuat constrictor saldo dan getter saldo. 

````java
public class Tabuungan {
    int saldo;
    Tabuungan(int saldo) {
        this.saldo = saldo;
    }
    public int getSaldo() {
        return saldo;
    }
````
Kemudian membuat objek simpanUang dan ambiUang yang berguna untuk menambahkan jumlah saldo dan mengurangi saldo yang ada didalam Tabuungan.

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

Pada program yang dibuat akan menampilkan :

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

<hr>

## Kesimpulan
Dari prkatikum modul 3 ini mahasiswa mengenal dan memahami pemrograman berorientasi objek bagaimana cara mendeklarasikan suatu class, atribut, dan metode serta mengakses objek dengan mengubah UML class diagram Tabungan ke pemrograman. 
