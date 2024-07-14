package riwayatbukubacaan.project;

import java.sql.Timestamp;


public class BukuTest {
    private String no;
    private String namaBuku;
    private String penulis;
    private String tipeDokumen;
    private String tanggalDitambahkan;

    public BukuTest (String no, String namaBuku, String penulis, String tipeDokumen, String tanggalDitambahkan) {
        this.no = no;
        this.namaBuku = namaBuku;
        this.penulis = penulis;
        this.tipeDokumen = tipeDokumen;
        this.tanggalDitambahkan = tanggalDitambahkan;
    }
    public String getNo() {
        return no;
    }

    public void setNo(String no) {
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

    public String getTanggalDitambahkan() {
        return tanggalDitambahkan;
    }

    public void setTanggalDitambahkan(String tanggalDitambahkan) {
        this.tanggalDitambahkan = tanggalDitambahkan;
    }
}
