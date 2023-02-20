/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.atv_1;

import javax.swing.JOptionPane;

public class Atv_1 {
    
    
     public static float n2, n1 , m;
     public static String nome;
     
     
     public static void main(String[] args) {
         nome=JOptionPane.showInputDialog(null,"Digite o seu nome: ");
         float num =LerNota(n1,n2);
         m = calcularMedia(num);
         if(m<7)
             JOptionPane.showMessageDialog(null,"Reprovado de ano");
         else
         JOptionPane.showMessageDialog(null,"passou de ano");
        
}
     
     static float LerNota(float num1,float num2)
     {
     
     num1= Float.parseFloat(JOptionPane.showInputDialog(null,"Digite a primeira nota: "));
     num2= Float.parseFloat(JOptionPane.showInputDialog(null,"Digite a segunda nota: "));
     
     return num1 + num2;
     
     }
     
     static float calcularMedia(float num)
     {
         m =num/2;
         return m;
     }
    
}
