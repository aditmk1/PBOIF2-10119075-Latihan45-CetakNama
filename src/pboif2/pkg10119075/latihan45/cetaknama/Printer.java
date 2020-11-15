/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pboif2.pkg10119075.latihan45.cetaknama;

/**
Nama : Aditiya musthafa kamil
Kelas : PBOIF2
NIM : 10119075
Deskripsi Program : Program ini berisi program untuk menampilkan cetak nama
 */

public class Printer {
       private int jmlCetak;
       private String nama;

    public int getJmlCetak() {
        return jmlCetak;
    }

    public void setJmlCetak(int jmlCetak) {
        this.jmlCetak = jmlCetak;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }
       
    public void cetak(String nama){
        System.out.println("Nama anda : " + nama);
    }
    
    public void cetak(int jmlCetak,String nama){
        System.out.println("Hasil Cetak : ");
        for (int i = 0; i < jmlCetak; i++){
            System.out.println((i+1) + " . " + nama);
        }
    }
    
}