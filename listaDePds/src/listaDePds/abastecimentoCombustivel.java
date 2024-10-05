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

public class abastecimentoCombustivel extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtPrecoLitro;
	private JTextField txtValorPagamento;
	private JLabel lblLitros;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					abastecimentoCombustivel frame = new abastecimentoCombustivel();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public abastecimentoCombustivel() {
		setFont(new Font("Cambria Math", Font.BOLD | Font.ITALIC, 12));
		setTitle("Abastecimento de Combustível");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblPrecoLitro = new JLabel("Preço por litro (R$):");
		lblPrecoLitro.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblPrecoLitro.setBounds(20, 30, 150, 25);
		contentPane.add(lblPrecoLitro);

		txtPrecoLitro = new JTextField();
		txtPrecoLitro.setBounds(150, 31, 116, 25);
		contentPane.add(txtPrecoLitro);
		txtPrecoLitro.setColumns(10);

		JLabel lblValorPagamento = new JLabel("Valor pago (R$):");
		lblValorPagamento.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblValorPagamento.setBounds(20, 70, 150, 25);
		contentPane.add(lblValorPagamento);

		txtValorPagamento = new JTextField();
		txtValorPagamento.setBounds(127, 71, 139, 25);
		contentPane.add(txtValorPagamento);
		txtValorPagamento.setColumns(10);

		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double precoLitro = Double.parseDouble(txtPrecoLitro.getText());
					double valorPagamento = Double.parseDouble(txtValorPagamento.getText());

					double litros = valorPagamento / precoLitro;

					lblLitros.setText("Litros: " + String.format("%.2f", litros));
				} catch (NumberFormatException ex) {
					lblLitros.setText("Entrada inválida!");
				}
			}
		});
		btnCalcular.setBounds(152, 185, 100, 30);
		contentPane.add(btnCalcular);

		lblLitros = new JLabel("Litros: ");
		lblLitros.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblLitros.setBounds(20, 109, 400, 25);
		contentPane.add(lblLitros);
	}
}