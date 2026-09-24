package com.mycompany.minprocatering;

public class MenuMinuman extends MenuCatering {
    private String ukuran;

    public MenuMinuman(String id, String nama, double harga, String ukuran) {
        super(id, nama, harga);
        this.ukuran = ukuran;
    }

    public String getUkuran() {
        return ukuran;
    }

    public void setUkuran(String ukuran) {
        this.ukuran = ukuran;
    }

    @Override
    public void tampilDetail() {
        System.out.println("[MINUMAN] ID: " + getId() + " | Nama: " + getNama() + " | Ukuran: " + ukuran + " | Harga: Rp " + getHarga());
    }
}

