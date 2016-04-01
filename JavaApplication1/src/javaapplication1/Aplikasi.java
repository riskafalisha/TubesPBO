/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author acer
 */
public class Aplikasi {

    private ArrayList<Perusahaan> daftarPerusahaan = new ArrayList<>();
    private ArrayList<Pelamar> daftarPelamar = new ArrayList<>();
    Scanner scan = new Scanner(System.in);

    public void addPerusahaan(Perusahaan perusahaan) {
        daftarPerusahaan.add(perusahaan);
    }

    public void removePerusahaan(int id) {
        daftarPerusahaan.remove(id);
    }

    public int searchPerusahaan(String nama) {
        int index = -1;
        for (int i = 0; i < daftarPerusahaan.size(); i++) {
            if (daftarPerusahaan.get(i).getNama().equals(nama)) {
                index = i;
            }
        }
        return index;
    }

    public Perusahaan getPerusahaan(int id) {
        return daftarPerusahaan.get(id);
    }

    public void addPelamar(Pelamar pelamar) {
        daftarPelamar.add(pelamar);
    }

    public void removePelamar(int id) {
        daftarPelamar.remove(id);
    }

    public int searchPelamar(Pelamar pelamar) {
        return daftarPelamar.indexOf(pelamar);
    }

    public Pelamar getPelamar(int id) {
        return daftarPelamar.get(id);
    }

    public void displayPerusahaan() {
        if (!daftarPerusahaan.isEmpty()) {
            for (int i = 0; i < daftarPerusahaan.size(); i++) {
                System.out.println((i + 1) + ". " + daftarPerusahaan.get(i).getNama());
            }
        } else {
            System.out.println("Daftar Perusahaan Kosong");
        }

    }

    public void menuDaftarPerusahaan() {

        int pilihan = 1;
        while (pilihan != 0) {
            displayPerusahaan();

            System.out.println("");
            System.out.println("99. Tambah Perusahaan");
            System.out.println("0. Back");
            System.out.print("Pilihan : ");
            pilihan = scan.nextInt();
            System.out.println("");
            if (pilihan == 0) {

            } else if (pilihan - 1 < daftarPerusahaan.size()) {
                menuPerusahaan(pilihan - 1);
            } else if (pilihan == 99) {
                displayPerusahaan();
                System.out.println("");
                System.out.print("Masukkan nama perusahaan : ");
                Scanner scan = new Scanner(System.in);
                String nama = scan.nextLine();
                System.out.println("");
                Perusahaan perusahaan = new Perusahaan(nama);
                addPerusahaan(perusahaan);
            }

        }
    }

    public void menuPerusahaan(int id) {
        int pil = 1;
        while (pil != 0) {
            System.out.println(daftarPerusahaan.get(id).getNama());
            System.out.println("");
            displayLowongan(id);
            System.out.println("");
            System.out.println("99. Tambah Lowongan");
            System.out.println("0. Back");
            System.out.print("Pilihan: ");
            pil = scan.nextInt();
            if (pil == 0) {

            } else if (pil - 1 < daftarPerusahaan.get(id).daftarLowongan.size()) {
                menuLowongan(id, pil - 1);
            } else if (pil == 99) {
                System.out.print("Masukkan nama lowongan: ");
                scan = new Scanner(System.in);
                String nama = scan.nextLine();
                daftarPerusahaan.get(id).createLowongan(nama);
            }
        }
    }

