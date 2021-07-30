package lat3;

/**
 *
 * @author Tyas
 */
public class Lat3 {
    
    public static void main(String[] args) {
        
        int sukupertama = 10;
        int selisih = 5;
        int nilaiterakhir = 80;
        int updatenilai;
        int totalnilai = 0;
        
        System.out.println("Deret Aritmatika");
        
        for(int i = 0; i < 3; i++){
            
            for(int a =0; a <5 ; a++){
                 
                  updatenilai = sukupertama; 
                  sukupertama += selisih;
                
                System.out.print(" " + updatenilai);
                
                totalnilai += updatenilai;
            }                
                System.out.println("");
            }
        System.out.println("Hasil dari penjumlahan nilai deret aritmatika : " + totalnilai);
        
    }
    
}
