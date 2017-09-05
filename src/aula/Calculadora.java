package aula;

import java.awt.Container;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class Calculadora extends JFrame{
	JTextField txtVisor = new JTextField();//Visor
	JButton btnMC = new JButton("MC");//Botão
	JButton btnMC1 = new JButton("MR");//Botão
	JButton btnMC2 = new JButton("MS");//Botão
	JButton btnMC3 = new JButton("M+");//Botão
	JButton btnMC4 = new JButton("M-");//Botão
	JButton btnMC5 = new JButton("<==");//Botão
	JButton btnMC6 = new JButton("CE");//Botão
	JButton btnMC7 = new JButton("C");//Botão
	JButton btnMC8 = new JButton("�");//Botão
	JButton btnMC9 = new JButton("raiz");//Botão
	JButton btnMC10 = new JButton("7");//Botão
	JButton btnMC11 = new JButton("8");//Botão
	JButton btnMC12 = new JButton("9");//Botão
	JButton btnMC13 = new JButton("/");//Botão
	JButton btnMC14 = new JButton("%");//Botão
	JButton btnMC15 = new JButton("4");//Botão
	JButton btnMC16 = new JButton("5");//Botão
	JButton btnMC17 = new JButton("6");//Botão
	JButton btnMC18 = new JButton("*");//Botão
	JButton btnMC19 = new JButton("1/x");//Botão
	JButton btnMC20 = new JButton("1");//Botão
	JButton btnMC21 = new JButton("2");//Botão
	JButton btnMC22 = new JButton("3");//Botão
	JButton btnMC23 = new JButton("-");//Botão
	JButton btnMC24 = new JButton("=");//Botão
	JButton btnMC25 = new JButton("0");//Botão
	JButton btnMC26 = new JButton(",");//Botão
	JButton btnMC27 = new JButton("+");//Botão
	
	
	public Calculadora(){
		super("Calculadora");//titulo da janela 
		
		Container paine = this.getContentPane();//Classe responsavel por fixação
		paine.add(txtVisor);
		txtVisor.setBounds(15,20,300,40);//px da esq. pra dir, espaço do objeto, largura do obj
		
		paine.add(btnMC);
		btnMC.setBounds(20,80,55,55);
		
		paine.add(btnMC1);
		btnMC1.setBounds(80,80,55,55);
		
		paine.add(btnMC2);
		btnMC2.setBounds(140,80,55,55);
		
		paine.add(btnMC3);
		btnMC3.setBounds(200,80,55,55);
		
		paine.add(btnMC4);
		btnMC4.setBounds(260,80,55,55);
		
		paine.add(btnMC5);
		btnMC5.setBounds(20,140,55,55);
		
		paine.add(btnMC6);
		btnMC6.setBounds(80,140,55,55);
		
		paine.add(btnMC7);
		btnMC7.setBounds(140,140,55,55);
		
		paine.add(btnMC8);
		btnMC8.setBounds(200,140,55,55);
		
		paine.add(btnMC9);
		btnMC9.setBounds(260,140,55,55);
		
		paine.add(btnMC10);
		btnMC10.setBounds(20,200,55,55);
		btnMC10.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				txtVisor.setText(txtVisor.getText() + "7");
			}
		});
		
		paine.add(btnMC11);
		btnMC11.setBounds(80,200,55,55);
		btnMC11.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				txtVisor.setText(txtVisor.getText() + "8");
			}
		});
		
		paine.add(btnMC12);
		btnMC12.setBounds(140,200,55,55);
		btnMC12.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				txtVisor.setText(txtVisor.getText() + "9");
			}
		});
		
		paine.add(btnMC13);
		btnMC13.setBounds(200,200,55,55);
		
		paine.add(btnMC14);
		btnMC14.setBounds(260,200,55,55);
		
		paine.add(btnMC15);
		btnMC15.setBounds(20,260,55,55);
		btnMC15.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				txtVisor.setText(txtVisor.getText() + "4");
			}
		});
		
		paine.add(btnMC16);
		btnMC16.setBounds(80,260,55,55);
		btnMC16.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				txtVisor.setText(txtVisor.getText() + "5");
			}
		});
		
		paine.add(btnMC17);
		btnMC17.setBounds(140,260,55,55);
		btnMC17.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				txtVisor.setText(txtVisor.getText() + "6");
			}
		});
		
		paine.add(btnMC18);
		btnMC18.setBounds(200,260,55,55);
		
		paine.add(btnMC19);
		btnMC19.setBounds(260,260,55,55);
		
		
		paine.add(btnMC20);
		btnMC20.setBounds(20,320,55,55);
		btnMC20.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				txtVisor.setText(txtVisor.getText() + "1");
			}
		});
		
		paine.add(btnMC21);
		btnMC21.setBounds(80,320,55,55);
		btnMC21.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				txtVisor.setText(txtVisor.getText() + "2");
			}
		});
		
		paine.add(btnMC22);
		btnMC22.setBounds(140,320,55,55);
		btnMC22.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				txtVisor.setText(txtVisor.getText() + "3");
			}
		});
		
		paine.add(btnMC23);
		btnMC23.setBounds(200,320,55,55);
		
		paine.add(btnMC24);
		btnMC24.setBounds(260,320,55,115);
		
		paine.add(btnMC25);
		btnMC25.setBounds(20,380,115,55);
		btnMC25.addActionListener(new ActionListener(){
			public void actionPerformed(ActionEvent e){
				txtVisor.setText(txtVisor.getText() + "0");
			}
		});
		
		paine.add(btnMC26);
		btnMC26.setBounds(140,380,55,55);
		
		paine.add(btnMC27);
		btnMC27.setBounds(200,380,55,55);
		

		paine.setLayout(null);//posicionamento dos objetos no Layout
		this.setVisible(true);//tornar janela visivel 
		this.setSize(350,500);//tamanho da janela
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	public static void main (String args[]){
		Calculadora calc = new Calculadora();
	}
}