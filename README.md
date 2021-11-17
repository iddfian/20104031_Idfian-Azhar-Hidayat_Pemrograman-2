# Modul 6 : Konsep Inheritance

## Dasar Teori
* Pengertian Inheritance

  Interitance `pewarisan atau penurunan` merupakan konsep *OOP "Object-oriented programming"* `dimana sebuah class dapat menurunkan atau mewarisi property dan     methods dari perilaku induknya, dari satu class ke class lainnya`. Suatu class yang mempunyai class `turunan` dinamakan `parent class` atau `superclass           "induk"`, dan class `turunannya` dinamakan `child class` atau `subclass "anak"`. 
  
  Suatu subclass "anak" mewarisi fitur yang dimiliki oleh superclass "induk"-nya. Pada subclass "anak", dia dapat menambahkan property dan methodnya `sendiri`     selain dari superclass "induk"-nya. `Kesimpulannya, dapat dikatakan bahwa suatu subclass "anak" tidak lain hanya memperluas superclass "induk" dengan           menurunkan atau mewarisi property dan methods dari perilaku atau fitur yang dimiliki induknya.` 

* Deklarasi Inheritance dan Single Inheritance 

  Pada JAVA `untuk mendeklarasikan suatu class` sebagai subclass "anak" dilakukan dengan cara menambahkan kata kunci `extends` setelah deklarasi nama class,           kemudian  diikuti dengan nama superclass "induk" class-nya. Contoh deklarasi Inheritance. 
```java
Contoh : 

public class B extends A { 
...
} 
```
    Contoh : diatas memberitahukan compiler JAVA bahwa kita ingin meng "extend" class A ke class B. Dengan kata lain, class B adalah "subclass" (class anak/turunan) dari class A yang sebagai "superclass" (class induk-nya).
  
* Penerapaan Inheritance 
 
  Pada penerapannya sebagai Inheritance, disini `class A` yang sebagai "superclass" (class induk-nya) yang menurunkan atau mewarisi property dan methods kepada     `class B` "subclass" (class anak/turunan). 

````java
public class A {
    /*private*/protected int x;
    /*private*/protected int y;

    public void setX(int x) {
        this.x = x;
    }

    public void sety(int y) {
        this.y = y;
    }

    public void getNilai(){
        System.out.println("Nilai x : " + x + "nilai y : " + y);
    }
}
````  
  
  Kemudian di `class B` sebagai "subclass" (class anak/turunan), menambahkan kata kunci `extends` setelah deklarasi nama class, yang menyatakan kalau class B       adalah `anak/turunan` dari class A. Kemudian  diikuti dengan nama superclass A. 
  
  
````java
  public class B extends A {
    private int z;

    public void setz(int z) {
        this.z = z;
    }

    public void getJumlah(){
        System.out.println("Jumlah : " + (x+y+z));
    }
}
````
 
* Pengaksesan Member dari Parent class

    Pengaksesan member dari parent class A hanya bisa diakses dari :
    - Class itu sendiri
    - Subclass anak/turunan
    - Dan Package (class yang berada satu package dengannya).
    
    Contoh :
    A Ce = new A();
    B De = new B();

    `A` adalah class yang akan dipanggil member dari parent class (induk), `Ce` variable yang dipanggil saat menggunakan `class A`, `new A();` memanggil class A.
    
    Suatu parent class dapat tidak mewariskan sebagian member-nya kepada subclass "anak". Sejauh mana suatu member dapat diwariskan ke class lain, ataupun suatu       member dapat diakses dari class lain, sangat berhubungan  dengan access control (kontrol pengaksesan). 

* Kontrol pengaksesan

     Di dalam java, kontrol pengaksesan dapat digambarkan dalam tabel berikut ini : 

|**Modifier**|**Class yang sama**|**Package yang sama**|**Subclass**|**Class manapun**|
|:-----|:-----:|:-----:|:-----:|:-----:|
|private|:heavy_check_mark:||||
|default|:heavy_check_mark:|:heavy_check_mark:|||
|protected|:heavy_check_mark:|:heavy_check_mark:|:heavy_check_mark:||
|public|:heavy_check_mark:|:heavy_check_mark:|:heavy_check_mark:|:heavy_check_mark:|

* Kata kunci super 

   Kata kunci `super` dipakai untuk merujuk pada `member` dari `parent class`,  sebagaimana kata kunci `this` yang dipakai untuk merujuk pada `member dari class`    itu sendiri. 
   Ada beberapa hal yang harus diingat ketika menggunakan pemanggil constuktor super : 
   - Pemanggil super() HARUS DIJADIKAN PERNYATAAN PERTAMA DALAM constructor. 
   - Pemanggil super() hanya dapat digunakan dalam definisi constructor. 
   - Termasuk constructor this() dan pemanggil super() TIDAK BOLEH  TERJADI DALAM constructor YANG SAMA.

* Konstruktor tidak diwariskan 

   konstruktor tidak dapat diwarisikan karena dalam `subclass "anak/turunan"` memiliki nama yang `berbeda` (nama subclass).
   
````java   
   class A {
   A();
}

class B extends A {
   B();
}
````
Dapat melakukan seperti ini :

````java
B b = new B();
````

Adapun alasan tidak untuk mewarisikan konstruktor, karena konstruktor class A berarti membuat objek tipe A, dan konstruktor class B berarti membuat objek kelas B.
Dalam java pemanggilan konstruktor dilakukan dengan `key super`, dan harus diletakan setelah method "public Child()" atau "error" jika diletakan dibawah "x = 5;".
Ini yang harus kita perhatikan bahwa untuk  pemanggilan konstruktor parent class, kita harus melakukan  pemanggilan tersebut di baris pertama pada konstruktor subclass.

Contohnya :

````java
public class Child extends Parent{
    int x;

    public Child(){
//      x = 5;  - Jika dilekakan diatas "super();" maka yang terjadi akan muncul "error". 
        super();
        x = 5;
    }
}
````

<hr>

## Praktikum
                                    


Soal :
1. Menganalisis Percobaan Modul 6 ! 

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

