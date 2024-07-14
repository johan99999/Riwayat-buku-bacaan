package riwayatbukubacaan.project;

import org.junit.jupiter.api.Test;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class BukuDaoTest {
    @Test
    void tambahBuku(BukuTest buku) {
        String query = "insert into daftar_nama_buku (Nama_Buku, Penulis) values (?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement statement = conn.prepareStatement(query)) {
             statement.setString(1, buku.getNamaBuku());
             statement.setString(2, buku.getPenulis());
             statement.executeUpdate();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }

    }
    public BukuTest dapatkanBuku(int no) {
        String query = "select * from daftar_nama_buku where No = ?";
        try (Connection conn = DatabaseConnection.getConnection())
    }
}
