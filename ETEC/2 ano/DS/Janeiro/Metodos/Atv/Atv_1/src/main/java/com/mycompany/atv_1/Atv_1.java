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
         
         LerNota();
    
         nome = JOptionPane.showInputDialog("Digite o seu nome: ");
         n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite um numero: "));
         n2 = Float.parseFloat(JOptionPane.showInputDialog("Digite a segunda nota: "));
         
         m = calcularMedia(n1, n2);
         if(m<7)
             JOptionPane.showMessageDialog(null,"Reprovado de ano");
         else
         JOptionPane.showMessageDialog(null,"passou de ano");
        
}
     
     static void LerNota()
     {
     JOptionPane.showMessageDialog(null,"Digite o seu nome: ");
     JOptionPane.showMessageDialog(null,"Digite a primeira nota: ");
     JOptionPane.showMessageDialog(null,"Digite a segunda nota: ");
     }
     
     static float calcularMedia(float n3, float n4)
     {
         m =(n3 + n4)/2;
         return m;
     }
    
}
