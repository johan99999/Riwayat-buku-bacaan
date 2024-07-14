package riwayatbukubacaan.project;

import org.junit.jupiter.api.Test;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BukuDaoTest {

    void tambahBuku(BukuTest buku) {
        String query = "insert into daftar_nama_buku (Nama_Buku, Penulis, Tipe_Dokumen) values (?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement statement = conn.prepareStatement(query)) {
             statement.setString(1, buku.getNamaBuku());
             statement.setString(2, buku.getPenulis());
             statement.setString(3, buku.getTipeDokumen());
             statement.executeUpdate();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }

    }
    public static BukuTest dapatkanBuku(int no) {
        String query = "select * from daftar_nama_buku where No = ?";
        try (Connection conn = DatabaseConnection.getConnection();
                PreparedStatement statement = conn.prepareStatement(query)) {
            statement.setInt(1, no);
            ResultSet result = statement.executeQuery();
            if (result.next()) {
                return new BukuTest(
                        result.getString("No"),
                        result.getString("Nama_Buku"),
                        result.getString("Penulis"),
                        result.getString("Tipe_Dokumen"),
                        result.getString("Tanggal_Ditambahkan")
                );
            }
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
        return null;
    }
    public List<BukuTest> dapatkanSemuaBuku() {
        List<BukuTest> bukuList = new ArrayList<>();
        String query = "select * from daftar_nama_buku";
        try(Connection conn = DatabaseConnection.getConnection();
            Statement statement = conn.createStatement();
            ResultSet result = statement.executeQuery(query)) {
            while (result.next()) {
                bukuList.add(new BukuTest(
                        result.getString("No"),
                        result.getString("Nama_Buku"),
                        result.getString("Penulis"),
                        result.getString("Tipe_Dokumen"),
                        result.getString("Tanggal Ditambahkan")
                ));
            }
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
        return bukuList;
    }
    public static void perbaruiBuku(BukuTest buku) {
        String query = "update daftar_nama_buku set Nama_Buku = ?, Penulis = ? where No = ?";
        try (Connection conn = DatabaseConnection.getConnection();
                PreparedStatement statement = conn.prepareStatement(query)) {
            statement.setString(1, buku.getNamaBuku());
            statement.setString(2, buku.getPenulis());
            statement.setString(3, buku.getNo());
            statement.executeUpdate();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }
    public static void hapusBuku(int no) {
        String query = "delete from daftar_nama_buku where No = ?";
        try (Connection conn = DatabaseConnection.getConnection();
                PreparedStatement statement = conn.prepareStatement(query)) {
            statement.setInt(1, no);
            statement.executeUpdate();
        } catch (SQLException exception) {
            exception.printStackTrace();
        }
    }
}
