# Minpro-2-PBO-Catering

Aplikasi ini merupakan pengembangan dari Mini Project 1 untuk memenuhi tugas Mini Project 2 pada praktikum Pemrograman Berorientasi Objek (PBO). Program ini dibuat menggunakan bahasa pemrograman Java untuk mengelola sistem data menu catering harian berbasis konsol.

## 📌 Deskripsi Program
Aplikasi ini dirancang untuk mencatat, menampilkan, dan menghapus data menu catering yang terbagi menjadi dua kategori: **Makanan** dan **Minuman**. Program memanfaatkan penyimpanan berbasis `ArrayList` dan sudah dilengkapi dengan data awal (*dummy data*) sehingga daftar menu langsung tampil saat program pertama kali dijalankan.

## 🔄 Penjelasan Detail Alur Program
1. **Inisialisasi & Data Awal**:
   Saat aplikasi pertama kali dijalankan, class `TempatPengelolaanMakanan` akan otomatis menambahkan data awal (*Ayam Goreng* dan *Es Teh*) ke dalam `ArrayList`.
2. **Tampilan Menu Utama**:
   Program menampilkan 5 pilihan navigasi utama melalui perulangan `while`:
   - `1. Lihat Semua Menu`
   - `2. Tambah Makanan`
   - `3. Tambah Minuman`
   - `4. Hapus Menu`
   - `5. Keluar`
3. **Proses Input Data (Create)**:
   - Pengguna memilih angka `2` untuk Makanan atau `3` untuk Minuman.
   - Program meminta input ID, Nama, Harga, serta atribut khusus (Tingkat Pedas untuk Makanan / Ukuran untuk Minuman).
   - Objek baru dibuat (`MenuMakanan` atau `MenuMinuman`) lalu disimpan ke dalam `ArrayList`.
4. **Proses Menampilkan Data (Read)**:
   - Pengguna memilih angka `1`.
   - Program melakukan iterasi (*looping*) pada `ArrayList` dan memanggil method `tampilDetail()` untuk menampilkan seluruh daftar menu beserta atribut khususnya.
5. **Proses Penghapusan Data (Delete)**:
   - Pengguna memilih angka `4` dan memasukkan ID menu.
   - Program mencari ID yang cocok di dalam `ArrayList`. Jika ditemukan, data akan dihapus; jika tidak, program menampilkan pesan bahwa ID tidak ditemukan.
6. **Keluar**:
   Pengguna memilih angka `5` untuk menghentikan perulangan dan menutup program.

## 🛡️ Penerapan Encapsulation, Inheritance, dan Polymorphism
- **Encapsulation**:
  Atribut data pada kelas induk (`id`, `nama`, `harga`) dibuat menggunakan *access modifier* `private`. Data hanya dapat diakses dan diubah melalui method *getter* (`getId()`, `getNama()`, `getHarga()`) dan *setter*.
- **Inheritance**:
  - **Superclass (Induk)**: `MenuCatering` sebagai kelas dasar yang menyimpan informasi umum menu.
  - **Subclass (Anak)**: `MenuMakanan` (menambahkan variabel `pedas`) dan `MenuMinuman` (menambahkan variabel `ukuran`) yang mewarisi sifat dari `MenuCatering`.
- **Polymorphism**:
  Method `tampilDetail()` di-*override* pada kelas `MenuMakanan` dan `MenuMinuman` untuk mencetak format tampilan yang spesifik sesuai jenis menunya.

## 📸 Tangkapan Layar (Screenshot Output)

![Tampilan Output Menu](MenuMakanan&Minuman.png)
![Tampilan Output Menambah](MenambahkanMenu.png)
![Tampilan Output Hapus](HapusMenu.png)
