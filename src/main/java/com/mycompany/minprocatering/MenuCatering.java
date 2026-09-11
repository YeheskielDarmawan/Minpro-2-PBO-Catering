package com.mycompany.minprocatering;

public class MenuCatering {
    private int id;
    private String namaMenu;
    private double harga;

    public MenuCatering(int id, String namaMenu, double harga) {
        this.id = id;
        this.namaMenu = namaMenu;
        this.harga = harga;
    }

    public int getId() { return id; }
    public void setId(int id) { this.id = id; }

    public String getNamaMenu() { return namaMenu; }
    public void setNamaMenu(String namaMenu) { this.namaMenu = namaMenu; }

    public double getHarga() { return harga; }
    public void setHarga(double harga) { this.harga = harga; }

    public void tampilkanData() {
        System.out.println("ID        : " + id);
        System.out.println("Nama Menu : " + namaMenu);
        System.out.println("Harga     : Rp" + harga);
        System.out.println("--------------------------------");
    }
}
