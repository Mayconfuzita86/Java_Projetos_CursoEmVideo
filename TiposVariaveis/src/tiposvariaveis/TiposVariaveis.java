/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tiposvariaveis;

/**
 *
 * @author mayco
 */
public class TiposVariaveis {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int idade = (int) 3; //(int) é um typecast
        float sal = (float) 1825.23;
        float sal2 = 1825.23f;
        char letra = (char) 'H'; //char só recebe uma letra
        boolean casado = (boolean)true;
        
        
        Integer idade2 = new Integer(3);
        Float sal3 = new Float(1924.32);
        Character letra2 = new Character('H');
        Boolean casado2 = new Boolean(true);
    }
    
}
