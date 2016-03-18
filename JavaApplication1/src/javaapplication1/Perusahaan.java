/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author Ricky
 */
public class Perusahaan {
    private String namaPerusahaan;
    private String bidang;
    private String kota;
    private String lembaga;
    private Lowongan[] daftarLowongan;
    int n;
    Pelamar pelamar;
    boolean status;
    
public Perusahaan() {
    daftarLowongan = new Lowongan[9999];
    n = 0;  
}
public void createLowongan() {
    daftarLowongan[n] = new Lowongan();
    n++;
}

    public String getNamaPerusahaan() {
        return namaPerusahaan;
    }

    public void setNamaPerusahaan(String namaPerusahaan) {
        this.namaPerusahaan = namaPerusahaan;
    }

    public String getBidang() {
        return bidang;
    }

    public void setBidang(String bidang) {
        this.bidang = bidang;
    }

    public String getKota() {
        return kota;
    }

    public void setKota(String kota) {
        this.kota = kota;
    }

    public String getLembaga() {
        return lembaga;
    }

    public void setLembaga(String lembaga) {
        this.lembaga = lembaga;
    }
    public Lowongan getLowongan(int indeks) {
        return daftarLowongan[indeks];
    }
    public Lowongan getLowonganId(int idLowongan) {
        int i = 0;
        boolean found = false;
        for(i = 0; i < n; i++) {
            if(daftarLowongan[i].getIdLowongan().equals(idLowongan)) {
                found = true;
                break;
            }
        }
         if(found==false) {
             System.out.println("Data tidak ada");
         }
         return daftarLowongan[i];
    }
public void removeLowongan(){
    for(int i=0; i < n; i++){
        daftarLowongan[i] = null;
    }
}
public void displayPelamar() {
    
}
public void statusLowongan() {
    status = true;
    daftarLowongan = new Lowongan[9999];
}
}
