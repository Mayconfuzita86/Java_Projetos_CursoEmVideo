/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vetor02;

import java.util.Calendar;

/**
 *
 * @author mayco
 */
public class Vetor02 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        String mes[] = {"jan", "fev", "mar", "abr", "mai", "jun", "jul", 
            "ago", "set", "out", "nov", "dez"};
        int tot[] = {31,28,31,30,31,30,31,31,30,31,30,31};
                
        for(int c=0; c<mes.length; c++){
            System.out.println("O mês de " + mes[c] + " tem " + tot[c]+ " dias!");
        }
        Calendar cal = Calendar.getInstance();
        int ano = cal.get(Calendar.YEAR);
        if(ano % 400 == 0){
            System.out.println("Estamos em "+ ano + " é um ano bissexto!");       
        } else {
            System.out.println("O Ano "+ ano + " que estamos não é bissexto.");
        }
    
}
}
