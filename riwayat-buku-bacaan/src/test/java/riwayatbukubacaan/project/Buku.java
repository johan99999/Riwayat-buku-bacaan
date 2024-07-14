package riwayatbukubacaan.project;

import java.sql.Timestamp;

public class Buku {
    private int no;
    private String namaBuku;
    private String penulis;
    private String tipeDokumen;
    private Timestamp tanggalDitambahkan;

    // Constructor
    public Buku(int no, String namaBuku, String penulis, String tipeDokumen, Timestamp tanggalDitambahkan) {
        this.no = no;
        this.namaBuku = namaBuku;
        this.penulis = penulis;
        this.tipeDokumen = tipeDokumen;
        this.tanggalDitambahkan = tanggalDitambahkan;
    }

    // Getters and Setters
    public int getNo() {
        return no;
    }

    public void setNo(int no) {
        this.no = no;
    }

    public String getNamaBuku() {
        return namaBuku;
    }

    public void setNamaBuku(String namaBuku) {
        this.namaBuku = namaBuku;
    }

    public String getPenulis() {
        return penulis;
    }

    public void setPenulis(String penulis) {
        this.penulis = penulis;
    }

    public String getTipeDokumen() {
        return tipeDokumen;
    }

    public void setTipeDokumen(String tipeDokumen) {
        this.tipeDokumen = tipeDokumen;
    }

    public Timestamp getTanggalDitambahkan() {
        return tanggalDitambahkan;
    }

    public void setTanggalDitambahkan(Timestamp tanggalDitambahkan) {
        this.tanggalDitambahkan = tanggalDitambahkan;
    }
}

