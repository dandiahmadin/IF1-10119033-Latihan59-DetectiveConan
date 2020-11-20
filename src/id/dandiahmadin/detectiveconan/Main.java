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
 * Deskripsi Program : Program ini berisi karakter serial Detective Conan dengan pendekatan 
 * object oriented dan penerapan konsep pewarisan
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        KarakterDetective conan = new KarakterDetective("Conan Edogawa", "Laki-Laki", 7, "Cerdas", "Detective Boys");
        conan.siapaSaya();
        
        KarakterDetective mitsuhiko = new KarakterDetective("Mitsuhiko Tsuburaya", "Laki-Laki", 7, "Cerdas", "Detective Boys");
        mitsuhiko.siapaSaya();
        
        KarakterDetective ai = new KarakterDetective("Ai Haibara", "Perempuan", 7, "Cerdas, Tenang", "Detective Boys");
        ai.siapaSaya();
        
        KarakterDetective ayumi = new KarakterDetective("Ayumi Yoshida", "Perempuan", 7, "Ceria", "Detective Boys");
        ayumi.siapaSaya();
        
        KarakterDetective genta = new KarakterDetective("Genta Kojima", "Laki-Laki", 7, "Kurang Ajar", "Detective Boys");
        genta.siapaSaya();
        
        KarakterPendukung kogoro = new KarakterPendukung("Kogoro Mouri", "Laki-Laki", 38, "Ayah dari Ran Mouri");
        kogoro.siapaSaya();
        
        KarakterPendukung ran = new KarakterPendukung("Ran Mouri", "Perempuan", 17, "Putri dari Kogoro Mauri");
        ran.siapaSaya();
        
        KarakterPendukung sonozo = new KarakterPendukung("Sonozo Suziki", "Perempuan", 17, "Sahabat dari Ran Mauri");
        ran.siapaSaya();
        
        KarakterPendukung eri = new KarakterPendukung("Eri Kisaki", "Perempuan", 38, "Ibu dari Ran Mauri");
        eri.siapaSaya();
        
        KarakterPendukung heiji = new KarakterPendukung("Heiji Hattori", "Laki-Laki", 17, "Rival Conan Edogawa");
        heiji.siapaSaya();
        
        KarakterPendukung kazuha = new KarakterPendukung("Kazuha Toyama", "Perempuan", 17, "Sahabat Heiji Hattori");
        kazuha.siapaSaya();
        
        KarakterPendukung agasa = new KarakterPendukung("Hiroshi Agasa", "Laki-Laki", 53, "Professor");
        agasa.siapaSaya();
        
    }
    
}
