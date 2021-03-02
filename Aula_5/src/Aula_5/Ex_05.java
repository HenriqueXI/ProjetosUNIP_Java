package Aula_5;

import java.util.Scanner;


public class Ex_05 {
	
	public static void main(String a[]) {
		
		Scanner sc = new Scanner (System.in);
		String str;
		
		System.out.println("Digite seu nome completo: ");
		
		str = sc.nextLine();
		
		System.out.println("String: " + str);
		System.out.println("tamanho: " + str.length());
		System.out.println("ToUpperCase" + str.toUpperCase());
		System.out.println("charAt(0" + str.charAt(0));
		System.out.println("charAt(0" + str.charAt(1));
		System.out.println("charAt(0" + str.charAt(5));
		System.out.println("charAt(0" + str.charAt(6));
		System.out.println("substring: " + str.substring(0, 3));
		System.out.println("substring: " + str.substring(6, 8));
		System.out.println("indexOF (\"A\"): " + str.indexOf("A"));
		
		sc.close();
	}

}
