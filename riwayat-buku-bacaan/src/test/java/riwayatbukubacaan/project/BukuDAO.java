package riwayatbukubacaan.project;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class BukuDAO {
    public void tambahBuku(Buku buku) {
        String query = "INSERT INTO daftar_nama_buku (Nama_Buku, Penulis, Tipe_Dokumen) VALUES (?, ?, ?)";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, buku.getNamaBuku());
            stmt.setString(2, buku.getPenulis());
            stmt.setString(3, buku.getTipeDokumen());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public Buku dapatkanBuku(int no) {
        String query = "SELECT * FROM daftar_nama_buku WHERE No = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(0, no);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                return new Buku(
                        rs.getInt("No"),
                        rs.getString("Nama_Buku"),
                        rs.getString("Penulis"),
                        rs.getString("Tipe_Dokumen"),
                        rs.getTimestamp("Tanggal_Ditambahkan")
                );
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return null;
    }

    public List<Buku> dapatkanSemuaBuku() {
        List<Buku> bukuList = new ArrayList<>();
        String query = "SELECT * FROM daftar_nama_buku";
        try (Connection conn = DatabaseConnection.getConnection();
             Statement stmt = conn.createStatement();
             ResultSet rs = stmt.executeQuery(query)) {
            while (rs.next()) {
                bukuList.add(new Buku(
                        rs.getInt("No"),
                        rs.getString("Nama_Buku"),
                        rs.getString("Penulis"),
                        rs.getString("Tipe_Dokumen"),
                        rs.getTimestamp("Tanggal_Ditambahkan")
                ));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return bukuList;
    }

    public void perbaruiBuku(Buku buku) {
        String query = "UPDATE daftar_nama_buku SET Nama_Buku = ?, Penulis = ?, Tipe_Dokumen = ? WHERE No = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setString(1, buku.getNamaBuku());
            stmt.setString(2, buku.getPenulis());
            stmt.setString(3, buku.getTipeDokumen());
            stmt.setInt(4, buku.getNo());
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void hapusBuku(int no) {
        String query = "DELETE FROM daftar_nama_buku WHERE No = ?";
        try (Connection conn = DatabaseConnection.getConnection();
             PreparedStatement stmt = conn.prepareStatement(query)) {
            stmt.setInt(1, no);
            stmt.executeUpdate();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
