import java.util.*;


public class Ex_02 {
	public static void main(String[] args) {
		int numero, contador, palpite;
		Scanner ler = new Scanner(System.in);
		Random rand = new Random();
		numero = rand.nextInt(100);
		contador = 0;
		palpite = -1;
		
		while (palpite != numero ) {
			System.out.print("Digite um palpite: ");
			palpite = ler.nextInt();
			contador ++;
			if (palpite > numero ) {
				System.out.println("Digite um numero MENOR! ");
			} else { 
				if (palpite < numero ) {
					System.out.println("Digite um numero MAIOR! ");
				} else {
					System.out.println("PARABENS!! ");
					System.out.println("Você acertou com:  " + contador + " Tentativas "); 
				}
			} 
			
		}
	}

}
