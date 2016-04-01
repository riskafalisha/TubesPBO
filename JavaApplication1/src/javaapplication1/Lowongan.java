/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.Date;

public class Lowongan {

    private ArrayList<BerkasLamaran> berkasMasuk = new ArrayList<>();
    private ArrayList<BerkasLamaran> berkasDiterima = new ArrayList<>();
    private String nama;
    Date deadline;

    public Lowongan(String nama, Date deadline) {
        this.nama = nama;
        this.deadline = deadline;
    }

    public Lowongan(String nama) {
        this.nama = nama;
    }

    public void addBerkas(BerkasLamaran berkas) {
        berkasMasuk.add(berkas);
    }

    public BerkasLamaran getBerkasMasuk(int id) {
        return berkasMasuk.get(id);
    }

    public void removeBerkasMasuk(int id) {
        berkasMasuk.remove(id);
    }

    public int searchBerkasMasuk(BerkasLamaran berkas) {
        return berkasMasuk.indexOf(berkas);
    }

    public BerkasLamaran getBerkasDiterima(int id) {
        return berkasDiterima.get(id);
    }

    public void removeBerkasDiterima(int id) {
        berkasDiterima.remove(id);
    }

    public int searchBerkasDiterima(BerkasLamaran berkas) {
        return berkasDiterima.indexOf(berkas);
    }

    public void masukToDiterima(BerkasLamaran berkas) {
        int index = searchBerkasMasuk(berkas);
        if (index != -1) {
            berkasDiterima.add(berkasMasuk.get(index));
            berkasMasuk.remove(index);
        } else {
            System.out.println("Berkas Tidak Ditemukan pada Berkas Masuk");
        }
    }

    public void masukToDiterima(int index) {
        if (index != -1) {
            berkasDiterima.add(berkasMasuk.get(index));
            berkasMasuk.remove(index);
        } else {
            System.out.println("Berkas Tidak Ditemukan pada Berkas Masuk");
        }
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public Date getDeadline() {
        return deadline;
    }

    public void setDeadline(Date deadline) {
        this.deadline = deadline;
    }

    public void displayBerkasMasuk() {
        if (!berkasMasuk.isEmpty()) {
            for (int i = 0; i < berkasMasuk.size(); i++) {
                System.out.println(i + 1 + ". " + berkasMasuk.get(i).getNama());
            }
        } else {
            System.out.println("Berkas Masuk Kosong");
        }
    }

    public void displayBerkasDiterima() {
        if (!berkasDiterima.isEmpty()) {
            for (int i = 0; i < berkasDiterima.size(); i++) {
                System.out.println(i + 1 + ". " + berkasDiterima.get(i).getNama());
            }
        }else{
            System.out.println("Berkas Diterima Kosong");
        }
    }

}
