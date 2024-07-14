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
}
