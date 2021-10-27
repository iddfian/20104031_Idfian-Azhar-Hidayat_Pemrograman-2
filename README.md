# Modul 2 : Dasar Pemrograman Java

## Dasar Teori
* Keyword dalam java

  Adalah kata kunci, petunjuk untuk tujuan tertentu yang sudah didefinisikan sebelumnya oleh java.
  
* Tipe dasar

  Ada 8 tipe dasar pada bahasa pemrograman java yaitu boolean, char, byte, short, int, 
  long, float, dan double. 
 
* Variable

  Digunakan untuk meyimpan penyataan objek. Variable mempunyai tipe data yang merupakan tipe nilai yang dibentuk oleh variable sendiri dan     penamaanya harus mengikuti aturan, untuk kemudahan identifier.
  
* Casting dan Promotion

  Casting diperlukan untuk mengkonversi dari suatu tipe data kecil ke tipe data yang panjang bitnya. Sedangkan promotion mengkonversi suatu tipe data ke tipe data yang lebih panjang bitnya.

<hr>

## Praktikum
Soal :
1. Menganalisa batasan maksimum dari suatu tipe
2. Anak ayam
3. A + B - C

Jawaban :
1. [Jawaban Soal 1](https://github.com/iddfian/20104031_Idfian-Azhar-Hidayat_Pemrograman-2/blob/Modul2/src/latihan/Menganalisa.java)
````java
long p=2147483648;
````
Syntax diatas menampilkan error :
```java
error: integer number too large: 2147483648
```
Syntax error terjadi karena java mambaca syntax tersebut dengan tipe data integer, bukan tipe data long. Jika ingin menggunakan tipe data long seperti syntax diatas maka harus menambahkan huruf (suffix) "L" dibelakang angka agar java dapat membaca tipe data tersebut sebagai tipe data long.

2. [Jawaban Soal 2](https://github.com/iddfian/20104031_Idfian-Azhar-Hidayat_Pemrograman-2/blob/Modul2/src/latihan/AnakAyam.java)

Hasil running Anak ayam :
```java
Masukan jumlah anak ayam : 8

Anak ayam turun 8, Mati satu tinggal 7
Anak ayam turun 7, Mati satu tinggal 6
Anak ayam turun 6, Mati satu tinggal 5
Anak ayam turun 5, Mati satu tinggal 4
Anak ayam turun 4, Mati satu tinggal 3
Anak ayam turun 3, Mati satu tinggal 2
Anak ayam turun 2, Mati satu tinggal 1
Anak ayam turun 1, Mati 1 tinggal Induknya
```

3. [Jawaban Soal 3](https://github.com/iddfian/20104031_Idfian-Azhar-Hidayat_Pemrograman-2/blob/Modul2/src/latihan/ABC.java)

Hasil running A + B - C :
```java
Input jumlah testcase : 2
Nilai A1 : 2
Nilai B1 : 3
Nilai C1 : 4

Nilai A2 : -1
Nilai B2 : -3
Nilai C2 : -7

 - HASIL - 
Hasil = 1
Hasil = 3
```

<hr>

## Kesimpulan
Dari prkatikum kali ini mendapatkan pelajaran awal dari java berprientasi objek untuk memajami aturan penamaan identifier, mengetahui tipe-tipe dasar yang ada di Java dan penggunaan variable pada Java.
