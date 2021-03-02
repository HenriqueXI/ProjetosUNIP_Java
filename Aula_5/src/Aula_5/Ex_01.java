package Aula_5;

import java.util.*;

public class Ex_01 {
	
	static int x, y;
	static Scanner teclado = new Scanner(System.in);
	
	public static void main (String[] args) {
		
		int z;
		
		x = LerInt("primeirro numero");
		y = LerInt("Segundo numero");
		z = LerInt("Terceiro numero");
		
		imprima("Soma: "+  somar(x, y));
		imprima("Teste = " + somar(20, 13));
		imprima("Produto: " + multiplicar(x, y));
		imprima("Dobro do primeiro: " + dobro(x)); 
		imprima("Dobro do primeiro: " + dobro(y)); 
		imprima("Dobro do primeiro: " + dobro(z)); 
	}
	
	
	public static int LerInt(String texto) {
		int num;
		System.out.print(texto);
		num = teclado.nextInt();
		return num;
	}
	
	public static int somar(int a, int b) {
		int soma;
		soma = a+b;
		return soma;
	}
	
	public static int multiplicar(int a, int b) {
		return a * b;
	}
	
	public static int dobro( int a) {
		return somar(a, a);
	}


	public static void imprima(String s) {
		System.out.print(s);
	}
	
}
