# Modul 8 : Polimorfisme

## Dasar Teori

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
1. Menganalisis hasil running pada program ! 

Jawaban :
1. [Jawaban soal 1](https://github.com/iddfian/20104031_Idfian-Azhar-Hidayat_Pemrograman-2/tree/Modul8/src/latihan)

  - Virtual Method Invocation (VMI)

Output program percobaan menampilkan :

````java
Menyusun Pegawai
Menyusun Pegawai
Memanggil mailCheck Berdasarkan Referensi  Gaji --
Memeriksa kelas gaji dalam  surat 
Surat tertuju untuk Wahyu dengan gaji 5000.0

Memanggil mailCheck Berdasarkan  Referensi Pegawai--
Memeriksa kelas gaji dalam  surat 
Surat tertuju untuk Ini nama dengan gaji 2500.0
````
Kenapa hasil run programnya hanya menampilkan seperti ini ? Karena pada program diatas menggunakan tipe data `byte`, dimana tipe data `sort`lah yang `ukuran` tipe datanya `lebih dekat` dengan `method yang dicari`. Maka tipe data `sort`lah yang ditampilkan karena lebih dekat dibandingkan dengan tipe data `int` dan `long`. 

<hr>

## Kesimpulan
Dari praktikum modul 8 ini mahasiswa dapat memahami tentang *overloading* yaitu suatu keadaaan dimana ada beberapa method yang memiliki `nama` yang `sama`, pada `suatu class` dengan `method lain`. Tetapi, dengan parameter yang `berbeda`, memahami tentang *overriding* yaitu sebuah mekanisme dimana metode yang terdapat pada superclass "induk" dapat dideklarasikan ulang atau diturunkan methodnya kepada subclass "anak" atau pewarisan. Dan mahasiswa memahami aturan tentang *overidden*seperti List dari `Nama method`, `Daftar parameter`, Dan `Return type` harus benar-benar `sama`, termasuk `tipe data` dan urutan pada `argumen` tersebut, dan adanya aturan agar suatu program *overridden* dapat berjalan dengan baik. Dan mengamati soal praktikum percobaan *overloading* pada method 1 dan 2. 
