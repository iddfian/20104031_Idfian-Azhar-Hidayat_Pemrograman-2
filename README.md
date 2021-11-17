# Modul 6 : Konsep Inheritance

## Dasar Teori
* Pengertian Inheritance

  Interitance `pewarisan atau penurunan` merupakan konsep *OOP "Object-oriented programming"* `dimana sebuah class dapat menurunkan atau mewarisi property dan     methods dari perilaku induknya, dari satu class ke class lainnya`. Suatu class yang mempunyai class `turunan` dinamakan `parent class` atau `superclass           "induk"`, dan class `turunannya` dinamakan `child class` atau `subclass "anak"`. 
  
  Suatu subclass "anak" mewarisi fitur yang dimiliki oleh superclass "induk"-nya. Pada subclass "anak", dia dapat menambahkan property dan methodnya `sendiri`     selain dari superclass "induk"-nya. `Kesimpulannya, dengan Inheritance kita dapat meminimalisir penulisan berulang dari property dan method dengan mewarisi fitur yang dimiliki oleh superclass atau "induk"-nya.` Dapat dikatakan bahwa suatu subclass "anak" tidak lain hanya memperluas superclass "induk" dengan menurunkan atau mewarisi property dan methods dari perilaku yang dimiliki induknya.

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

   constructor tidak dapat diwarisikan karena dalam `subclass "anak/turunan"` memiliki nama yang `berbeda` (nama subclass).
   
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

Adapun alasan tidak untuk mewarisikan constructor, karena constructor class A berarti membuat objek tipe A, dan constructor class B berarti membuat objek kelas B.
Dalam java pemanggilan constructor dilakukan dengan `key super`, dan harus diletakan setelah method "public Child()" atau "error" jika diletakan dibawah "x = 5;".
Ini yang harus kita perhatikan bahwa untuk pemanggilan constructor parent class, kita harus melakukan pemanggilan tersebut di baris pertama pada constructor subclass.

Contohnya :

````java
public class Child extends Parent{
    int x;

    public Child(){
//      x = 5;  - Jika dilekakan diatas "super();" maka yang terjadi akan muncul "error". 
        super();
        x = 5; //Penempatan yang benar
    }
}
````

<hr>

## Praktikum
                                    


Soal :
1. Menganalisis Percobaan Modul 6 ! 

Jawaban :
1. [Jawaban Soal 1](https://github.com/iddfian/20104031_Idfian-Azhar-Hidayat_Pemrograman-2/tree/Modul6/src/percobaan)

  - Membuat kata kunci *super*
 
    Super akan menampilkan objek dari parent class "induk". kata kunci super untuk mengambil nilai dari variabel yang ada di dalam parent class "induk".

````java
public class PersegiTest {
    public static void main(String[] args){
        Persegi kotak = new Persegi();

        kotak.setSuperP(5);
        kotak.setSuperL(10);

        kotak.setP(3);
        kotak.setL(13);

        kotak.getLuas();
    }
}
````
Hasil running program :
````java
Luas Super : 50 
Luas : 39
````

  - Mendefinisikan Superclass dan Subclass 
  
  Superclass adalah class induk-nya tempat subclass "anak" mewarisi fitur dari superclass.
  
  ````java
  public class Person {
    protected String name;
    protected String address;

    public Person(){
        System.out.println("Inside Person : Constructor");
        name = "";
        address = "";
    }

    public Person(String name,String address){
        this.name = name;
        this.address = address;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
````
Hasil running program :
````java
Inside Person : Construktor 
Inside Student : Constructor
````

  - Kontrol pengaksesan 
  
   Di dalam java, kontrol pengaksesan dapat digambarkan dalam tabel :
   
|**Modifier**|**Class yang sama**|**Package yang sama**|**Subclass**|**Class manapun**|
|:-----|:-----:|:-----:|:-----:|:-----:|
|private|:heavy_check_mark:||||
|default|:heavy_check_mark:|:heavy_check_mark:|||
|protected|:heavy_check_mark:|:heavy_check_mark:|:heavy_check_mark:||
|public|:heavy_check_mark:|:heavy_check_mark:|:heavy_check_mark:|:heavy_check_mark:|
   
 ````java
 public class B extends A{
    private int z;

    public void setz(int z) {
        this.z = z;
    }

    public void getJumlah(){
        System.out.println("Jumlah : " + (x+y+z));
    }
}
````
Mengapa timbul pesan kesalahan ? karena menggunkan modifier `private` yang dimana tidak bisa diakses oleh class lain, maka diubah menjadi `protected` yang member dan class hanya bisa diakses dari class itu sendiri,subclass "anak", dan package (class yang berada sama pada satu package).

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
   
   - Konstruktor tidak diwariskan 
   
   Class `kosong` Parent :
   
````java
   public class Parent {
}
````

Class Child :

````java
public class Child extends Parent{
    int x;

    public Child(){
//      x = 5;  - Jika dilekakan diatas "super();" maka yang terjadi akan muncul "error". 
        super();
        x = 5; //Penempatan yang benar
    }
}
````
   Pada Program terjadi `error` karena pemanggilan constructor `key super`, dan harus diletakan setelah method "public Child()" atau "error" jika diletakan dibawah "x = 5;". kita harus melakukan pemanggilan tersebut di baris pertama pada constructor subclass.

<hr>

## Kesimpulan
Dari praktikum modul 6 ini mahasiswa dapat memahami mengenai konsep inheritance dalam pemrograman JAVA dengan Inheritance kita dapat meminimalisir penulisan berulang dari property dan method dengan mewarisi fitur yang dimiliki oleh superclass atau "induk"-nya. Melakukan pengontrolan akses pada pengkodean, Memahami pengaksesan member pada parent class : Pengaksesan member dari parent hanya bisa diakses dari class itu sendiri, subclass anak/turunan, dan package class yang berada satu package, kata kunci super : dipakai untuk merujuk pada member dari parent class, sebagaimana kata kunci this yang dipakai untuk merujuk pada member dari class itu sendiri, dan Menghindari kesalahan pada pewarisan konstruktor : Pada Program terjadi error karena pemanggilan constructor key super, dan harus diletakan setelah method "public Child()" atau "error" jika diletakan dibawah "x = 5;". kita harus melakukan pemanggilan tersebut di baris pertama pada constructor subclass.
