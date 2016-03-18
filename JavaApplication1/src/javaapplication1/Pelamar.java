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
    Lowongan lowongan;
	BerkasLamaran berkas=null;
	int index=0;
	int jmlBerkas;
	String pekerjaan;
	Perusahaan perusahaan;
	
	public void createBerkas(String nama, int umur, char jenisKelamin, String pekerjaan){
		super.nama=nama;
		super.umur=umur;
		super.jenisKelamin=jenisKelamin;
		this.pekerjaan=pekerjaan;
		berkas = new BerkasLamaran(nama,umur,jenisKelamin,pekerjaan);
	}
	
	public void daftarLamaran(){
		if (berkas != null){
			if(lowongan.index < lowongan.jmlBerkas){
				lowongan.bekasMasuk[lowongan.index] = berkas;
				lowongan.index++;
			}
		}
		else{
			System.out.println("Berkas belum dibuat!");
		}
	}
}
