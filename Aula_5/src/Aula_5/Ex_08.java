package Aula_5;

import java.util.Random;

public class Ex_08 {
	public static void main (String [] args) {
		Random r = new Random();
		int dezena[] = new int[6];
		int aux = 0;
		
		System.out.println("Gerando Dezenas...");
		for (int i = 0; i < dezena.length; i++)
			dezena[i] = r.nextInt(60) + 1;
		
		
		for (int i = 0; i < dezena.length - 1; i++)
			for(int j = i + 1; j < dezena.length; j++)
				if (dezena[i] > dezena[j]) {
					aux = dezena[i];
					dezena[i] = dezena[j];
					dezena[j] = aux;
				}
		
		System.out.println("Dezenas da Mega-Sena: ");
		for (int x : dezena)
			System.out.printf("%02d ", x);
			
	}

}
