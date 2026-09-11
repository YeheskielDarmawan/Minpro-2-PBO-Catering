package com.mycompany.minprocatering;

public class MinproCatering {
    public static void main(String[] args) {
        TempatPengelolaanMakanan pengelola = new TempatPengelolaanMakanan();
        InputValidator validator = new InputValidator();
        boolean berjalan = true;

        while (berjalan) {
            System.out.println("\n=== SISTEM MANAJEMEN CATERING HARIAN ===");
            System.out.println("1. Tambah Menu");
            System.out.println("2. Lihat Semua Menu");
            System.out.println("3. Ubah Menu");
            System.out.println("4. Hapus Menu");
            System.out.println("5. Keluar");
            
            int pilihan = validator.inputInt("Pilih menu (1-5): ");

            switch (pilihan) {
                case 1:
                    int id = validator.inputInt("Masukkan ID Menu: ");
                    String nama = validator.inputString("Masukkan Nama Menu: ");
                    double harga = validator.inputDouble("Masukkan Harga Menu: "); 
                    pengelola.tambahMenu(new MenuCatering(id, nama, harga)); 
                    break;
                case 2:
                    pengelola.tampilkanSemuaMenu();
                    break;
                case 3:
                    int idUbah = validator.inputInt("Masukkan ID Menu yang ingin diubah: ");
                    String namaBaru = validator.inputString("Masukkan Nama Menu Baru: ");
                    double hargaBaru = validator.inputDouble("Masukkan Harga Menu Baru: ");
                    pengelola.ubahMenu(idUbah, namaBaru, hargaBaru);
                    break;
                case 4:
                    int idHapus = validator.inputInt("Masukkan ID Menu yang ingin dihapus: ");
                    pengelola.hapusMenu(idHapus);
                    break;
                case 5:
                    System.out.println("-> Terima kasih telah menggunakan sistem ini!");
                    berjalan = false;
                    break;
                default:
                    System.out.println("-> Pilihan tidak valid! Masukkan angka 1-5.");
            }
        }
    }
}
