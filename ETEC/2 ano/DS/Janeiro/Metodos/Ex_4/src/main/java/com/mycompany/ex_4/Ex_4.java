/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ex_4;

import javax.swing.JOptionPane;

public class Ex_4 {
    public static void main(String[] args) {
         int num;
     num = Integer.parseInt(JOptionPane.showInputDialog("Entre com o primeiro numero"));
     
     if (RestoPorDois(num) == 0)
     JOptionPane.showMessageDialog(null, "O numero é par. \n");
     else
     JOptionPane.showMessageDialog(null, "O numero é impar. \n");
    }
    
     static int RestoPorDois(int a) 
     {
     return a % 2;
     
     }
}

