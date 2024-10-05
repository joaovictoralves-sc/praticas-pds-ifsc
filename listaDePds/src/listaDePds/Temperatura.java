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

public class Temperatura extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtFahrenheit;
	private JLabel lblCelsius;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Temperatura frame = new Temperatura();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Temperatura() {
		setFont(new Font("Cambria Math", Font.BOLD | Font.ITALIC, 12));
		setTitle("Conversor de temperatura");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblFahrenheit = new JLabel("Temperatura em Fahrenheit:");
		lblFahrenheit.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblFahrenheit.setBounds(20, 30, 200, 25);
		contentPane.add(lblFahrenheit);

		txtFahrenheit = new JTextField();
		txtFahrenheit.setBounds(200, 31, 144, 25);
		contentPane.add(txtFahrenheit);
		txtFahrenheit.setColumns(10);

		JButton btnConverter = new JButton("Converter");
		btnConverter.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		btnConverter.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double fahrenheit = Double.parseDouble(txtFahrenheit.getText());
					Conversao conversao = new Conversao();
					double celsius = conversao.calcularTemperatura(fahrenheit);
					lblCelsius.setText("Celsius: " + String.format("%.2f", celsius));
				} catch (NumberFormatException ex) {
					lblCelsius.setText("Entrada inválida!");
				}
			}
		});
		btnConverter.setBounds(152, 164, 120, 30);
		contentPane.add(btnConverter);

		lblCelsius = new JLabel("Celsius: ");
		lblCelsius.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblCelsius.setBounds(20, 70, 200, 25);
		contentPane.add(lblCelsius);
	}
}

class Conversao {
	public double calcularTemperatura(double fahrenheit) {
		return (fahrenheit - 32) * 5 / 9;
	}
}