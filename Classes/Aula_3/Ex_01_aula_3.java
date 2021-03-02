import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Ex_01_aula_3 extends JFrame implements ActionListener {
	
		
	private JPanel painel;
	private JButton botaoOK;
	private JButton botaoCancel;
	
	public Ex_01_aula_3() {
		
		super("Ação do Mouse");
		
		botaoOK = new JButton ("OK");
		botaoOK.setToolTipText("Botao OK");
		
		
		botaoCancel = new JButton ("Cancelar");
		botaoCancel.setToolTipText("Botão CANCELAR");
		
		
		botaoOK.addActionListener(this);
		botaoCancel.addActionListener(this);
		
		painel = new JPanel(new GridLayout(2,1,30,10));
		painel.add(botaoOK);
		painel.add(botaoCancel);
		
		add(painel);
	}
	
	public void actionPerformed(ActionEvent e)	{
		
		if (e.getSource() == botaoOK) 
			JOptionPane.showMessageDialog(painel, "PRESSIONOU OK");
		else 
			JOptionPane.showMessageDialog(null, "Pressionou cancelar");
		
		
	}
	public static void main(String[] args) {
		Ex_01_aula_3 ex = new Ex_01_aula_3();
		ex.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		ex.setLocation(400,200);
		ex.setSize(200,150);
		ex.setVisible(true);
	
		
	}

}
