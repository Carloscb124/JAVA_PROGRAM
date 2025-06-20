import java.util.Scanner;

public class App{
	public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)) {
           
            System.out.print("Fale seu nome: ");
            String nome = scanner.next();
           
            System.out.println("Qual é a sua idade? "+ nome);
            int age = scanner.nextInt();
           
            System.out.println("Olá "+ nome + "! Seja bem vindo ao java!!, sua idade é " + age + " anos.");
        }
    }
}
