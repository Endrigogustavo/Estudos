/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package etec.cadastro;

import java.util.Scanner;

/**
 *
 * @author dti
 */
public class Aluno {
    //utiliza para importar a clase scanner
    public static Scanner teclado = new Scanner(System.in);
    
    //variaveis
    public static String nome;
    public static int idade;
    public static float altura;
    public static boolean paulis;
  
    
 public static void main(String[] args)
    {
       
            
       System.out.println("seja bem vindo a parte de cadastro");
       System.out.println("Para começar..."); 
       System.out.println("----------------------------"); 
       
        
       System.out.println("Digite o seu nome: ");
       nome = teclado.nextLine();
        System.out.println("----------------------------");
        
        
        try {
             System.out.println("agora digite a sua idade");
             idade = teclado.nextInt();
             System.out.println("----------------------------");
            
        } catch (im e) {
        }
        
      
        
       System.out.println("Esta quase acabando, agora digite a sua Altura utilizando a virgula ");     
       altura = teclado.nextFloat();
       System.out.println("----------------------------");
        
       System.out.println("E por ultimo, você é paulistano? Digite true para sim e false para não ");      
       paulis = teclado.nextBoolean();
       System.out.println("----------------------------");
       System.out.println("============================");
        
       System.out.println("Seu nome é: " +nome);
       System.out.println("----------------------------");
       System.out.println("Sua idade é: " +idade);
       System.out.println("----------------------------");
       System.out.println("Sua altura é: " +altura);  
       System.out.println("----------------------------");
       System.out.println("Paulista: " +paulis);
       System.out.println("----------------------------");
       System.out.println("============================");
        
       System.out.println("Dados cadastrados com sucesso!!! ");
       System.out.println("obrigado pela preferencia");
    } 
 
    
}

         
            


