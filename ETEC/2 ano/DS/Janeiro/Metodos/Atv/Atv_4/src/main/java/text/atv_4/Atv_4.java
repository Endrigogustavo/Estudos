/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package text.atv_4;

import javax.swing.JOptionPane;

public class Atv_4 {

    public static void main(String[] args) {
        float num1 = 0, num2 = 0;
        int es;
        
        es = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite 1 para soma;\n 2 para subtração;\n 3 para divisão;\n 4 para multiplicação;\n 5 para resto de divisão;\n 6 para o dobro;\n 7 para o quadrado;\n 8 para cubo;\n 9 para raiz quadrada\n 0 para sair"));
        
        if(es == 1)
        {
            soma(num1, num2);
        }
     
        if(es == 2)
        {
        subtracao(num1,num2);
        }
    
        if(es == 3)
        {
        divisao(num1,num2);
        }
        
        if(es == 4)
        {
        mult(num1,num2);
        }
        
        if(es == 5)
        {
        res(num1,num2);
        }
         
        if(es == 6)
        {
        dobro(num1);
        }
          
        if(es == 7)
        {
        quadra(num1);
        }
        
        if(es == 8)
        {
        cubo(num1);
        }
        
        if(es == 9)
        {
        raiz(num1);
        }
        
        if(es == 0)
        {
        sair();
        }
      
        else
        {
        JOptionPane.showMessageDialog(null, "Erro, numero invalido");
        }
        
        
        
    }
    
    static void soma(float n1, float n2)
    {
    float res = 0;
    n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro numero: "));
    n2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo numero: ")); 
    res = n1+n2;
    JOptionPane.showMessageDialog(null, "A soma dos numeros "+n1+" e "+n2+" é: "+res);
    }
    
    static void subtracao(float n1, float n2)
    {
    float res = 0;
    n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro numero: "));
    n2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo numero: ")); 
    res = n1-n2;
    JOptionPane.showMessageDialog(null, "A subtração dos numeros "+n1+" e "+n2+" é: "+res);
    }
    
    static void divisao(float n1, float n2)
    {
    float res = 0;
    n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro numero: "));
    n2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo numero: ")); 
    res = n1/n2;
    JOptionPane.showMessageDialog(null, "A divisão dos numeros "+n1+" e "+n2+" é: "+res);
    }
    
    
    static void mult(float n1, float n2)
    {
    float res = 0;
    n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro numero: "));
    n2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo numero: ")); 
    res = n1*n2;
    JOptionPane.showMessageDialog(null, "A divisão dos numeros "+n1+" e "+n2+" é: "+res);
    }
    
    static void res(float n1, float n2)
    {
    float res = 0;
    n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro numero: "));
    n2 = Float.parseFloat(JOptionPane.showInputDialog("Digite o segundo numero: ")); 
    res = n1%n2;
    JOptionPane.showMessageDialog(null, "A divisão dos numeros "+n1+" e "+n2+" é: "+res);
    }
    
    static void dobro(float n1)
    {
    float res = 0;
    n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro numero: "));
    
    res = n1*2;
    JOptionPane.showMessageDialog(null, "O dobro de "+n1+" é: "+res);
    }
    
    static void quadra(float n1)
    {
    float res = 0;
    n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro numero: "));
    
    res = n1*n1;
    JOptionPane.showMessageDialog(null, "O quadrado de "+n1+" é: "+res);
    }
    
    static void cubo(float n1)
    {
    float res = 0;
    n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro numero: "));
    
    res = n1*n1*n1;
    JOptionPane.showMessageDialog(null, "O cubo de "+n1+" é: "+res);
    }
    
    static void raiz(float n1)
    {
    float res = 0;
    n1 = Float.parseFloat(JOptionPane.showInputDialog("Digite o primeiro numero: "));
    
    res = (float) Math.sqrt(n1);
    JOptionPane.showMessageDialog(null, "O cubo de "+n1+" é: "+res);
    }
    
    static void sair()
    {
   
    JOptionPane.showMessageDialog(null,"========================\n------------------------------------------\n ________________________\n Agradeçemos pela preferencia\n                   até a proxima\n :)");
    }
    

}       
            