    public void menuLowongan(int idPerusahaan, int idLowongan) {
        int pil = 1;
        while (pil != 0) {
            System.out.println(daftarPerusahaan.get(idPerusahaan).getNama());
            System.out.println("");
            System.out.println("Lowongan: " + daftarPerusahaan.get(idPerusahaan).daftarLowongan.get(idLowongan).getNama());
            System.out.println("");
            System.out.println("1. List Berkas Masuk");
            System.out.println("2. List Berkas Diterima");
            System.out.println("3. Terima Berkas");
            System.out.println("0. Back");
            System.out.print("Pilihan: ");
            pil = scan.nextInt();
            switch (pil) {
                case 1:
                    daftarPerusahaan.get(idPerusahaan).getLowongan(idLowongan).displayBerkasMasuk();
                    scan = new Scanner(System.in);
                    scan.nextLine();
                    break;
                case 2:
                    daftarPerusahaan.get(idPerusahaan).getLowongan(idLowongan).displayBerkasDiterima();
                    scan = new Scanner(System.in);
                    scan.nextLine();
                    break;
                case 3:
                    daftarPerusahaan.get(idPerusahaan).getLowongan(idLowongan).displayBerkasMasuk();
                    scan = new Scanner(System.in);
                    System.out.print("Masukkan berkas yang ingin diterima: ");
                    int nomor = scan.nextInt();
                    daftarPerusahaan.get(idPerusahaan).getLowongan(idLowongan).masukToDiterima(nomor-1);
                    break;
            }
        }
    }

    public void displayLowongan(int id) {
        if (!daftarPerusahaan.get(id).daftarLowongan.isEmpty()) {
            for (int i = 0; i < daftarPerusahaan.get(id).daftarLowongan.size(); i++) {
                System.out.println((i + 1) + ". " + daftarPerusahaan.get(id).daftarLowongan.get(i).getNama());
            }
        } else {
            System.out.println("Daftar Lowongan Kosong");
        }
    }

    public void displayBerkasMasuk(int idPerusahaan, int idLowongan) {
        System.out.println(daftarPerusahaan.get(idPerusahaan).getNama());
        System.out.println("");
        daftarPerusahaan.get(idPerusahaan).daftarLowongan.get(idLowongan).displayBerkasMasuk();
    }

    public void daftarLowongan() {
        for (int i = 0; i < daftarPerusahaan.size(); i++) {
            System.out.println(i + 1 + ". " + daftarPerusahaan.get(i).getNama());
            for (int j = 0; j < daftarPerusahaan.get(i).daftarLowongan.size(); j++) {
                System.out.println("\t- " + daftarPerusahaan.get(i).daftarLowongan.get(j).getNama());
            }

        }
    }

    public void menuPelamar() {
        System.out.println("1. List Lowongan");
        System.out.println("2. Daftar");
        System.out.print("Pilihan : ");
        int pil = scan.nextInt();
        switch (pil) {
            case 1:
                daftarLowongan();
                scan = new Scanner(System.in);
                scan.nextLine();
                break;
            case 2:
                daftarLowongan();

                System.out.println("");

                System.out.print("Masukkan Nama Perusahaan : ");
                scan = new Scanner(System.in);
                String namaPerusahaan = scan.nextLine();
                int idPerusahaan = searchPerusahaan(namaPerusahaan);

                System.out.print("Masukkan Nama Lowongan : ");
                String namaLowongan = scan.nextLine();
                int idLowongan = daftarPerusahaan.get(idPerusahaan).searchLowongan(namaLowongan);

                System.out.print("Masukkan Nama Pelamar : ");
                String namaPelamar = scan.nextLine();

                Pelamar pelamar = new Pelamar(namaPelamar, 21, 'P');
                pelamar.createBerkas(namaLowongan);

                daftarPerusahaan.get(idPerusahaan).getLowongan(idLowongan).addBerkas(pelamar.getBerkas());
        }
    }

    public void mainMenu() {
        int pilihan = 1;
        while (pilihan != 0) {
            System.out.println("1. Perusahaan");
            System.out.println("2. Pelamar");
            System.out.println("0. Exit");
            System.out.print("Pilihan : ");
            pilihan = scan.nextInt();
            System.out.println("");
            switch (pilihan) {
                case 1:
                    menuDaftarPerusahaan();
                    break;
                case 2:
                    menuPelamar();
                    break;
            }

        }
    }
}

