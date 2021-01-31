
package com.mycompany.usjt_ccp1an_pla_estruturas_de_repeticao;

import javax.swing.JOptionPane;

        //while
        //for
        //do/while

public class TesteEstruturasDeRepeticao {
    public static void main(String[] args) {
        
        double nota1, nota2;
        int contador = 1;
        do {
            nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota"));
            nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota"));
            JOptionPane.showMessageDialog(null, (nota1 + nota2) / 2);
            contador = contador + 1;
        } while (contador <= 10);

        
        /*double nota1, nota2;
        
        for (int cont = 1; cont <= 10; cont ++){
            
            nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota"));
            nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota"));
            JOptionPane.showMessageDialog(null, (nota1 + nota2) / 2);          
        }*/

        
        
        /*double nota1;
        double nota2;
        int contador;
        contador = 1;
        while (contador <= 10){
            nota1 = Double.parseDouble(JOptionPane.showInputDialog("Digite a primeira nota"));
            nota2 = Double.parseDouble(JOptionPane.showInputDialog("Digite a segunda nota"));
            JOptionPane.showMessageDialog(null, (nota1 + nota2) / 2);
            //contador = contador + 1;
            //contador += 1;
            //contador ++;
            ++ contador;                                   
        }*/
                
    }
    
}
