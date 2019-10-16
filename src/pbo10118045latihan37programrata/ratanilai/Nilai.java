/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10118045latihan37programrata.ratanilai;

/**
 *
 * @author Ilham
 */
public class Nilai {
    private final int[] nilai = new int[100];
    private int jmlMhs;
    private double rataRata;

    public void setNilai(int nilai, int i) {
        this.nilai[i] = nilai;
    }

    public void setJmlMhs(int jmlMhs) {
        this.jmlMhs = jmlMhs;
    }

    public int getJmlMhs() {
        return jmlMhs;
    }
    
    private double hitungRataRata() {
        double jumlah = 0;  
        for (int i = 1;i<=jmlMhs;i++) {
            jumlah += nilai[i];
        }
        double hasil = jumlah/jmlMhs;
        return hasil;
    }

    public double getRataRata() {
        setRataRata();
        return rataRata;
    }

    public void setRataRata() {
        this.rataRata = hitungRataRata();
    }
}
