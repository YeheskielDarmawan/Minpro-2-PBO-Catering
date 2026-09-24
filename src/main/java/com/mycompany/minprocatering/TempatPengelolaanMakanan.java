package com.mycompany.minprocatering;

import java.util.ArrayList;

public class TempatPengelolaanMakanan {
    private ArrayList<MenuCatering> daftarMenu = new ArrayList<>();

    public TempatPengelolaanMakanan() {
        // Dummy data awal
        daftarMenu.add(new MenuMakanan("M01", "Ayam Goreng", 20000, "Pedas"));
        daftarMenu.add(new MenuMinuman("D01", "Es Teh", 5000, "Sedang"));
    }

    public void tambahMenu(MenuCatering menu) {
        daftarMenu.add(menu);
        System.out.println("Data berhasil ditambah!");
    }

    public void tampilkanSemua() {
        if (daftarMenu.size() == 0) {
            System.out.println("Belum ada data menu.");
        } else {
            System.out.println("\n--- DAFTAR MENU ---");
            for (int i = 0; i < daftarMenu.size(); i++) {
                daftarMenu.get(i).tampilDetail();
            }
        }
    }

    public void hapusMenu(String id) {
        boolean ada = false;
        for (int i = 0; i < daftarMenu.size(); i++) {
            if (daftarMenu.get(i).getId().equals(id)) {
                daftarMenu.remove(i);
                ada = true;
                System.out.println("Menu berhasil dihapus!");
                break;
            }
        }
        
        if (ada == false) {
            System.out.println("ID menu tidak ditemukan.");
        }
    }
}