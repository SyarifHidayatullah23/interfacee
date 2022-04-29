import model.*;


public class JalankanPerhitungan {
    

    public static void main(String[] args) {
        Perhitungan s = new Perhitungan(7,8,0);


        System.out.println("----------");
        System.out.println("Hasil pertambahan :");
        int hasiltambahnya = s.hsltmbh(40, 4);
        System.out.println(hasiltambahnya);



        System.out.println("----------");
        System.out.println("Hasil Perkalian :");
        int hasilkalinya = s.hslkli(50, 70);
        System.out.println(hasilkalinya);  
    }
}
