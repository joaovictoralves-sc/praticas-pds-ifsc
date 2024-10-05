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

public class restauranteFomelandia extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtPesoPrato;
	private JTextField txtPrecoQuilo;
	private JLabel lblTotalPagar;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					restauranteFomelandia frame = new restauranteFomelandia();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public restauranteFomelandia() {
		setFont(new Font("Cambria Math", Font.BOLD | Font.ITALIC, 12));
		setTitle("Restaurante Fomelândia");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblPesoPrato = new JLabel("Peso do prato (kg):");
		lblPesoPrato.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblPesoPrato.setBounds(20, 30, 150, 25);
		contentPane.add(lblPesoPrato);

		txtPesoPrato = new JTextField();
		txtPesoPrato.setBounds(150, 31, 132, 25);
		contentPane.add(txtPesoPrato);
		txtPesoPrato.setColumns(10);

		JLabel lblPrecoQuilo = new JLabel("Preço por quilo (R$):");
		lblPrecoQuilo.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblPrecoQuilo.setBounds(20, 70, 150, 25);
		contentPane.add(lblPrecoQuilo);

		txtPrecoQuilo = new JTextField();
		txtPrecoQuilo.setBounds(160, 66, 123, 25);
		contentPane.add(txtPrecoQuilo);
		txtPrecoQuilo.setColumns(10);

		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double pesoPrato = Double.parseDouble(txtPesoPrato.getText());
					double precoQuilo = Double.parseDouble(txtPrecoQuilo.getText());
					double totalPagar = pesoPrato * precoQuilo;

					lblTotalPagar.setText("Total a pagar: R$ " + String.format("%.2f", totalPagar));
				} catch (NumberFormatException ex) {
					lblTotalPagar.setText("Entrada inválida!");
				}
			}
		});
		btnCalcular.setBounds(170, 166, 100, 30);
		contentPane.add(btnCalcular);

		lblTotalPagar = new JLabel("Total a pagar: ");
		lblTotalPagar.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblTotalPagar.setBounds(20, 113, 400, 25);
		contentPane.add(lblTotalPagar);
	}
}