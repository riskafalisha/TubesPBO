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
public class Pelamar extends Orang{
    private int umur;
    private char jenisKelamin;
    private BerkasLamaran berkas;

    public Pelamar(String nama, int umur, char jenisKelamin) {
        super(nama);
        this.umur = umur;
        this.jenisKelamin = jenisKelamin;        
    }
    
    public void createBerkas(String pekerjaan){
        berkas = new BerkasLamaran(super.getNama(), umur, jenisKelamin, pekerjaan);
    }
    
    public BerkasLamaran getBerkas(){
        return berkas;
    }
}