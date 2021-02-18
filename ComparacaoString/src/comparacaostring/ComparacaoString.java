/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package comparacaostring;

/**
 *
 * @author mayco
 */
public class ComparacaoString {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String nome1 = "Fuzita";
        String nome2 = "Maycon";
        String nome3 = new String("Maycon");
        String res;
        
        //res = (nome3 == nome2)?"Igual":"Diferente";
        res = (nome2.equals(nome3))?"Igual":"Diferente"; //verifica se o conteudo do objeto é igual
        
        System.out.println(res);
    
    }
    
}
