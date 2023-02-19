/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package text.atv_5;

import javax.swing.JOptionPane;

public class Atv_5 {

    public static void main(String[] args) {
        float b = 0, h = 0;
        
        hipotenusa(b, h);
       
    }
    
    static void hipotenusa(float x, float y)
    {
        float hip;
        x=Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a base do triangulo: "));
        y=Float.parseFloat(JOptionPane.showInputDialog(null, "Digite a altura do triangulo: "));
        
        hip= (float) ((Math.pow(x, 2) + Math.pow(y, 2)));
        
        JOptionPane.showMessageDialog(null,"A hipotenusa é: "+Math.sqrt(hip));
        
        
    }
}
