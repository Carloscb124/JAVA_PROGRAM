import java.util.Scanner;

public class If {
    
public static void main(String[] args) {

    var scanner = new Scanner(System.in);

    System.out.print("Fale seu nome: ");
    String name = scanner.next();

    System.out.print("Qual é a sua idade " + name + "?: ");
    int age = scanner.nextInt();

    System.out.print("Você é emancipado? (s/n): ");
    var isEmancipated = scanner.next().equals("s");
    
    // Verifica se a pessoa é emancipado ou maior de idade

    var canDrive = (age >= 18 || (age >= 16 && isEmancipated));

    if (canDrive ){
        System.out.print("Você pode dirigir " + name + "!");
    } else{
        System.out.print("Você não pode dirigir " + name + ", pois você tem " + age + " anos e não é emancipado.");
    }
   
}

}
