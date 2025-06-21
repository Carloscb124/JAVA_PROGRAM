import java.util.Scanner;

public class Main {
    
    public static void main(String[] args) {

        var scanner = new Scanner(System.in);

        System.out.print("fale um número de 1 até 7: ");
        var option = scanner.nextInt();

            // case 1, 7 -> System.out.print("Fim de semana"); assim funciona sem o brake

        switch (option) {
            case 1: // serve pra adicionar os dois case no mesmo
            case 7: {
                var day = option == 1 ? "Domingo" : "Sábado "; // ele verifica o número e retorna o dia
                System.out.print("Hoje é " + day + "Fim de semana uuuuuuuu \\o/ ");
                break; // Adicionando break para evitar a execução dos próximos casos
            }
            case 2: 
                System.out.print("Segunda");
                break;
            case 3:
                System.out.print("Terça");
                break;
            case 4:
                System.out.print("Quarta");
                break; 
            case 5:
                System.out.print("Quinta");
                break; 
            case 6:
                System.out.print("Sexta");
                break; 
            default:
                System.out.print("Opção inválida, por favor escolha um número de 1 a 7.");
        
        }

    }

}