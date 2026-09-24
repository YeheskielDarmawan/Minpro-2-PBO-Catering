package com.mycompany.minprocatering;

import java.util.Scanner;

public class MinproCatering {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        TempatPengelolaanMakanan pengelola = new TempatPengelolaanMakanan();
        int pilihan = 0;

        while (pilihan != 5) {
            System.out.println("\n=== MENU CATERING ===");
            System.out.println("1. Lihat Semua Menu");
            System.out.println("2. Tambah Makanan");
            System.out.println("3. Tambah Minuman");
            System.out.println("4. Hapus Menu");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");
            pilihan = input.nextInt();
            input.nextLine(); 

            if (pilihan == 1) {
                pengelola.tampilkanSemua();
            } else if (pilihan == 2) {
                System.out.print("Masukkan ID: ");
                String id = input.nextLine();
                System.out.print("Masukkan Nama Makanan: ");
                String nama = input.nextLine();
                System.out.print("Masukkan Harga: ");
                double harga = input.nextDouble();
                input.nextLine();
                System.out.print("Tingkat Pedas: ");
                String pedas = input.nextLine();

                MenuMakanan mkn = new MenuMakanan(id, nama, harga, pedas);
                pengelola.tambahMenu(mkn);

            } else if (pilihan == 3) {
                System.out.print("Masukkan ID: ");
                String id = input.nextLine();
                System.out.print("Masukkan Nama Minuman: ");
                String nama = input.nextLine();
                System.out.print("Masukkan Harga: ");
                double harga = input.nextDouble();
                input.nextLine();
                System.out.print("Ukuran Minuman: ");
                String ukuran = input.nextLine();

                MenuMinuman mnm = new MenuMinuman(id, nama, harga, ukuran);
                pengelola.tambahMenu(mnm);

            } else if (pilihan == 4) {
                System.out.print("Masukkan ID yang mau dihapus: ");
                String idHapus = input.nextLine();
                pengelola.hapusMenu(idHapus);

            } else if (pilihan == 5) {
                System.out.println("Terima kasih, program selesai!");
            } else {
                System.out.println("Pilihan tidak ada, coba lagi.");
            }
        }
    }
}