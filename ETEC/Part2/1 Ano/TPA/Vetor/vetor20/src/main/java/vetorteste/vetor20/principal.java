/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package vetorteste.vetor20;

/**
 *
 * @author dti
 */
public class principal {
    public static int vetorNumeros[] = {5 , 9 , 0 , 1 , 2 , 7 , 8 , 3 , 6 , 4};
    
    public static vetor vet = new vetor();
    
    
    public static void main(String[] args)
    {
        System.out.println("Vetores...");
        vet.exibirVetor(vetorNumeros);
        vet.ordenarVetor(vetorNumeros);
        
        
    }
    
}