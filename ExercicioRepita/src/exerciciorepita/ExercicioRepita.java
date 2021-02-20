/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exerciciorepita;

import javax.swing.JOptionPane; 
/**
 *
 * @author mayco
 */
public class ExercicioRepita {

    /**
     * @param args the command line arguments
     */
    @SuppressWarnings("empty-statement")
    public static void main(String[] args) {
        // TODO code application logic here
       // JOptionPane.showMessageDialog(null, "Olá Mundo", "Boas Vindas", JOptionPane.WARNING_MESSAGE);
        //JOptionPane.showMessageDialog(null, "Você Digitou o valor " + n);
       int n, qtd = 0; 
       int soma = 0;
       int par = 0;
       int imp = 0;
       int acima100 = 0;
       
       
       do {       
       n = Integer.parseInt(JOptionPane.showInputDialog(null, "<html>Informe um número: <br><em>(Valor 0 interrompe)</em></html>"));
       soma = soma + n;
       qtd++;
       
       if(n % 2 == 0){
           par++;
       } else {
           imp++;
       }
       if (n > 100){
           acima100++;
       }
       
    } while (n != 0);
    
    qtd--; // corrigir a contagem do valor 0 digitado
    int media = soma / qtd;
                    
              JOptionPane.showMessageDialog(null, "<html>Resultado:<hr> "
              + "<br>Total de valores: "+qtd+ 
              "<br>Total de Pares: "+par+
              "<br>Total de Ímpares: "+imp+
              "<br>Acima de 100: "+acima100+
              "<br>Média dos valores: "+media+"</html>");
    
    }
}