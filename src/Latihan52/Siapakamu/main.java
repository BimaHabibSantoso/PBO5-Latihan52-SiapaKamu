/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Latihan52.Siapakamu;

/**
 * @author
 * NAMA     : Bima Habib Santoso
 * KELAS    : FS112B
 * NIM      : 2011436004
 * Deskripsi Program : Menampilkan diri Anda menggunakan sifat inheritance dan polymorphism
 *
 */
public class main {
    public static void main(String[] args) {
        dosen dosen = new dosen();
        dosen.setNip("41227829930");
        dosen.setNama("Rizki Adam Kurniawan");
        dosen.setUmur(27);
        dosen.setMataKuliah("PBO");

        System.out.println("NIP DOSEN : "+dosen.getNip());
        dosen.siapaKamu();
        dosen.mengajarApa();

        mahasiswa mahasiswa = new mahasiswa();
        mahasiswa.setNim("10117065");
        mahasiswa.setNama("Teguh Siswanto");
        mahasiswa.setUmur(20);
        mahasiswa.setKelas("PBO2");

        System.out.println("\nNIP MAHASISWA : "+mahasiswa.getNim());
        mahasiswa.siapaKamu();
        mahasiswa.kelasApa();
    }
}
