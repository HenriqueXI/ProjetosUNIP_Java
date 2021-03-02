package Aula_5;

import java.util.*;


public class Ex_09 {
	public static void main (String [] args) {
		
		Scanner sc = new Scanner(System.in);
		String[] candidatos = new String[5];
		int[] contador = new int[5];
		int voto;
		for (int i = 0; i < 10; i++) {
			System.out.print("Candidato " + (i + 1 ) + ":");
			candidatos[i] = sc.next();
			contador[i] = 0;
		}
		
		for (int i = 0; i < 10; i++) {
			System.out.println("Digite seu voto");
			voto = sc.nextInt(); 
			if (voto >= 1 && voto <= 5) {
				System.out.println("Candidatos: " + candidatos[i] + "obete: " + contador[i] + "votos");
			}
		}
		
		sc.close();
	}

}
