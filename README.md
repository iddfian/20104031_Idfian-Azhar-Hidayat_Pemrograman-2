# Modul 4 : Dasar Pemrograman Berorientasi Objek

## Dasar Teori
* Informasi Hiding

  Information hiding adalah menyembunyikan atribut maupun method suatu objek dari objek lain. Informasi suatu class disembunyikan atau dilindungi agar para         anggota tidak dapat mengaksesnya dari luar, dengan memberikan hak akses private ketika mendeklarasikan atribut ataupun method.

* Encapsulation

  Encapsulation adalah menyembunyikan implementasi detail dari suatu objek dari objek lain. Encapsilation memiliki dua hal mendasar yaitu information hiding dan     menyediakan method untuk pengaksesan data.

* Constructor
  
  Construcktor adalah method yang berfungsi untuk menginisiasi variable-variable instans yang akan dimilliki oleh objek. Beberapa karateristiknya ialah memiliki     nama yang sama dengan class, tidak mengembalikan suatu nilai, dapat dipanggil oleh constructor lain didalam satu class, dan dapat ditambah acses modifier         puclic, private, protectd, dan default. 

* Overloading Constructor
   
  Overloading constructor adalah suatu class yang mempunyai lebih dari satu constructor dalam satu Class, dengan syarat tidak boleh ada yang sama setiap             construktor memiliki parameter yang berbeda, bisa berbeda jumlah parameternya ataupun berbeda type data parameternya.


<hr>


## Praktikum

Soal :
1. Analisa modul Student Record dan hasil programnya ! 

Jawaban :
1. [Jawaban Soal 1](https://github.com/iddfian/20104031_Idfian-Azhar-Hidayat_Pemrograman-2/tree/Modul4/src/latihan)

Pertama Membuat class dengan nama StudentRecord dan StudentRedordExample, StudentRecord sebagai class yang dipanggil oleh StudentRedordExample.
Kemudian didalam classnya menggunakan atribute dan method yang digunakan untuk menyembunyikan dengan cara membuat modifier private.
````java
public class StudentRecord {
    private String name;
    private String address;
    private int age;
    private double mathGrade;
    private double englishGrade;
    private double scienceGrade;
    private double average;
    private static int studentCount;
````
Didalam class StudentRecord menggunakan encapsulasi dengan attribut getter untuk mengambil nilai nama (getName return name), dan menggunakan setter (setName) untuk memberikan nilai nama dan disimpan sementara di (string temp).

````java
public String getName() {
        return name;
    }

    public void setName(String temp) {
        name = temp;
    }
 ````
Kemudian digunakan (public doubel) dengan result atau hasilnya (0) untuk menampung nilai (mathGrade, englishGrade, scienceGrade)
(getStudentCount) yang nanti dipanggil oleh StudentRedordExample digunakan untuk menetukan hasil dari output programnya.
 
 ````java   
    public double getAverage() {
        double result = 0;
        result = (mathGrade + englishGrade + scienceGrade) / 3; return result;
    }

    public static int getStudentCount() {
        return studentCount;
    }
}
````

Class StudentRedordExample disi dengan nilai atau data yang digunakan sebagai output programnya, berisi (wahyu, isi, dan nama) dengan setter (setName) untuk mengambil nilai dari (wahyu, isi, dan nama).
Dan (systemoutprint) nanti akan  menampilkan output (Wahyu) karena hanya (Wahyu) yang mengguakan getter untuk mengambil nilai nama. Dan (Systemoutprintln-Hitung) menampilkan hasil (0) karena result atau hasilnya (0) dan pada (mathGrade, englishGrade, scienceGrade) nggak diisi nilai inputan.
yang menghasilkan (result) hanya menampilkan (0) sebagai angka defaultnya.

````java
Wahyu.setName("Wahyu");
Ini.setName("Ini");
Nama.setName("Nama");
System.out.println(Wahyu.getName());
        System.out.println("Hitung = " + StudentRecord.getStudentCount());
    }
````

Hasil running program menampilkan :

```java
Wahyu
Hitung = 0
```   

<hr>

## Kesimpulan
Dari praktikum modul 4 ini mahasiswa dapat memahami dasar pemrograman berorientasi objek bagaimana menerapkan konsep enkasulapsi pada class dan mendeklarasikan suatu constructor yang sudah di contohkan pada percobaan satu dan dua serta latihan menganalisa program java student record.
