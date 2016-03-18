/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

public class Lowongan {

    private int maxBerkasMasuk;
    private int maxBerkasDiterima;
    private BerkasLamaran[] berkasLamaranMasuk;
    private BerkasLamaran[] berkasLamaranDiterima;
    String a = "test";
    private int counterBerkasMasuk = 0;
    private int counterBerkasDiterima = 0;

    public void addBerkas(BerkasLamaran bks) {
        if (counterBerkasMasuk < maxBerkasMasuk) {
            berkasLamaranMasuk[counterBerkasMasuk] = bks;
            counterBerkasMasuk++;
        }
    }

    public void terimaBerkas(BerkasLamaran bks) {
        if (counterBerkasDiterima < maxBerkasDiterima) {
            berkasLamaranDiterima[counterBerkasDiterima] = bks;
            counterBerkasDiterima++;
        }
    }

    public Lowongan(int maxBerkasMasuk, int maxBerkasDiterima) {
        berkasLamaranDiterima = new BerkasLamaran[maxBerkasMasuk];
        berkasLamaranMasuk = new BerkasLamaran[maxBerkasDiterima];
    }

    public Lowongan getIdLowongan() {
        return Lowongan.this;
    }

    public int getCounterBerkasMasuk() {
        return counterBerkasMasuk;
    }

    public void setCounterBerkasMasuk(int counterBerkasMasuk) {
        this.counterBerkasMasuk = counterBerkasMasuk;
    }

    public int getCounterBerkasDiterima() {
        return counterBerkasDiterima;
    }

    public void setCounterBerkasDiterima(int counterBerkasDiterima) {
        this.counterBerkasDiterima = counterBerkasDiterima;
    }

    public int getMaxBerkasMasuk() {
        return maxBerkasMasuk;
    }

    public void setMaxBerkasMasuk(int maxBerkasMasuk) {
        this.maxBerkasMasuk = maxBerkasMasuk;
    }

    public int getMaxBerkasDiterima() {
        return maxBerkasDiterima;
    }

    public void setMaxBerkasDiterima(int maxBerkasDiterima) {
        this.maxBerkasDiterima = maxBerkasDiterima;
    }

    public BerkasLamaran getBerkasLamaranMasuk(int id) {
        return berkasLamaranMasuk[id];
    }

    public void setBerkasLamaranMasuk(int id, BerkasLamaran berkasLamaranMasuk) {
        this.berkasLamaranMasuk[id] = berkasLamaranMasuk;
    }

    public BerkasLamaran getBerkasLamaranDiterima(int id) {
        return berkasLamaranDiterima[id];
    }

    public void setBerkasLamaranDiterima(int id, BerkasLamaran berkasLamaranDiterima) {
        this.berkasLamaranDiterima[id] = berkasLamaranDiterima;
    }

    
}
