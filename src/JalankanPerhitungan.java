package src;

import src.model.Perhitungan;

public class JalankanPerhitungan {
    public static void main(String[] args) {
        Perhitungan s = new Perhitungan(4, 6, 0);

        int HasilTambah = s.hasiltmbh(4, 6);
        System.out.println(HasilTambah);
        
        int HasilKalian = s.hasilkali(4, 6);
        System.out.println(HasilKalian);
    }
    
}
