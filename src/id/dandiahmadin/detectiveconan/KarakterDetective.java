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
 * Deskripsi Program : Program ini berisi class KarakterDetective yang merupakan subclass dari class DetectiveConan
 * yang merupakan superclass
 */
public class KarakterDetective extends DetectiveConan{
    private String kepribadian, role;
    
    public KarakterDetective(String nama, String jenisKelamin, int umur, String kepribadian, String role) {
        super(nama, jenisKelamin, umur);
        this.kepribadian = kepribadian;
        this.role = role;
    }

    public String getKepribadian() {
        return kepribadian;
    }

    public String getRole() {
        return role;
    }
    
    @Override
    public void siapaSaya() {
        System.out.println("Saya Karakter Detective");
        super.siapaSaya();
        System.out.println("Kepribadian : ".concat(kepribadian));
        System.out.println("Role : ".concat(role).concat("\n"));
    }
    
}
