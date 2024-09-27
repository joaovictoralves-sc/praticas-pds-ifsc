package exerciciosSala;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JToolBar;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

public class telaPrincipal extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					telaPrincipal frame = new telaPrincipal();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public telaPrincipal() {
		setTitle("Minha Tela kkj");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnTeste1 = new JButton("Teste 1");
		btnTeste1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "Bom dia pessoal!");
			}
		});
		btnTeste1.setBounds(339, 42, 85, 23);
		contentPane.add(btnTeste1);
		
		JLabel lblSauda = new JLabel("Olá Mundo!");
		lblSauda.setBounds(184, 13, 69, 17);
		lblSauda.setFont(new Font("Times New Roman", Font.ITALIC, 14));
		contentPane.add(lblSauda);
		
		JButton btnFechar = new JButton("Fechar");
		btnFechar.setBounds(339, 195, 85, 23);
		btnFechar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				setVisible(false);
			}
		});
		contentPane.add(btnFechar);
		
		JButton btnTeste2 = new JButton("Teste 2");
		btnTeste2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int resposta = JOptionPane.showConfirmDialog(null, "Você gosta de programação? ", "Confirmação: ", JOptionPane.YES_NO_OPTION);
				System.out.println(resposta);
				if(resposta == 0) {
					JOptionPane.showMessageDialog(null, "Parabéns, você é sensasional", "RESPOSTA SIM", JOptionPane.INFORMATION_MESSAGE);
				}if(resposta == 1) {
					JOptionPane.showMessageDialog(null, "Bah guri, não gostei!", "RESPOSTA NÃO", JOptionPane.ERROR_MESSAGE);
					
				}
			}
		});
		btnTeste2.setBounds(335, 85, 89, 23);
		contentPane.add(btnTeste2);
		
		JButton btnTeste3 = new JButton("Teste 3");
		btnTeste3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = JOptionPane.showInputDialog(null, "Qual é o seu nome? ", "ENTRADA DE NOME", JOptionPane.QUESTION_MESSAGE);
				JOptionPane.showMessageDialog(null, "Nome informado: " + nome);
			}
		});
		btnTeste3.setBounds(335, 137, 89, 23);
		contentPane.add(btnTeste3);
		
		textField = new JTextField();
		textField.setBounds(9, 43, 86, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(9, 86, 86, 20);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
	}
}
