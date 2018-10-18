# Basic-Intent-Beginner
Materi Intent Implicit &amp; Explicit Android for Beginner

## Pengenalan Intent
Intent merupakan objek pertukaran pesan yang bisa Anda gunakan untuk meminta aksi dari komponen aplikasi lain. Walaupun maksud memudahkan komunikasi antarkomponen dalam beberapa cara, ada tiga kasus-penggunaan dasar:

<img src="https://developer.android.com/images/components/intent-filters@2x.png?hl=id"/>

Ada dua tipe maksud:

- **Intent Eksplisit**, menetapkan komponen untuk memulai dengan nama ( nama kelas yang sepenuhnya memenuhi syarat). Anda biasanya akan menggunakan maksud eksplisit untuk memulai sebuah komponen dalam aplikasi sendiri, karena Anda mengetahui nama kelas dari aktivitas atau layanan yang ingin dimulai. Misalnya, mulai aktivitas baru sebagai respons terhadap aksi pengguna atau mulai layanan untuk mengunduh file di latar belakang.
- **Intent Implisit**, tidak menetapkan komponen tertentu, melainkan mendeklarasikan aksi umum yang dilakukan, yang memungkinkan komponen aplikasi lain untuk menanganinya. Misalnya, jika Anda ingin menampilkan sebuah lokasi di peta pada pengguna, Anda bisa menggunakan maksud implisit untuk meminta aplikasi lain yang mampu untuk menunjukkan lokasi yang telah ditetapkan di peta tersebut.

Objek Intent membawa informasi yang digunakan sistem Android untuk menentukan komponen mana yang akan dimulai (misalnya nama persis dari suatu komponen atau kategori komponen yang seharusnya menerima maksud), ditambah informasi yang digunakan komponen penerima untuk melakukan aksi dengan benar (misalnya aksi yang harus dilakukan dan data yang harus diolah).

## Intent dan Intent Filter
- **Untuk memulai aktivitas**: `Activity` menyatakan satu layar dalam aplikasi. Anda bisa memulai instance baru `Activity` dengan meneruskan `Intent` ke `startActivity()`. `Intent` menjelaskan aktivitas yang akan dimulai dan membawa data yang diperlukan. Jika Anda ingin menerima hasil dari aktivitas bila selesai, panggil `startActivityForResult()`. Aktivitas Anda menerima hasil sebagai objek `Intent` terpisah dalam `callback` `onActivityResult()` aktivitas Anda. Untuk informasi selengkapnya, lihat panduan Aktivitas.
- **Untuk memulai layanan**: `Service` adalah komponen yang melakukan operasi di latar belakang tanpa antarmuka pengguna. Anda bisa memulai layanan untuk melakukan operasi satu-kali (misalnya mengunduh file) dengan meneruskan `Intent` ke `startService()`. `Intent` menjelaskan layanan yang akan dimulai dan membawa data yang diperlukan. Jika layanan didesain dengan antarmuka pengguna `klien-server`, Anda bisa mengikat ke layanan dari komponen lain dengan meneruskan Intent ke `bindService()`. Untuk informasi selengkapnya, lihat panduan Layanan.
- **Untuk mengirim siaran**: Siaran adalah pesan yang bisa diterima aplikasi apa saja. Sistem menyampaikan beragam siaran untuk kejadian sistem, misalnya saat sistem booting atau saat perangkat mulai mengisi daya. Anda bisa mengirim siaran ke aplikasi lain dengan meneruskan `Intent` ke `sendBroadcast()`, `sendOrderedBroadcast()`, atau `sendStickyBroadcast()`.

Copyright 2018 Asep Septiadi. All right reserved.
