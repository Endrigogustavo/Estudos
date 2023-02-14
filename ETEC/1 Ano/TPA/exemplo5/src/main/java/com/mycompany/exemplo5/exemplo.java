/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.exemplo5;
import javax.swing.JOptionPane;
/**
 *
 * @author FATEC ZONA LESTE
 */
public class exemplo {
    public static void main(String[] args) {
        int a =0, b = 0, c = 0, d = 0, r = 0;
        a = Integer.parseInt(JOptionPane.showInputDialog("digite o 1 numero"));
        b = Integer.parseInt(JOptionPane.showInputDialog("digite o 2 numero"));
        c = Integer.parseInt(JOptionPane.showInputDialog("digite o 3 numero"));
        d = Integer.parseInt(JOptionPane.showInputDialog("digite o 4 numero"));
        r = (a * b) + (a * c) + (a * d);
        JOptionPane.showMessageDialog(null, "o resultado é "+ r);
    }
    
}
