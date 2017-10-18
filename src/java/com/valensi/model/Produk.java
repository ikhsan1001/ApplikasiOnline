/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.valensi.model;

/**
 *
 * @author user
 */
public class Produk {

    private Integer id;
    private String nama;
    private String keterangan;
    private Double harga;
    private String gambar;

    public Produk(String nama, String keterangan, Double harga, String gambar, Integer id) {
        this.id=id;
        this.nama = nama;
        this.keterangan = keterangan;
        this.harga = harga;
        this.gambar = gambar;
    }

    public Produk() {
        
    }

    public Double getHarga() {
        return harga;
    }

    public void setHarga(Double harga) {
        this.harga = harga;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getKeterangan() {
        return keterangan;
    }

    public void setKeterangan(String keterangan) {
        this.keterangan = keterangan;
    }

    public String getGambar() {
        return gambar;
    }

    public void setGambar(String gambar) {
        this.gambar = gambar;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

}
