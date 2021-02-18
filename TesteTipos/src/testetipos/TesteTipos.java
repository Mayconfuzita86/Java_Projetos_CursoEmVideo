/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package testetipos;

/**
 *
 * @author mayco
 */
public class TesteTipos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        //tentar converver int para string
        //int idade = 30;
        //String valor = idade; //nao funciona
        //String valor = (String)idade; //nao funciona
        
        //MODO CORRETO ABAIXO:
        //String valor = Integer.toString(idade); // converte idade int para string, FUNCIONA!!
        //System.out.println(valor);
       
        //MODO CORRETO DE STRING PARA INT:
        //String valor = "30";
        //int idade = Integer.parseInt(valor); //Integer é uma classe envolocro
        //System.out.println(idade);
        
        //MODO CORRETO DE STRING PARA FLOAT:
        String numero = "54.4";
        float val = Float.parseFloat(numero);
        System.out.println(val);
        
       
        
    }
    
}
