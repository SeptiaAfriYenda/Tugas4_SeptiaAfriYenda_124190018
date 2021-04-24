package com.example.tugas4;

//menambahkan variable yang dapat memberikan atau menghasilkan nilai
public class OppoModel {
    private String tipe;
    private int foto;
    private String spek;

    public String getSpek() { return spek; }
    public void setSpek(String spek) { this.spek = spek; }

    public String getTipe() {
        return tipe;
    }
    public void setTipe(String tipe) {
        this.tipe = tipe;
    }

    public int getFoto() {
        return foto;
    }

    public void setFoto(int foto) {
        this.foto = foto;
    }
}
