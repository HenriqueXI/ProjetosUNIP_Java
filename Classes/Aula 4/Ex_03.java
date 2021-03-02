
import java.util.*;

public class Ex_03 {
	public static void main(String[] args) {
		
		
		Scanner input = new Scanner (System.in);
		String aluno[] = new String[10];
	
		
		float [] nota1, nota2, media;
		float soma = 0, mediageral;
		
		
		nota1 = new float[10];
		nota2 = new float[10];
		media = new float[10];
		
		
		
		for( int i = 0; i < 10; i++) {
			System.out.print("Digite um texto ");
			aluno[i] = input.next();
			System.out.print("Nota 1: ");
			nota1[i] = input.nextFloat();
			System.out.print("Nota 2: ");
			nota2[i] = input.nextFloat();
			soma += media[i];
		}
		
		mediageral = soma / 10;
		System.out.println("Lista dos alunos");
		for (int i = 0; i < 10; i++) {
			System.out.println(aluno[i] + " - nota1 " + nota1[i] +
					" nota 2= " + nota2[i] + " media = " + media[i]);
		}
		
		System.out.printf("Media Geral da turma: %.1f/n", mediageral);
		
		System.out.println(" Melhor aluno ?????");
		
		input.close();
	}
}
