# Modul 8 : Polimorfisme

## Dasar Teori

-BELUM-

* *Overloading*

  Overloading adalah suatu keadaaan dimana ada beberapa method yang memiliki `nama` yang `sama`, pada `suatu class` dengan method `lain`. Tetapi, dengan parameter yang `berbeda` (mempunyai implementasi dan return value). `Tujuan` dari overloading adalah `untuk memudahkan penggunaan method dengan fungsi yang hampir sama`. Overloading ini dapat terjadi pada suatu class yang sama, pada suatu superclass "parent/induk" class dan atau suatu subclass "child/anak"nya.
  
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
    @java.lang.Override
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
  
    Tujuan dari Method Overriding adalah jika class 'induk' ingin memberikan implementasinya sendiri, ia dapat memberikannya dengan `meng-override` method dari class `induk` kepada subclass `anak`. 
    
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
1. Mengamati *Overloading* pada method percobaan 1 dan 2 ! 

Jawaban :
1. [Jawaban soal 1](https://github.com/iddfian/20104031_Idfian-Azhar-Hidayat_Pemrograman-2/tree/Modul8/src/latihan)

  - Percobaan *overloading* pada method 1

````java
public class A {
}
public class B extends A{
}
public class C extends B{
}
public class Overload { // memiliki 2 method
    void myOverload(A a) {
        System.out.println("Overload.myOverload (A a)");
    }

    void myOverload(B b) {
        System.out.println("Overload.myOverload (B b)");
    }

    public static void main(String[] args) {
        Overload o = new Overload(); // objek class Overload bernama o
     // A a = new A();// objek class A bernama a
        C c = new C(); // objek class C bernama c

    //  o.myOverload(a);// memanggil method yang ada pada class Overload dengan mengisi parameter objek class A
        o.myOverload(c); // memanggil method yang ada pada class Overload dengan mengisi parameter objek class C
    }
}
````
Output program percobaan 1 menampilkan :

````java
Overload.myOverload (B b)
````
Kenapa hasil run programnya hanya menampilkan `Overload.myOverload (B b)` ? Karena pada program diatas tidak ada method myOverload yang parameternya itu (C c) atau `lebih dekat` selain myOverload (B b). Karena itu pada output program diatas menampilkan method `Overload.myOverload (B b)` dimana parameter (B b) lebih dekat dengan `method yang dicari`.


   - Percobaan *overloading* pada method 2

````java
public class Overload1 {
    void myMethod(short s) {
        System.out.println("sort");
    }

    void myMethod(int i) {
        System.out.println("int");
    }

    void myMethod(long l) {
        System.out.println("long");
    }

    public static void main(String[] args) {
        Overload1 o = new Overload1();
        byte b = 1;

        o.myMethod(b);
    }
}
````

Output program percobaan 2 menampilkan :

````java
sort
````
Kenapa hasil run programnya hanya menampilkan `sort` ? Karena pada program diatas menggunakan tipe data `byte`, dimana tipe data `sort`lah yang `ukuran` tipe datanya `lebih dekat` dengan `method yang dicari`. Maka tipe data `sort`lah yang ditampilkan karena lebih dekat dibandingkan dengan tipe data `int` dan `long`. 


<hr>

## Kesimpulan
Dari praktikum modul 7 ini mahasiswa dapat memahami tentang *overloading* yaitu suatu keadaaan dimana ada beberapa method yang memiliki `nama` yang `sama`, pada `suatu class` dengan `method lain`. Tetapi, dengan parameter yang `berbeda`, memahami tentang *overriding* yaitu sebuah mekanisme dimana metode yang terdapat pada superclass "induk" dapat dideklarasikan ulang atau diturunkan methodnya kepada subclass "anak" atau pewarisan. Dan mahasiswa memahami aturan tentang *overidden*seperti List dari `Nama method`, `Daftar parameter`, Dan `Return type` harus benar-benar `sama`, termasuk `tipe data` dan urutan pada `argumen` tersebut, dan adanya aturan agar suatu program *overridden* dapat berjalan dengan baik. Dan mengamati soal praktikum percobaan *overloading* pada method 1 dan 2. 

