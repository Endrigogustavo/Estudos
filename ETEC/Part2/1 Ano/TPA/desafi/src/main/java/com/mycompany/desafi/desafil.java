/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.desafi;


import javax.swing.JOptionPane;
/**
 *
 * @author FATEC ZONA LESTE
 */
public class desafil {
    public static void main(String[] args) {
        int altura =0, base = 0, res = 0;
        altura = Integer.parseInt(JOptionPane.showInputDialog("digite o 1 numero"));
        base = Integer.parseInt(JOptionPane.showInputDialog("digite o 2 numero"));
       
        res = altura * base;
        JOptionPane.showMessageDialog(null, "o resultado é "+ res);
    }
    
}
