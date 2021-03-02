package Aula_5;

import java.util.Random;
import javax.swing.JOptionPane;

public class Ex_10 {
	public static void main(String[] args) {
		
		final int QUANTIDADE_NUMEROS = 	100;
		final int VALOR_INICIAL = 1000;
		final int VALOR_FINAL = 1000;
		Random r = new Random();
		int numeros[] = new int[QUANTIDADE_NUMEROS];
		int inicio, fim, frequencia;
		
		for (int i = 0; i < QUANTIDADE_NUMEROS; i++) 
			numeros[i] = r.nextInt(VALOR_FINAL - VALOR_INICIAL + 1) + VALOR_INICIAL;
		
		System.out.println("Numeros Gerados... ");
		for (int x : numeros)
			System.out.printf("%d ", x);
		
		inicio = Integer.parseInt(JOptionPane.showInputDialog("Digite o inicio do intervalo: "));
		fim = Integer.parseInt(JOptionPane.showInputDialog("Dogote o final do intervalo: "));
		
		frequencia = 0;
		for (int x : numeros)
			if(x >= inicio && x <+ fim)
				frequencia++;
		
		JOptionPane.showMessageDialog(null,String.format("Frequencia de numeros no intervalo de %d a %d : \n" + "%03d números", inicio, fim, frequencia));
	}

}
