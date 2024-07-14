package riwayatbukubacaan.project;
import java.sql.Timestamp;
import java.util.List;

public class MainTest {
    public static void main(String[] args) {
        BukuDaoTest object = new BukuDaoTest();
        BukuTest bukuBaru = new BukuTest( "No", "Judul Buku", "Penulis Buku", "Tipe Dokumen", "Tanggal Ditambahkan");
        object.tambahBuku(bukuBaru);

        BukuTest buku = BukuDaoTest.dapatkanBuku(1);
        if (buku != null) {
            System.out.println("Buku : " + buku.getNamaBuku() + " oleh " + buku.getPenulis() + " ditambahkan pada " + buku.getTanggalDitambahkan());
        }

        BukuTest bukuPerbarui = new BukuTest("No", "Judul Buku Perbarui", "Penulis Buku Perbarui", "Tipe Dokumen", "Tanggal Ditambahkan");
        BukuDaoTest.perbaruiBuku(bukuPerbarui);

        BukuDaoTest.hapusBuku(1);

    }


}
