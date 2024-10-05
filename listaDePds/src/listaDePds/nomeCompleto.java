package listaDePds;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class nomeCompleto extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNome;
	private JTextField txtSobrenome;
	private JLabel lblNomeCompleto;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					nomeCompleto frame = new nomeCompleto();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public nomeCompleto() {
		setFont(new Font("Cambria Math", Font.BOLD | Font.ITALIC, 12));
		setTitle("Nome Completo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblNome = new JLabel("Nome:");
		lblNome.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblNome.setBounds(20, 30, 100, 25);
		contentPane.add(lblNome);

		txtNome = new JTextField();
		txtNome.setBounds(65, 31, 200, 25);
		contentPane.add(txtNome);
		txtNome.setColumns(10);

		JLabel lblSobrenome = new JLabel("Sobrenome:");
		lblSobrenome.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblSobrenome.setBounds(20, 70, 100, 25);
		contentPane.add(lblSobrenome);

		txtSobrenome = new JTextField();
		txtSobrenome.setBounds(104, 71, 200, 25);
		contentPane.add(txtSobrenome);
		txtSobrenome.setColumns(10);

		JButton btnExibirNome = new JButton("Exibir Nome Completo");
		btnExibirNome.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		btnExibirNome.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String nome = txtNome.getText();
				String sobrenome = txtSobrenome.getText();
				lblNomeCompleto.setText("Nome Completo: " + nome + " " + sobrenome);
			}
		});
		btnExibirNome.setBounds(104, 175, 200, 30);
		contentPane.add(btnExibirNome);

		lblNomeCompleto = new JLabel("Nome Completo: ");
		lblNomeCompleto.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblNomeCompleto.setBounds(20, 113, 400, 25);
		contentPane.add(lblNomeCompleto);
	}
}