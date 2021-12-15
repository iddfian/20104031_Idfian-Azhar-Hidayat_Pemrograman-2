# Modul 8 : Polimorfisme

## Dasar Teori

-BELUM-

* Konsep dasar polimorfisme

    Polymorphism adalah salah satu konsep alam object oriented programming (OOP) di Java setelah abstraction dan inheritance. Polymorphism berarti banyak ‘bentuk’method yang berbeda-beda meskipun namanya sama. Polymorphism sering dikaitkan dengan penggunaan lebih dari satu metoda dengan nama sama. Penggunaan metoda dengan nama sama dapat melalui method overloading dan method overriding. Peran polymorphism tidak terbatas hanya pada hal-hal tersebut. Ada kaitan erat antara polymorphism dan inheritance (turunan).
  

* Virtual Method Invocation 

    Virtual method invocation merupakan suatu hal yang sangat penting di polimorfisme. Syarat terjadinya VMI adalah suatu obyek yang sudah dibuat untuk memanggil overridden method pada parent class, kemudian compiler Java melakukan pemanggilan overriding pada subclass, dimana yang seharusnya dipanggil adalah overridden.
  
  
* Polymorphic arguments 
  
    Polymorphic arguments adalah sebuah tipe data method yang bisa menerima suatu nilai yang bertipe subclass.  Polymorphic arguments digunakan untuk dapat mengefisienkan satu method yang bisa digunakan untuk menangani behavior semua subclass.


* Pernyataan instanceof 

    Instanceof adalah salah satu keyword pada Java, yang digunakan untuk membandingkan suatu objek, untuk menghasilkan nilai boolean berupa nilai true atau false. instanceof digunakan untuk memeriksa apakah suatu objek adalah turunan dari class, turunan dari subclass, atau turunan dari class yang mengimplementasikan tipe tertentu.

* Casting object 

    Casting pada object adalah mengubah tipe class pada suatu object. Seperti contohnya mengkonversi data dari tipe string ke tipe numerik tertentu dan lain sebagainya. Syarat casting objek adalah harus berada di dalam hierarki turunan (inheritance hierarchy).

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

