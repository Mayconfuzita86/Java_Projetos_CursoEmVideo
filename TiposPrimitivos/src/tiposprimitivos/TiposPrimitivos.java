/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposprimitivos;

import java.util.Scanner;

/**
 *
 * @author mayco
 */
public class TiposPrimitivos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner teclado = new Scanner(System.in);
        System.out.print("Digite o nome do Aluno: ");
        String nome = teclado.nextLine();
        
        System.out.print("Digite a nota do Aluno: ");
        float nota = teclado.nextFloat();
        //float nota = 8.5f;
        //System.out.println("A nota é " +nota);
        System.out.printf("A nota de %s é %.1f ", nome, nota);
    }
    
}
