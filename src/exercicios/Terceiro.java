/*Escreva um código que receba o nome e a idade de 2 pessoas e imprima a diferença de idade entre elas */

package exercicios;

import java.util.Scanner;

public class Terceiro {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Fale o nome da primeira pessoa e a idade: ");
        String name1 = scanner.next();
        int age1 = scanner.nextInt();

        System.out.print("Fale o nome da segunda pessoa e a idade: ");
        String name2 = scanner.next();
        int age2 = scanner.nextInt();
        
        // Calcula a diferença de idade 

        int ageDifference = Math.abs(age1 - age2); // Diferença absoluta (sempre positiva)

        System.out.println("A diferença de idade entre " + name1 + " e " + name2 + " é: " + ageDifference + " anos.");
    }
}