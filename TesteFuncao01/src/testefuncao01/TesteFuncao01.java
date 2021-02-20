/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testefuncao01;

/**
 *
 * @author mayco
 */
public class TesteFuncao01 {
    
    
    /**
     * @param args the command line arguments
     */
    //static void soma(int a, int b){
    static int soma(int a, int b){
        int s = a + b;
       // System.out.println("A Soma é: " + s);
       return s;
    }
    
    
    
    public static void main(String[] args) {
        // TODO code application logic here
        System.out.println("Começou o programa!");
        int sm = soma(5,2);
        System.out.println("A Soma é: " + sm);
    }
    
}
