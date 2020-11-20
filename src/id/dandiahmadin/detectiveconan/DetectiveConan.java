/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package id.dandiahmadin.detectiveconan;

/**
 *
 * @author
 * NAMA     : Dandi Ahmadin
 * KELAS    : IF-1
 * NIM      : 10119033
 * Deskripsi Program : Program ini berisi class DetectiveConan yang merupakan superclass
 */
public class DetectiveConan {
    protected String nama, jenisKelamin;
    protected int umur;

    public DetectiveConan(String nama, String jenisKelamin, int umur) {
        this.nama = nama;
        this.jenisKelamin = jenisKelamin;
        this.umur = umur;
    }

    public String getNama() {
        return nama;
    }

    public String getJenisKelamin() {
        return jenisKelamin;
    }

    public int getUmur() {
        return umur;
    }
    
    public void siapaSaya() {
        System.out.println("Nama : ".concat(nama));
        System.out.println("Jenis Kelamin : ".concat(jenisKelamin));
        System.out.println("Umur : " + umur);
    }
    
}
