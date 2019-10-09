/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118005.latihan20.targetsaldotabungan;

/**
 *
 * @author USER
 * NAMA : Rycho Rantung
 * KELAS : IF1
 * NIM : 10118005
 * Deskripsi Program :Program berisi program yang menampilkan target saldo tabungan
 */
public class IF110118005Latihan20TargetSaldoTabungan {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        float saldoAwal = 3500000f;
        float bunga = 0.08f;
        int saldoTarget = 6000000;
        
        
        int i = 1;
           do {
            saldoAwal = saldoAwal + saldoAwal * bunga;
            System.out.println("Saldo di bulan ke-" + i++ + " Rp." + saldoAwal);
        } while(saldoAwal < saldoTarget);
    }
    
}
        
        
