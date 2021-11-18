# Modul 7 : Overloading & Overriding

## Dasar Teori

* *Overloading*

  Overloading adalah suatu keadaaan dimana ada beberapa method yang memiliki `nama` yang `sama`, pada `suatu class` dengan method `lain`. Tetapi, dengan parametrnya yang `berbeda` (mempunyai implementasi dan return value). `Tujuan` dari overloading adalah `untuk memudahkan penggunaan method dengan fungsi yang hampir sama`. Overloading ini dapat terjadi pada suatu class yang sama, pada suatu superclass "parent/induk" class dan atau suatu subclass "child/anak".
  
  Ciri-ciri dari suatu `Overloading` diantaranya yaitu : 
  - Memiliki nama method yang harus `sama`.
  - Daftar Parameter yang harus `berbeda`.
  - Dan Return type-nya boleh `sama` dan boleh juga `berbeda`.
  
  class Mahasiswa : memiliki method bernama `info` tetapi `parameter` yang dimilikinya `berbeda` berupa `String nama`.
  
````java
  public class Mahasiswa {
    public void info() {
        //Method ini akan dijalankan jika parameter 'tidak' diisi, (hanya menampikan : Haloo... aku mahasiswa!)
        System.out.println("Haloo... aku mahasiswa!");
    }
    //Dan method ini akan dijalankan jika parametrnya diisi, (method ini memiliki parameter 'String nama' jika parameter 'nama' diisi maka akan menampilkan ke2 outputnya)
    public void info(String nama) {
        System.out.println("Haloo... namaku " + nama);
    }
}
````

- class Main (*Overloading*).

````java
public class Main {
    public static void main(String[] args) {
        Mahasiswa aku = new Mahasiswa();

        aku.info();
        aku.info("Idfian Azhar Hidayat");
    }
}
````

- Output program menampilkan :

````java
Haloo... aku mahasiswa!
Haloo... namaku Idfian Azhar Hidayat
````

* *Overriding*

    Overriding adalah mekanisme dimana sebuah metode yang terdapat pada superclass "induk" dapat dideklarasikan ulang atau `diturunkan` methodnya kepada subclass "anak". Jika pada Overloading daftar `parameternya` harus `berbeda`, sedangkan pada Overriding daftar parameternya haruslah `sama`. Method yang `terkena` Override diharuskan atau `tidak boleh` mempunyai modifier yang `lebih luas` aksesnya, dari method yang `mengoverride` misalnya : (`protcted menjadi public`).
  
  Ciri-ciri dari suatu `Overriding` diantaranya yaitu :
  - Nama method yang harus `sama`.
  - Daftar parameter yang harus `sama`.
  - Dan Return type juga harus `sama`.
  
  
class Burung :
  
````java
  public class Burung { // parent/"induk" class
    /*
    class Burung memiliki method bernama 'terbang', jika meethod dipanggil dari objek 'Burung' maka
    method ini akan dieksekusi atau dioverride ketika 'terbang()' dipanggil.
     */
    public void terbang(){
        System.out.println("Aku terbang!");
    }
}
````
  class Penguin :
  
````java
  public class Penguin extends Burung{ // child/"anak" class
     /*
    Jika meethod 'terbang' ini dipanggil dari objek 'Penguin' maka
    method ini juga akan dieksekusi ketika 'terbang()' dipanggil
     */
    @Override
    public void terbang(){
        System.out.println("Aku tidak bisa terbang!");
    }
}
````
- class *Overriding*.

````java
public class Overriding {
    public static void main(String[] args) {
        Burung burung = new Burung();
        Penguin penguin = new Penguin();

        burung.terbang();
        penguin.terbang();
    }
}
````
  
  * Aturan tentang *Overridden* method
  
    Tujuan dari Method Overriding adalah jika class 'induk' ingin memberikan implementasinya sendiri, ia dapat memberikannya dengan `meng-override` method dari class 'induk' kepada subclass 'anak'. 
    
    Beberapa aturan penting untuk *Overridden* pada JAVA :
      - List dari `Nama method`, `Daftar parameter`, Dan `Return type` harus benar-benar `sama`, termasuk `tipe data` dan urutan pada `argumen` tersebut.
      - Acces modifier pada overriding method `tidak boleh` lebih luas aksesnya, dari method yang `mengoverride`.
      - Jika overridden method adalah `default` maka overriding harus `default`, `protected/public`.
      - Jika overridden method adalah `protected` maka overriding `harus protected/public`.
      - Jika overridden method adalah `public`, maka overriding `harus public`.
      - Jika suatu class `inheritance` mengimplementasikan interface, maka `class` tersebut harus meng-override `semua` method `kecuali` class itu sendiri.
      - Method static, private dan final tidak bisa di-override. Namun method static bisa dideklarasikan ulang pada subclass 'anak'.
      - Jika method `tidak bisa` diturunkan/diwariskan, maka `tidak bisa` di-override.
      - Suatu constructor `tidak bisa` untuk di-override.
      - Untuk `memanggil` overriden method melalui subclass 'anak' dapat menggunakan key `super`.

<hr>

## Praktikum

Soal :
1. Melakukan *Overloading* pada method percobaan 1 dan 2 ! 

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
