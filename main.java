Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prpl5;
import java.util.Scanner;
/**
 *
 * @author MOKLET
 */
public class PRPL5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner in=new Scanner(System.in);
       String jualbuku;
       int harga = 0;
       int uang;
       
        System.out.println("PILIHAN BARANG");
        System.out.println("");
        System.out.println("1.buku gambar");
        System.out.println("2.buku kotak");
        System.out.println("3.buku tulis");
        System.out.println("4.buku saku");
        jualbuku=in.next();
        System.out.println("~~~~~~~~~~~~");
        
        
        
        System.out.println("TOTAL HARGA BARANG YANG DIAMBIL");
        switch(jualbuku){
            case"1":
                System.out.println("2000");harga=20000;break;
            case "2":
                System.out.println("Rp.5000");harga=5000;break;
            case "3":
                System.out.println("Rp.3000");harga=3000;break;
            case "4":
                System.out.println("rp.2500");harga=2500;break;
        }
        System.out.print("Masukkan uang anda: ");
        uang = in.nextInt();
        
        if (uang>=harga){
            System.out.println("Uang kembalian anda :"+ (uang-harga));
        }else{
            System.out.println("Mohon Maaf Uang Anda Kurang");
        }
        
        
          
    }
    
}
