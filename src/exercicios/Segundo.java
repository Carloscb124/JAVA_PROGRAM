/*Escreva um código que receba a base e a alturade um retângulo, calcule sua área e exiba na tela

fórmula: área=base X altura */

package exercicios;

import java.util.Scanner;

public class Segundo {
    
    public static void main(String[] args){

        System.out.println("Fale o base do retangulo: ");
        Scanner scanner = new Scanner(System.in);
        var base = scanner.nextFloat();

        System.out.println("Fale a altura do retangulo: ");
        var altura = scanner.nextFloat();

        var area = (base * altura);

        System.out.println("A área do retangulo é: " + area);

    }
}
