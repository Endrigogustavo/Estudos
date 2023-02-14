/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package br.edu.etec.com.terminal;

import java.util.Scanner;
 
/**
 *
 * @author dti
 */
public class Principal {
    public static Scanner teclado = new Scanner(System.in);
    
    public static String nome;
    
    public static int idade;
   
    public static float altura;
    
    public static boolean paulis;
    
    public static void main(String[] args)
    {
            
        System.out.println("seja bem vindo a aplicaçao de cadastro");
        
        System.out.println("Para começar...");  
        
        System.out.println("Digite o seu nome: ");
        
        nome = teclado.nextLine();
        
        System.out.println("Digite a sua idade");
        
        idade = teclado.nextInt();
        
        System.out.println("Digite a sua Altura");
        
        altura = teclado.nextFloat();
        
        System.out.println("Você é paulistano?");
        
        paulis = teclado.nextBoolean();
        
        System.out.println("Seu nome é: " +nome);
        
        System.out.println("Sua idade é: " +idade);

        System.out.println("Sua altura é: " +altura);   
        
        System.out.println("Paulista: " +paulis);
        
        System.out.println("Dados cadastrados com sucesso ");
    }
    
}
