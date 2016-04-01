/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Ricky
 */
public class Perusahaan extends Orang {
    ArrayList<Lowongan> daftarLowongan = new ArrayList<>();
    
    public Perusahaan(String nama) {
        super(nama);
    }
    
    public void createLowongan(String nama, Date deadline){
        Lowongan lowongan = new Lowongan(nama, deadline);
        daftarLowongan.add(lowongan);
    }
    
    public void createLowongan(String nama){
        Lowongan lowongan = new Lowongan(nama);
        daftarLowongan.add(lowongan);
    }
    
    public Lowongan getLowongan(int id){
        return daftarLowongan.get(id);
    }
    
    public void removeLowongan(int id){
        daftarLowongan.remove(id);
    }
    
    public int searchLowongan(String nama){
        int index = -1;
        for (int i = 0; i < daftarLowongan.size(); i++) {
            if (daftarLowongan.get(i).getNama().equals(nama)){
                index = i;
            }
        }
        return index;
    }
}
