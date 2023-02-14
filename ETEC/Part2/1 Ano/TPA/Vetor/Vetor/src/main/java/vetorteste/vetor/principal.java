/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vetorteste.vetor;

/**
 *
 * @author dti
 */
public class principal {
    public static int vetorNumeros[] = new int[5];
    
    public static vetor vet = new vetor();
    
    
    public static void main(String[] args)
    {
        System.out.println("Vetores...");
        vet.inicializarVetor(vetorNumeros);
        vet.exibirVetor(vetorNumeros);
        
        
    }
    
}
