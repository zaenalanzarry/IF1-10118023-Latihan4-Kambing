/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package latihan4;

/**
 * @author Zaenal PC
 * NAMA              : Zaenal Anzarry
 * KELAS             : IF-01
 * NIM               : 10118023
 * Deskripsi Program : KAMBING
 */

public class Latihan4 {

    public void tambahKambing(){
        //Deklarasi variabel lokal
        int jumlahKambing = 0;
        
        jumlahKambing = jumlahKambing + 5;
        System.out.println("Jumlah Kambing setelah ditambah: " + jumlahKambing);
    }
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        Latihan4 kambingJantan = new Latihan4();
        kambingJantan.tambahKambing();
    }
    
}
