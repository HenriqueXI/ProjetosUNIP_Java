package Aula_5;

import java.time.LocalDate;
import java.util.Scanner;


public class Ex_02 {
	
	static String nomeEleitor;
	static int idade;
	static int anoNascimento;
	static Scanner teclado = new Scanner(System.in);
	
	
	public static void main(String[] args) {
		System.out.print("Qual � o seu nome? ");
		nomeEleitor = teclado.nextLine();
		System.out.print("Qual � a sua idade? ");
		anoNascimento = teclado.nextInt();
		idade = calcularIdade(anoNascimento);
		if (idade < 16) {
			System.out.println("Voc� N�O pode votar");
		}else {
			System.out.println("Voc� � APTO a votar.");
		}
	}
		
	static int calcularIdade (int ano) {
		return LocalDate.now().getYear() + ano;
 	}
	
	

}
