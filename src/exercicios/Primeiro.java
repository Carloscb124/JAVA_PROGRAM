/*Escreva um código que receba o tamanho do lado de um quadrado, calcule sua área e exiba na tela

fórmula: área=lado X lado */


package exercicios;

import java.util.Scanner;


public class Primeiro {
    
    public static void main(String[] args){
        
        System.out.printf("Fale o tamanho do lado do quadrado: ");
        Scanner scanner = new Scanner(System.in);

        var lado = scanner.nextFloat();
        var area = lado * lado;
        
        System.out.println("A área do quadrado é: " + area);
    }

}
