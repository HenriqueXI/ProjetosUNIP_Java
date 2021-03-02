package Aula_5;

import java.util.Scanner;
import java.util.Random;

public class Ex_04 {
	
	public void main (String a[]) {
		
		Scanner ler = new Scanner(System.in);
		String seuNome;
		System.out.print("Qual é o seu nome?" );
		seuNome = ler.nextLine();
		System.out.println("Ola, " + seuNome + "\nEu sou o Java");
		Random rnd = new Random();
		int num1, num2;
		String continua = "SIM";
		
		
		while (continua.toUpperCase().equals("SIM")) {
			
			num1 = rnd.nextInt(100);
			num2 = rnd.nextInt(100);
			
			System.out.println("Numero 1 = " + num1);
			System.out.println("Numero 2 = " + num2);
			
			System.out.println("Soma = " + soma(num1, num2));
			System.out.println("Produto = " + produto(num1, num2));
			
			if (num1 > num2)
				System.out.println("Maior = " + num1);
			else
				System.out.println("Maior = " + num2);
			
			System.out.println("Maior na função = " + maior(num1, num2));
			System.out.println("Executar novamente? (SIM/NÂO ");
			continua = ler.nextLine();
			
		}
		
		System.out.println("FIM DO PROGRAMA!! ");
		ler.close();
		
	}
	
	static int soma(int a, int b) {
		int s;
		s = a + b;
		return s;
	}
	
	static int produto(int a, int b) {
		return a + b;
	}
	
	static int maior(int a, int b) {
		return a > b ? a : b;
	}
	
	static float dobro(float n) {
		return n * 2;
	}
}
