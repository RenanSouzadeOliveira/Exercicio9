package exercicio9;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;



public class Interface extends JFrame{
	JLabel lblRaio = new JLabel("Raio");
	JLabel lblTempo = new JLabel("Tempo");
	JLabel lblVelocidade = new JLabel("Velocidade");
	JTextField txtraio = new JTextField();
	JTextField txttempo = new JTextField();
	JTextField txtvelocidade = new JTextField();
	
	

	JButton btnCalculo = new JButton("Calcular");
	
		double raio, tempo;
	public Interface(){
		Calculo calc = new Calculo();
		
		
		Container paine = this.getContentPane();
		
		paine.add(lblRaio); // label
		
		lblRaio.setBounds(20,20,245,40);
		
		paine.add(txtraio);// caixa
		txtraio.setBounds(120,30,140,20);
		
		paine.add(lblTempo);// label
		lblTempo.setBounds(20,100,245,40);
		
		paine.add(txttempo);// caixa
		txttempo.setBounds(120,110,140,20);
		
		paine.add(lblVelocidade);// label
		lblVelocidade.setBounds(20,140,245,40);
		
		paine.add(txtvelocidade);// caixa
		txtvelocidade.setBounds(120,150,140,20);
	

		
		paine.add(btnCalculo);
		btnCalculo.addActionListener(new ActionListener(){
			 public void actionPerformed(ActionEvent e){
				 raio = Double.parseDouble(txtraio.getText());
				 tempo = Double.parseDouble(txttempo.getText());
				 txtvelocidade.setText("" + calc.velocidade(raio, tempo));
				 
			 }
		 });
		btnCalculo.setBounds(90,400,100,40);
		
		txtvelocidade.setEditable(false);
		this.setLayout(null);
		this.setVisible(true);
		this.setSize(350, 600);
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String args[]){
		Interface cad = new Interface();
		
	}
}
