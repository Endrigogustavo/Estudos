/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package joao.xn;

import javax.swing.*;

public class XN {


    public static void main(String[] args) {
        int x, n, res;
        
        x = Integer.parseInt(JOptionPane.showInputDialog("Digite o primeiro numero"));
        n = Integer.parseInt(JOptionPane.showInputDialog("Digite o segundo numero"));
        
        res = x * n;
       
        
        JOptionPane.showMessageDialog(null,"o resultado é "+Math.pow(res, 2) );
        
        
        
        
        
        
    }
}
