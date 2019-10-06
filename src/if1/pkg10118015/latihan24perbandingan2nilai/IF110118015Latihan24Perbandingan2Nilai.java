/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package if1.pkg10118015.latihan24perbandingan2nilai;

import java.util.Scanner;

/**
 *
 * @author 
 * NAMA                 : Adi Chandra Nugraha
 * KELAS                : IF-1
 * NIM                  : 10118015
 * Deskripsi Program    : Program ini berisi program membandingkan 2 buah nilai 
 */
public class IF110118015Latihan24Perbandingan2Nilai {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String status = "Ya";
        Scanner input = new Scanner(System.in);
        System.out.println("========Program Perbandingan Nilai=============");
        do {            
            System.out.print("Masukan nilai pertama : ");
            int nilai1 = input.nextInt();
            System.out.print("Masukan nilai kedua   : ");
            int nilai2 = input.nextInt();
            System.out.println("Hasil : " + nilai1 + ((nilai1 < nilai2) ? " Lebih Kecil " : ((nilai1 == nilai2) ? " Sama Dengan " : " Lebih Besar ")) + nilai2 );
            System.out.println();
            System.out.print("Ulangi Aktivitas? [Ya/Tidak] : ");
            status = input.next();
        } while(status.equals("Ya") || status.equals("ya"));

        
    }
    
}
