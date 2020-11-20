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
 * Deskripsi Program : Program ini berisi class KarakterPendukung yang merupakan subclass dari class DetectiveConan
 * yang merupakan superclass
 */
public class KarakterPendukung extends DetectiveConan {
    private String status;
    public KarakterPendukung(String nama, String jenisKelamin, int umur, String status) {
        super(nama, jenisKelamin, umur);
        this.status = status;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public void siapaSaya() {
        System.out.println("Saya Karakter Pendukung.");
        super.siapaSaya();
        System.out.println("Status : ".concat(status).concat("\n"));
    }
    
}
