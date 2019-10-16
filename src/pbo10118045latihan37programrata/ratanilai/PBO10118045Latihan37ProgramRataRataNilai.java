/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pbo10118045latihan37programrata.ratanilai;

import java.util.Scanner;

/**
 *
 * @author 
 * Nama     :   Muhammad Ilham Apriyadi
 * Kelas    :   IF 2
 * NIM      :   10118045
 * Deskripsi Program : program rat-rata nilai
 */
public class PBO10118045Latihan37ProgramRataRataNilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Nilai nilai = new Nilai();
        System.out.print("Masukkan Banyaknya Mahasiswa : ");
        Scanner scanner = new Scanner(System.in);
        nilai.setJmlMhs(scanner.nextInt());
        for (int i = 1;i<=nilai.getJmlMhs();i++) {
            System.out.print("Nilai Mahasiswa ke-" + i + " : ");
            nilai.setNilai(scanner.nextInt(), i);
        }
        System.out.println("Maka, Rata rata nilainya adalah " + nilai.getRataRata());
        System.out.println("Developed by : Muhammad Ilham Apriyadi");
    }
    
}
