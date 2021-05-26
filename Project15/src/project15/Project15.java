/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project15;
import java.util.Scanner;
//System.out.println("Saya belajar while");Kamu tampilkan sebanyak yang kamu inginkan . 
//Kamu perlu inputan . 
/**
 *
 * @author London
 */
public class Project15 {


    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner scan = new Scanner (System.in);
    int i = 0;
    int jumlah;
        System.out.println("Masukan Jumlah Perulangan = ");
        jumlah = scan.nextInt();
        while(i<jumlah){
            System.out.println("Saya sedang belajar while");
            System.out.println("perulangan ke = "+i);
    i++;
    }
    
    
    
    
    }
    
}
