package riwayatbukubacaan.project;

import java.sql.Timestamp;

public class Buku {
    private int no;
    private String namaBuku;
    private String penulis;
    private Timestamp tanggalDitambahkan;

    public Buku (int no, String namaBuku, String penulis, Timestamp tanggalDitambahkan) {
        this.no = no;
        this.namaBuku = namaBuku;
        this.penulis = penulis;
        this.tanggalDitambahkan = tanggalDitambahkan;
    }
}
