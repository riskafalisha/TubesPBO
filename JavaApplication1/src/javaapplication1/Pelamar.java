/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author acer
 */
public class Pelamar extends Orang {

    Lowongan lowongan;
    BerkasLamaran berkas = null;
    int index = 0;
    int jmlBerkas;
    String pekerjaan;
    Perusahaan perusahaan;

    public Pelamar(String nama, int umur, String JenisKelamin) {
        super(nama, umur, JenisKelamin);
    }

    public void createBerkas(String nama, int umur, String jenisKelamin, String pekerjaan) {
        super.setNama(nama);
        super.setUmur(umur);
        super.setJenisKelamin(jenisKelamin);
        this.pekerjaan = pekerjaan;
        berkas = new BerkasLamaran(nama, pekerjaan, umur, jenisKelamin);
    }

    public void mendaftarLamaran() {
        if (berkas != null) {
            if (lowongan.getCounterBerkasMasuk() < lowongan.getMaxBerkasMasuk()) {
                lowongan.setBerkasLamaranMasuk(lowongan.getCounterBerkasMasuk(),berkas);
                lowongan.setCounterBerkasMasuk(lowongan.getCounterBerkasMasuk()+1);
            }
        } else {
            System.out.println("Berkas belum dibuat!");
        }
    }
}
