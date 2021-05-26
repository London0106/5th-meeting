/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package project16;
import java.util.Scanner;

/**
 *
 * @author London
 */
public class Project16 {
//1.case= 
//	saya toko baju dan punya 10 pegawai, terus 10 pegawai saya ingin  
    //menghitung gajinya dan bonusnya . Terus kalau 
//dia bekerja selama lebih dari 8 jam gaji pokok+500.000 . kemudian dibawah 8 jam dia tidak dapat bonus.
//	total = 10 pegawai
//Variabel=> 	
//	=>totalGajiPegawai
//	=>gajiPokokPegawai 
//	=>lamaKerjaPegawai    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    Scanner scan = new Scanner (System.in);
    int i = 0;
    String namaPengawai ;
    int totalGaji;
    int gajiPokok;
    int jamKerja;
        System.out.println("=====TOKO BAJU LONDON=====");
        while(i<10)
        {
            System.out.println("===Data Pengawai ke - "+i);
            System.out.println("Nama Pengawai");
            namaPengawai = scan.next();
            System.out.println("Gaji Pokok");
            gajiPokok = scan.nextInt();
            System.out.println("Lama Jam Kerja");
            jamKerja = scan.nextInt();
            System.out.println("===Data Pengawai Ke - "+i);
            if(jamKerja>8)
            {
                System.out.println("U WILL GET THE BONUS");
                totalGaji = gajiPokok+500000;
                
                System.out.println("Nama Pengawai = "+namaPengawai);
                System.out.println("Gaji Pokok = "+gajiPokok);
                System.out.println("Total Gaji = "+totalGaji);
                System.out.println("========================");
            
                
            }
       
        else if (jamKerja <=8){
                System.out.println("U will not get the bonus");
                totalGaji = gajiPokok+0 ;
                System.out.println("Nama Pengawai = "+namaPengawai);
                System.out.println("Gaji Pokok = "+gajiPokok);
                System.out.println("Total Gaji = "+totalGaji);
                System.out.println("========================");
       
        
        }
        i++;    
        
        
          
    
    
    }
    
}
}
