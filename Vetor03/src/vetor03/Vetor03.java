/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor03;

import java.util.Arrays;

/**
 *
 * @author mayco
 */
public class Vetor03 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        double v[] = {3.5, 2.65, 54.65, 7.5, 78.06};  //for each
        
        //Arrays.sort(v); // COLOCAR EM ORDEM!!! FAAAAACIL!
                            
        for (double valor: v){
            System.out.println(valor + "");
        }
        int pos = Arrays.binarySearch(v, 2.65); // procurar um valor dentro do vetor
        System.out.println("Encontrei na posição " +pos);
        
    }
    
}
