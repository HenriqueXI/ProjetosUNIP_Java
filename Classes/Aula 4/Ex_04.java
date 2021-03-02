import javax.swing.JOptionPane;

public class Ex_04 {
	public static void main(String[] args) {
		int[] tempo = new int[10];
		int max, soma;
		float media;
		StringBuffer msg = new StringBuffer();
		for( int i = 0; i < tempo.length; i++) {
			tempo[i] = Integer.parseInt(
					JOptionPane.showInputDialog("Digite o tempo do profissão do professor: " + (i + 1)));
		}
		
		max = 0;
		soma = 0;
		for (int i = 0; i < tempo.length; i++) {
			soma += tempo[i];
			if(tempo[i] > tempo[max])
				max = i;
		}
		
		media = (float) soma / 10;
		msg.append(String.format("\nMedia: %.lf\n", media));
		msg.append("Mas antigo: Professor " + (max + 1) + " com " + tempo[max] + " anos ");
		JOptionPane.showInternalMessageDialog(null, msg.toString());
	}
		
}
