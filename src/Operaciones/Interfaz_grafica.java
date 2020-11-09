package Operaciones;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
public class Interfaz_grafica extends JFrame {
	private JPanel contentPane;
	private JTextField numeroUno;
	private JTextField numeroDos;
	private JTextField numeroTres;

	public Interfaz_grafica() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Numero #1");
		lblNewLabel.setFont(new Font("Arial", Font.PLAIN, 11));
		lblNewLabel.setBounds(74, 32, 69, 14);
		contentPane.add(lblNewLabel);
		
		numeroUno = new JTextField();
		numeroUno.setBounds(153, 29, 177, 20);
		contentPane.add(numeroUno);
		numeroUno.setColumns(10);
		
		JLabel lblNumero = new JLabel("Numero #2");
		lblNumero.setFont(new Font("Arial", Font.PLAIN, 11));
		lblNumero.setBounds(74, 85, 69, 14);
		contentPane.add(lblNumero);
		
		numeroDos = new JTextField();
		numeroDos.setColumns(10);
		numeroDos.setBounds(153, 82, 177, 20);
		contentPane.add(numeroDos);
		
		JLabel lblNumero_1 = new JLabel("Numero #2");
		lblNumero_1.setFont(new Font("Arial", Font.PLAIN, 11));
		lblNumero_1.setBounds(-71, 151, 69, 14);
		contentPane.add(lblNumero_1);
		
		numeroTres = new JTextField();
		numeroTres.setColumns(10);
		numeroTres.setBounds(153, 132, 177, 20);
		contentPane.add(numeroTres);
		
		JLabel lblNumero_3 = new JLabel("Numero #3");
		lblNumero_3.setFont(new Font("Arial", Font.PLAIN, 11));
		lblNumero_3.setBounds(74, 135, 69, 14);
		contentPane.add(lblNumero_3);
		
		JButton btnSuma = new JButton("  ");
		btnSuma.setHorizontalAlignment(SwingConstants.LEFT);
		btnSuma.setIcon(new ImageIcon("C:\\Users\\HP\\Downloads\\boton-de-simbolo-mas.png"));
		
	
		//Evento para Suma		
		btnSuma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int numUno, numDos;
								
				numUno = Integer.parseInt(numeroUno.getText());
				numDos = Integer.parseInt(numeroDos.getText());				

				Suma sumatoria = new Suma();
				
				sumatoria.enviarSuma(numUno, numDos);
				
				numeroTres.setText(String.valueOf(sumatoria.getResultado()));
						
			}
		});
		
		
		btnSuma.setBounds(27, 208, 59, 23);
		contentPane.add(btnSuma);
		
		JButton btnResta = new JButton("Restar");
		btnResta.setBounds(116, 208, 89, 23);
		contentPane.add(btnResta);
		
		JButton btnMultiplicar = new JButton("Multiplicar");
		btnMultiplicar.setBounds(227, 208, 89, 23);
		contentPane.add(btnMultiplicar);
		
		JButton btnDividir = new JButton("Divir");
		btnDividir.setBounds(335, 208, 89, 23);
		contentPane.add(btnDividir);
	}
}
