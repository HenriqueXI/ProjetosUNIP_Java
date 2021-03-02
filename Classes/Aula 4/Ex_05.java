import java.util.Scanner;

public class Ex_05 {
	public static void main (String[] args) {
		Scanner ler = new Scanner (System.in);
		String mes[] = {"janeiro", "Feverreiro", "Março", "Abril", "Maio", "Junho", "Julho", 
				"Agosto", " Setembro", "Outubro", "Novembro", "Dezembro"};
		
		int x;
		do {
			System.out.println("Numero do mes? " );
			x = ler.nextInt();
			if (x >= 1 && x <= 12) {
				System.out.println(mes[x - 1]);
				
			}else if(x == 0)
			System.out.println("Numero invalido!! ");{
				
			}
			
		} while (x != 0); 
		
		System.out.println("# Fim do programa # ");
		ler.close();
	}
}
