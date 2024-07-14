package riwayatbukubacaan.project;

import org.junit.jupiter.api.Test;

import java.sql.Timestamp;


public class BukuTest {
    private int no;
    private String namaBuku;
    private String penulis;
    private Timestamp tanggalDitambahkan;

    public BukuTest (int no, String namaBuku, String penulis, Timestamp tanggalDitambahkan) {
        this.no = no;
        this.namaBuku = namaBuku;
        this.penulis = penulis;
        this.tanggalDitambahkan = tanggalDitambahkan;
    }
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

    public Timestamp getTanggalDitambahkan() {
        return tanggalDitambahkan;
    }

    public void setTanggalDitambahkan(Timestamp tanggalDitambahkan) {
        this.tanggalDitambahkan = tanggalDitambahkan;
    }
}
