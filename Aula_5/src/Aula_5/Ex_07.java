package Aula_5;

import java.util.Scanner;

public class Ex_07 {
	public static void main (String [] args ) {
		Scanner sc = new Scanner(System.in);
		String nome1, nome2;
		System.out.println("Digite o primeiro nome: ");
		nome1 = sc.nextLine();
		System.out.println("Digite o segundo nome: ");
		nome2 = sc.nextLine();
		System.out.println("Tamanho do primeiro: " + nome1.length());
		System.out.println("Tamanho do do segundo: " + nome2.length());
		String concat1 = nome1.toUpperCase() + nome2.toUpperCase();
		String concat2 = nome1.toUpperCase() + nome2.toUpperCase();
		System.out.println("Concatena��o maiuscula" + concat1);
		System.out.println("Concatena��o minuscula" + concat2);
		sc.close();
		
	}
}