package desafios_java;
import java.util.Scanner;

public class masculino_feminino {
    
  
public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite a letra m ou f: ");
        char resp1 = scanner.next().charAt(0);

        if (resp1 == 'F' || resp1 == 'f') {
            System.out.println("Feminino");
        } else if (resp1 == 'M' || resp1 == 'm') {
            System.out.println("Masculino");
        } else {
            System.out.println("Entrada inválida");
        }
        scanner.close();
    }
}