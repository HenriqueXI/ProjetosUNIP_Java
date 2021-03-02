import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.*;


public class Ex_2_aula_3 extends JFrame implements ActionListener{
	
	private JButton botao1, botao2;
	private JPanel painel;
	
	public Ex_2_aula_3(){
		
		super ("Ação do Mouse");
		
		botao1 = new JButton("Play");
		botao2 = new JButton("LIMPAR");
		painel = new JPanel(); 
		
		painel.add(botao1);
		botao1.addActionListener(this);
		botao2.addActionListener(this);
		
		getContentPane().add(painel);
		setSize(200,100);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		Ex_2_aula_3 ex = new Ex_2_aula_3();
		ex.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==botao1) {
			painel.add(botao2);
			
		}else {
			painel.remove(botao2);
		}
		

		this.repaint();
		setVisible(true);
	}
	

}
