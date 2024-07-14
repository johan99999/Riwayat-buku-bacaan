package riwayatbukubacaan.project;

import java.sql.Timestamp;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        BukuDAO bukuDAO = new BukuDAO();
        Scanner scanner = new Scanner(System.in);
        int pilihan;

        do {
            System.out.println("Menu:");
            System.out.println("1. Tambah Buku");
            System.out.println("2. Lihat Semua Buku");
            System.out.println("3. Hapus Buku");
            System.out.println("0. Keluar");
            System.out.print("Pilih opsi: ");
            pilihan = scanner.nextInt();
            scanner.nextLine();  // Consume newline left-over

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Nama Buku: ");
                    String namaBuku = scanner.nextLine();
                    System.out.print("Masukkan Penulis: ");
                    String penulis = scanner.nextLine();
                    System.out.print("Masukkan Tipe Dokumen (PDF/EPUB/dll): ");
                    String tipeDokumen = scanner.nextLine();
                    Buku bukuBaru = new Buku(0, namaBuku, penulis, tipeDokumen, null);
                    bukuDAO.tambahBuku(bukuBaru);
                    System.out.println("Buku berhasil ditambahkan!");
                    break;
                case 2:
                    List<Buku> semuaBuku = bukuDAO.dapatkanSemuaBuku();
                    for (Buku b : semuaBuku) {
                        System.out.println("No: " + b.getNo() +
                                ", Nama Buku: " + b.getNamaBuku() +
                                ", Penulis: " + b.getPenulis() +
                                ", Tipe Dokumen: " + b.getTipeDokumen() +
                                ", Tanggal Ditambahkan: " + b.getTanggalDitambahkan());
                    }
                    break;
                case 3:
                    System.out.print("Masukkan No Buku yang akan dihapus: ");
                    int no = scanner.nextInt();
                    bukuDAO.hapusBuku(no);
                    System.out.println("Buku berhasil dihapus!");
                    break;
                case 0:
                    System.out.println("Keluar...");
                    break;
                default:
                    System.out.println("Pilihan tidak valid.");
            }
        } while (pilihan != 0);

        scanner.close();
    }
}

