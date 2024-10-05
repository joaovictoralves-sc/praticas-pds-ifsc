package exerciciosSala;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Validador extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField txtNome;
	private JTextField txtIdade;
	private JLabel lblResposta;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Validador frame = new Validador();
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
	public Validador() {
		setTitle("Validador");
		setBounds(100, 100, 450, 300);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		getContentPane().setLayout(null);
		
		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		lblNome.setBounds(10, 66, 46, 14);
		getContentPane().add(lblNome);
		
		JLabel lblIdade = new JLabel("Idade:");
		lblIdade.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		lblIdade.setBounds(10, 108, 46, 14);
		getContentPane().add(lblIdade);
		
		txtNome = new JTextField();
		txtNome.setBounds(44, 63, 110, 20);
		getContentPane().add(txtNome);
		txtNome.setColumns(10);
		
		txtIdade = new JTextField();
		txtIdade.setBounds(44, 105, 46, 20);
		getContentPane().add(txtIdade);
		txtIdade.setColumns(10);
		
		JLabel lblResposta = new JLabel("");
		lblResposta.setBounds(111, 211, 226, 20);
		getContentPane().add(lblResposta);

		
		JButton btnValidar = new JButton("Validar");
		btnValidar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				//mostrarResultado();
				String nome = txtNome.getText();
				String idadeStr = txtIdade.getText();
				
				if(nome.isEmpty()) {
					lblResposta.setText("Por favor, insira o nome: ");
					return;
				}
				
				try {
				int idade = Integer.parseInt(idadeStr);
				String mensagem ="Nome: " + nome + ", Idade: " + idade;
				
				if(idade < 0) {
					lblResposta.setText("Por favor, insira uma idade válida: ");
					return;
				}
				
				if(idade < 18) {
					mensagem += " (Menor de idade) ";
					
				}else {
					mensagem += " (Maior de idade) ";
				}
				
				
				lblResposta.setText(mensagem);
				
				}catch (NumberFormatException ex) {
					lblResposta.setText("Por favor, insira uma idade válida: ");
					
				}
			}
		});
		btnValidar.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 12));
		btnValidar.setBounds(171, 167, 89, 23);
		getContentPane().add(btnValidar);
		

	}
	
	//private void mostrarResultado() {
		//String nome = txtNome.getText();
		//String idade = txtIdade.getText();
		
		//lblResposta.setText(nome);
		
	//}
}
