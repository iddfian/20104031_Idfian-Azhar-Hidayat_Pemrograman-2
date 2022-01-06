# Tugas Besar : TicTacToeOOP

## Dasar Teori

* Exception 

    Exceptions adalah suatu anomali yang terjadi pada saat menjalankan suatu program, yang menunjukan suatu error atau kondisi mencegah hasil berjalan secara normal. Teknik yang dipakai dalam Java untuk menangani kondisi yang tidak biasa disebut exception handling. Jika exception tidak ditangani maka program akan berhenti secara abnormal. Sebagai contoh ketika mengakses suatu array index yang menggunakan index out of bonds, maka saat menjalnkanya akan mendapatkan error program ArrayIndexOutOfBoundsException karena ingin mengakses elemen array yang tidak ada.  
  
* Exception handling 
  
    Exception handling merupakan bagian penting dalam aplikasi Java yang baik dalam menangani error pada saat program berjalan atau biasa disebut runtime error. Adanya error dalam program dapat memyebabkan program atau sebuah aplikasi tersebut berhenti. Untuk itu diperlukan program `exceprion handling` dalam programnya untuk mamastikan program dapat berjalan meski terdapat error di dalamya. Java menyediakan beberapa fitur untuk exception heandling, `try`, `catch` dan `finally`. Dalam  Java juga memungkinkan untuk membuat exception yang baru dan melemparnya dengan menggunakan `throw` dan `throws`.

<hr>

## Praktikum

Soal :
1. Latihan method exception ! 

Jawaban :

  - [Method yang melempar checked exception](https://github.com/iddfian/20104031_Idfian-Azhar-Hidayat_Pemrograman-2/blob/Modul9/src/Praktikum/latihan/Percobaan7.java)

Output program menampilkan :

````java
File Tidak Ada
````

   - [Method yang melempar unchecked exception](https://github.com/iddfian/20104031_Idfian-Azhar-Hidayat_Pemrograman-2/blob/Modul9/src/Praktikum/latihan/Percobaan.java)

Output program menampilkan :

````java
Masukan Angka : 7
Angka kurang dari atau sama dengan 10
Selesai
````

   - [Menggunakan konsep Inheritance untuk membuat superclass dan subclass exception. Program menangani exception dengan menangkap subclass exception dengan superclass](https://github.com/iddfian/20104031_Idfian-Azhar-Hidayat_Pemrograman-2/blob/Modul9/src/Praktikum/latihan/Demo.java)

Output program menampilkan :

|**Exception**|
|:-----:|
|**( i ) praktikum.latihan.ExceptionC**|
|**OK**|


<hr>

## Kesimpulan
Dari praktikum modul 9 ini mahasiswa dapat memahami mengenai exception yaitu exceptions adalah suatu anomali yang terjadi pada saat menjalankan suatu program, yang menunjukan suatu error atau kondisi mencegah hasil berjalan secara normal, Memahami tipe exception yaitu Checked Exception (merupakan exception yang dicheck atau diketahui saat dikompilasi) dan Unchecked Exception (merupakan exception yang baru dicheck atau diketahui saat runtime), Menangani exception menggunakan try, catch, finally, throw dan throws (melempar exception).
