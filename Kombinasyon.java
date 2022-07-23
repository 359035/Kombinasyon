/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package kombinasyon;

/**
 *
 * @author Samsung
 */
import java.util.Scanner;

public class Kombinasyon {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner inp=new Scanner(System.in);
        
        System.out.print("n degerini giriniz:");
        int n=inp.nextInt();
        
        System.out.print("r degerini giriniz:");
        int r=inp.nextInt();
        int toplam=1;
        int toplam2=1;
        int toplam3=1;
        
        for(int i=1;i<=n;i++){
            toplam*=i;
        }
        
        for(int j=1;j<=r;j++){
            toplam2*=j;
        }
        
        for(int k=1;k<=(n-r);k++){
            toplam3*=k;
        }
        
        System.out.println("Kombinasyon:"+(toplam/(toplam2*toplam3)));
    }
    
}
