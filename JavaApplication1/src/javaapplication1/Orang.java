/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

/**
 *
 * @author ricky
 */
public abstract class Orang {
    private String nama;
    private int umur;
    private String JenisKelamin;

public Orang(String nama, int umur, String JenisKelamin) {
    this.nama = nama;
    this.umur = umur;
    this.JenisKelamin = JenisKelamin;
}
public void setNama(String nama) {
    this.nama = nama;
}    
public String getNama() {
    return nama;
}
public void setUmur(int umur) {
    this.umur = umur;
}
public int getUmur() {
    return umur;
}
public void setJenisKelamin(String JenisKelamin) {
    if(JenisKelamin=="Pria"||JenisKelamin == "Wanita"){
        this.JenisKelamin = JenisKelamin;
    }
        
}
public String getJenisKelamin() {
    return JenisKelamin;
}
}