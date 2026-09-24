package com.mycompany.minprocatering;

public class MenuMakanan extends MenuCatering {
    private String pedas;

    public MenuMakanan(String id, String nama, double harga, String pedas) {
        super(id, nama, harga);
        this.pedas = pedas;
    }

    public String getPedas() {
        return pedas;
    }

    public void setPedas(String pedas) {
        this.pedas = pedas;
    }

    @Override
    public void tampilDetail() {
        System.out.println("[MAKANAN] ID: " + getId() + " | Nama: " + getNama() + " | Pedas: " + pedas + " | Harga: Rp " + getHarga());
    }
}