package desafios_java;
import java.util.Scanner;
public class Sistema_de_notas {

public static void main(String[] args) {
		System.out.println("digite a primeira nota");
		Scanner n1=new Scanner(System.in);
		double resp1= n1.nextDouble();
		
		System.out.println("digite a segunda nota");
		Scanner n2=new Scanner(System.in);
		double resp2= n1.nextDouble();
		double media= (resp1+resp2)/2;
		System.out.println("sua media e " + media);
		if (media>=7)
		System.out.println("voce esta aprovado");
		
		else if (media<=4)
		System.out.println("voce esta reprovado");
		
		else 
			System.out.println(" voce esta de recuperacao");



	}

}