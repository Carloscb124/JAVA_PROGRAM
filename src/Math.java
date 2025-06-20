import java.util.Scanner;
public class Math {
    public static void main(String[] args){
        System.out.println("Calcula a média de 3 números");
        System.out.print("Digite o primeiro número: ");
        Scanner scanner = new Scanner(System.in);
        
        var num1 = scanner.nextFloat();
        System.out.print("Digite o segundo número: ");
      
        var num2 = scanner.nextFloat();
        System.out.print("Digite o terceiro número: ");
       
        var num3 = scanner.nextFloat();
        var media = (num1 +num2 + num3) / 3;
        System.out.println("A média é: " + media);

        if (media >= 7) {
            System.out.println("Aprovado");
        } else if (media >= 5){
            System.out.println("Recuperação");
        } else {
            System.out.println("Reprovado");
        }
    }

}
