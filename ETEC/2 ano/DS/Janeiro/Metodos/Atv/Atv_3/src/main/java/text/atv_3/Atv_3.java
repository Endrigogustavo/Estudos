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
        
         nome=JOptionPane.showInputDialog("Digite seu nome");
        sexo=JOptionPane.showInputDialog("Digite h para Homen e m para mulher");
        altura=Float.parseFloat(JOptionPane.showInputDialog("Digite sua altura"));
        
        
        String text = calcularpessoideal(sexo, nome, altura,ideal);
        
        JOptionPane.showMessageDialog(null, text);
      
         
    }
    
    static String calcularpessoideal(String s, String n, float al, float id)
    {
        String homen = "h";
        if( !s.equals(homen) )
        {
            id=(float) ((62.1*al)-44.7);
            return "peso ideal é "+id;
        }
        else
        {
            id=(float) ((72.7*al)-58);
            return"peso ideal é "+id;
        }
       
        
    }
}
