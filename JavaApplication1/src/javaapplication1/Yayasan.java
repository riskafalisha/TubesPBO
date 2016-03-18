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
public class Yayasan {
    String namaPerusahaan;
	int index=0;
	int jmlPerusahaan;
	Perusahaan[] daftarPerusahaan;
	
	public void addPerusahaan(Perusahaan daftarPerusahaan){
		if(index < jmlPerusahaan){
			this.daftarPerusahaan[index] = daftarPerusahaan;
			index++;
		}
		else{
			System.out.println("Daftar Perusahaan sudah penuh!");
		}
	}
	
	public void displayPerusahaan(){
		System.out.println("\tData Perusahaan :");
		for (int i=0; i<index; i++){
			System.out.println("\t"+ (i+1) + "\tNama Perusahaan :"+daftarPerusahaan[i].getNamaPerusahaan());
		}
	}
        
        public int searchLowongan(String namaPerusahaan){
            int id = -1;
            for (int i=0; i<index; i++){
                if(daftarPerusahaan[i].getNamaPerusahaan()==namaPerusahaan){
                    id = i;
                }
            }
            return id;
        }
}
