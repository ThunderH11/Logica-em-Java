package desafios_java;

import java.util.Scanner;

public class maior_3_numeros {

	public static void main(String[] args) {
		double resposta = 0;
		double contador = 0;
		System.out.println("Telefonou para a vitima ?");
		
		System.out.println("digite 1 para sim e 2 para nao");
		Scanner n1 = new Scanner(System.in);
		double telefone = n1.nextDouble();
		
		if (telefone == 1) 
			contador = contador + 1;
		else if (telefone == 2) 
			System.out.println("nao");
		
		
		System.out.println("esteve no local do crime ?");
		
		System.out.println("digite 1 para sim e 2 para nao");
		Scanner n2 = new Scanner(System.in);
		double local = n2.nextDouble();
		
		if (local == 1) 
			contador = contador + 1;
		else if (local == 2) 
			System.out.println("nao");
		
		
		System.out.println("Mora perto da vitima?");
		System.out.println("digite 1 para sim e 2 para nao");
		Scanner n3 = new Scanner(System.in);
		double perto = n3.nextDouble();
		if (perto == 1) 
			contador = contador + 1;
		else if (perto == 2) 
			System.out.println("nao");
		
		System.out.println("devia para a vitima ?");
		System.out.println("digite 1 para sim e 2 para nao");
		Scanner n4 = new Scanner(System.in);
		double devi = n4.nextDouble();
		if (devi == 1) 
			contador = contador + 1;
		else if (devi == 2) 
			System.out.println("nao");
		
		System.out.println("ja trabalhou com a vitima ?");
		System.out.println("digite 1 para sim e 2 para nao");

		Scanner n5 = new Scanner(System.in);
		double trabalhou  = n5.nextDouble();
		if (trabalhou == 1) 
			contador = contador + 1;
		else if (trabalhou == 2) 
			System.out.println("nao");
		
		if (contador == 5)
			System.out.println("assassino");
		else if (contador >=3)
			System.out.println("cumplice");
		else 
			System.out.println("Suspeito");
		


	}

}