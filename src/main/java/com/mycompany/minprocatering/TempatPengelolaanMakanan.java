package com.mycompany.minprocatering;

import java.util.ArrayList;

public class TempatPengelolaanMakanan {
    private ArrayList<MenuCatering> daftarMenu = new ArrayList<>();

    // Constructor: Menambahkan data bawaan otomatis saat program pertama kali berjalan
    public TempatPengelolaanMakanan() {
        daftarMenu.add(new MenuCatering(101, "Nasi Ayam Goreng Lengkuas + Sambal Bajak", 22000));
        daftarMenu.add(new MenuCatering(102, "Nasi Rendang Sapi + Daun Singkong", 28000));
        daftarMenu.add(new MenuCatering(201, "Chicken Breast Salad + Sesame Dressing", 35000));
        daftarMenu.add(new MenuCatering(202, "Nasi Merah Salmon Teriyaki", 45000));
        daftarMenu.add(new MenuCatering(301, "Paket Buffet Prasmanan Prasojo (Min. 50 Pax)", 50000));
    }

    public void tambahMenu(MenuCatering menu) {
        daftarMenu.add(menu);
        System.out.println("-> Berhasil menambahkan menu!");
    }

    public void tampilkanSemuaMenu() {
        if (daftarMenu.isEmpty()) {
            System.out.println("-> Daftar menu catering masih kosong.");
            return;
        }
        System.out.println("\n=== DAFTAR MENU CATERING HARIAN ===");
        for (MenuCatering menu : daftarMenu) {
            menu.tampilkanData();
        }
    }

    public boolean ubahMenu(int id, String namaBaru, double hargaBaru) {
        for (MenuCatering menu : daftarMenu) {
            if (menu.getId() == id) {
                menu.setNamaMenu(namaBaru);
                menu.setHarga(hargaBaru);
                System.out.println("-> Data menu berhasil diperbarui!");
                return true;
            }
        }
        System.out.println("-> Menu dengan ID " + id + " tidak ditemukan.");
        return false;
    }

    public boolean hapusMenu(int id) {
        for (int i = 0; i < daftarMenu.size(); i++) {
            if (daftarMenu.get(i).getId() == id) {
                daftarMenu.remove(i);
                System.out.println("-> Menu berhasil dihapus!");
                return true;
            }
        }
        System.out.println("-> Menu dengan ID " + id + " tidak ditemukan.");
        return false;
    }
}
