/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package operadoresaritmeticos;

/**
 *
 * @author mayco
 */
public class OperadoresAritmeticos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*int n1 = 3;
        int n2 = 5;
        float m = (n1+n2)/2;
        
        System.out.println("A média é igual a "+ m);*/
        
       /* int n = 5;
        n++;
        System.out.println(n);*/
       
      /* int x = 5;
       x %= 2;
        System.out.println(x);*/
      
      //ARREDONDAMENTO
      /*float valor = 8.9f;
      int arr = (int) Math.floor(valor);
      int arr2 = (int) Math.ceil(valor);
      int arr3 = (int) Math.round(valor);
      int arr4 = (int) Math.abs(valor);
        System.out.println("floor = "+ arr);
        System.out.println("ceil = "+ arr2);
        System.out.println("round = "+ arr3);
        System.out.println("abs = "+ arr4);*/
        
    // GERADOR DE NÚMERO
    
    double ale = Math.random();
    int n = (int)(15 + ale * (50-15));
        System.out.println("DE 15 até 50 = "+ n);
    
    }
    
}
