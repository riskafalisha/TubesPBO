/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

public class Lowongan {
    
    private BerkasLamaran[] berkasLamaranMasuk = new BerkasLamaran[1000];
    private BerkasLamaran[] berkasLamaranDiterima = new BerkasLamaran[1000];
    String a="test";
    private int counterBerkasMasuk=0;
    private int counterBerkasDiterima=0;
    
    public void addBerkas(BerkasLamaran bks){
        berkasLamaranMasuk[counterBerkasMasuk]=bks;
        counterBerkasMasuk++;
    }
    
    public void terimaBerkas(BerkasLamaran bks){
        berkasLamaranDiterima[counterBerkasDiterima]=bks;
        counterBerkasDiterima++;
    }
    
    public Lowongan(){
        
    }
    
    
    public Lowongan getIdLowongan(){
        return Lowongan.this;
    }
   
    
}
