/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package javaapplication1;

import java.sql.Date;

/**
// *
 * @author acer
 */
public class JavaApplication1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Aplikasi aplikasi = new Aplikasi();
        Perusahaan perusahaan = new Perusahaan("Honda");
        perusahaan.createLowongan("CS");
        aplikasi.addPerusahaan(perusahaan);
        
        aplikasi.mainMenu();
    }
    
}
