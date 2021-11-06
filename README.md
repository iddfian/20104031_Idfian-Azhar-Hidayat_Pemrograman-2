# Modul 5 : Mengelola Class

## Dasar Teori
* Package

  Package merupakan suatu cara untuk mengelompokan class-class banyak yang berisi sekumpulan perogram yang dikelompokan menjadi satu dalam kategori tertentu.       Package sangat bermanfaat saat kita membuat program besar yang banyak memiliki class-class, dengan package kita dapat mengelompokanya agar mudah dalam             suatu pengerjaan program. Package juga mempengaruhi hak akses ke class-class di dalamnya dengan nama class utama harus sama dengan nama packagenya.  

* Import Class

  Perintah import digunakan untuk memberitahukan program kepada class-class yang terdapat dalam package tertentu yang akan di import. Import dapat dilakukan hanya   dengan sebagian class atau sub class atau semuanya.

* Kata Kunci (*this*)
  
  Kata kunci (*this*) ini digunakan dalam sebuah kelas untuk menyatakan object sekarang. Kata kunci (*this*) sangat berguna untuk menunjukkan suatu member di       dalam class-nya sendiri. (*this*) dapat digunakan baik untuk data member maupun untuk function member, serta dapat juga digunakan untuk constructor.  
  

|**this.data_member**|merujuk pada data member|
|:-----:|:-----:|
|**this.function_member()**|merujuk pada function member|
|**this()**|merujuk pada construktor|

<hr>

## Praktikum

Perbankan | :arrow_heading_down: |
:------------ |:--------|

|**Nasabah**|                                                                     **has** | **Tabungan**|
|-----|                                                                                  ----|----| 
|- namaAwal : String|                                                                      |- saldo : int |  
|- namaAkhir : String|                                                                     |**-----------------------------------------------** 
|- tabungan : Tabungan |                                                                   |+ Tabungan(saldo : int) |  
|**--------------------------------------------------------------------**|                 |+ getSaldo() : int |
|+ Nasabah (namaAwal : String,  namaAkhir : String) |                                      |+ ambilUang(jumlah : int) : boolean |
|+ getNamaAwal() : String |                                                                |+ simpanUang(jumlah : int) |
|+ getNamaAkhir () : String|
|+ getTabungan() : Tabungan|                                                
|+ setTabungan (tabungan : tabungan)|                                       


Soal :
1. Mengimplementasi UML Class Diagram Perbankan ke dalam program ! 

Jawaban :
1. [Jawaban Soal 1](https://github.com/iddfian/20104031_Idfian-Azhar-Hidayat_Pemrograman-2/tree/Modul5/src/latihan)

Pada soal praktikum kali ini mengimplementasikan UML Class Diagram Perbankan ke dalam pemrograman. Pertama membuat package perbankan yang didalamnya berisis dua class, class Nasabah dan Tabungan. Di class Nasabah digunakan sebagai penampung nama nasabah, yang menggunakan modifier private agar informasi nama nasabah dapat disembunyikan atau dilindungi, kemudian pada class Nasabah digunkan kata kunci *this* untuk menyatakan object namaAwal dan namaAkhir yang sedang digunakan sekarang.

````java
public class Nasabah {
    private String namaAwal;
    private String namaAkhir;
    private latihan.Perbankan.Tabungan tabungan;

    public Nasabah(String namaAwal, String namaAkhir) {
        this.namaAwal = namaAwal;
        this.namaAkhir = namaAkhir;
    }
````
Kemudian di class kedua ini diberi nama Tabungan yang berisi nilai saldo nasabah yang menabung disini. Menggunakan modifier private dengan int (untuk menampung angka) dan saldo nilai uang yang dimiliki nasabah pada tabungan.

````java
public class Tabungan {
    private int saldo;

    public Tabungan(int saldo) {
        this.saldo = saldo;
    }
 ````
Membuat class main method TesLatihan, disini digunakan perintah import untuk memberitahukan program kepada class Nasabah dan class Tabungan yang terdapat dalam package Perbankan yang sudah import. new nasabah bernama Agus Daryanto yang menabung dengan saldo awal sebesar limaribu.
 
 ````java   
import latihan.Perbankan.Nasabah;
import latihan.Perbankan.Tabungan;
public class TesLatihan {
    public static void main(String[] args) {
        int tmp;
        boolean status;
        Nasabah nasabah = new Nasabah("Agus","Daryanto");
        System.out.println("Nasabah atas nama : " + nasabah.getNamaAwal() + " " + nasabah.getNamaAkhir());
        nasabah.setTabungan(new Tabungan(5000));
        tmp = nasabah.getTabungan().getSaldo();
````

Hasil running program menampilkan :

```java
Nasabah atas nama : Agus Daryanto
Saldo awal : 5000
Jumlah uang yang disimpan : 3000
Jumlah uang yang diambil : 6000 Ok
Jumlah uang yang disimpan : 3500
Jumlah uang yang diambil : 4000 Ok
Jumlah uang yang diambil : 1600 gagal
Jumlah uang yang disimpan : 2000
Saldo sekarang = 3500
```   

<hr>

## Kesimpulan
Dari praktikum modul 5 ini mahasiswa dapat memahami mengenai konsep package dan import serta menggunakan kata kunci *this* yang sebelumnya di contohkan pada percobaan satu dan dua, mengimplementasikan UML Class Diagram sekolah ke dalam program. Membuat package sekolah yang berisi class kelas, dan membuat class mahasiswa yang digunakan sebagai inportnya. Kemudian mengerjakan tugas latihan mengimplementasikan UML Class Diagram Perbankan ke dalam program, yang harus menghasilkan output seperti yang ditentukan.
