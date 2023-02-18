/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package text.atv_3;

import javax.swing.JOptionPane;

public class Atv_3 {

    public static void main(String[] args) {
        String sexo = null, nome = null;
        float altura = 0, ideal = 0;
        calcularpessoideal(sexo, nome, altura,ideal);
    }
    
    static void calcularpessoideal(String s, String n, float al, float id)
    {
        n=JOptionPane.showInputDialog("Digite seu nome");
        s=JOptionPane.showInputDialog("Digite h para Homen e m para mulher");
        al=Integer.parseInt(JOptionPane.showInputDialog("Digite sua altura"));
        String homen = "h";
        
        if( !s.equals(homen) )
        {
            id=(float) ((62.1*al)-44.7);
            JOptionPane.showMessageDialog(null,"peso ideal é "+id);
        }
        else
        {
            id=(float) ((72.7*al)-58);
            JOptionPane.showMessageDialog(null,"peso ideal é "+id);
        }
       
        
    }
}
