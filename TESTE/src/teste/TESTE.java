/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package teste;

import java.util.Scanner;

/**
 *
 * @author mayco
 */
public class TESTE {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner val = new Scanner(System.in);
       int n = val.nextInt();
       
       int nt100 = 0;
       int nt50 = 0;
       int nt20 = 0;
       int nt10 = 0;
       int nt5 = 0;
       int nt2 = 0;
       int nt1 = 0;
       int troco = 0;
       
      nt100 = (int) n / 100;
      troco = n % 100;
      
      nt50 = (int) troco / 50;
      troco %= 50;
      
      nt20 = (int) troco / 20;
      troco %= 20;
      
      nt10 = (int) troco / 10;
      troco %= 10;
      
      nt5 = (int) troco / 5;
      troco %= 5;
      
      nt2 = (int) troco / 2;
      troco %= 2;
      
      nt1 = (int) troco;
    	  
    	
    	System.out.println(nt100 + " nota(s) de R$ 100,00");
    	System.out.println(nt50 + " nota(s) de R$ 50,00");
    	System.out.println(nt20 + " nota(s) de R$ 20,00");
    	System.out.println(nt10 + " nota(s) de R$ 10,00");
    	System.out.println(nt5 + " nota(s) de R$ 5,00");
    	System.out.println(nt2 + " nota(s) de R$ 2,00");
    	System.out.println(nt1 + " nota(s) de R$ 1,00");
    }
    
}
