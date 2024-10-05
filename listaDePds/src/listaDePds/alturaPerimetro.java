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

public class alturaPerimetro extends JFrame {
	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtBase;
	private JTextField txtAltura;
	private JLabel lblPerimetro;
	private JLabel lblArea;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					alturaPerimetro frame = new alturaPerimetro();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public alturaPerimetro() {
		setFont(new Font("Cambria Math", Font.BOLD | Font.ITALIC, 12));
		setTitle("Cálculo de Retângulo");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblBase = new JLabel("Base:");
		lblBase.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblBase.setBounds(20, 30, 100, 25);
		contentPane.add(lblBase);

		txtBase = new JTextField();
		txtBase.setBounds(59, 31, 132, 25);
		contentPane.add(txtBase);
		txtBase.setColumns(10);

		JLabel lblAltura = new JLabel("Altura:");
		lblAltura.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblAltura.setBounds(20, 70, 100, 25);
		contentPane.add(lblAltura);

		txtAltura = new JTextField();
		txtAltura.setBounds(69, 71, 122, 25);
		contentPane.add(txtAltura);
		txtAltura.setColumns(10);

		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		btnCalcular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				try {
					double base = Double.parseDouble(txtBase.getText());
					double altura = Double.parseDouble(txtAltura.getText());
					
					Retangulo retangulo = new Retangulo(base, altura);
					double perimetro = retangulo.calcularPerimetro();
					double area = retangulo.calcularArea();

					lblPerimetro.setText("Perímetro: " + String.format("%.2f", perimetro));
					lblArea.setText("Área: " + String.format("%.2f", area));
				} catch (NumberFormatException ex) {
					lblPerimetro.setText("Entrada inválida!");
					lblArea.setText("");
				}
			}
		});
		btnCalcular.setBounds(154, 187, 100, 30);
		contentPane.add(btnCalcular);

		lblPerimetro = new JLabel("Perímetro: ");
		lblPerimetro.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblPerimetro.setBounds(20, 140, 200, 25);
		contentPane.add(lblPerimetro);

		lblArea = new JLabel("Área: ");
		lblArea.setFont(new Font("Tahoma", Font.BOLD | Font.ITALIC, 12));
		lblArea.setBounds(20, 104, 200, 25);
		contentPane.add(lblArea);
	}
}

class Retangulo {
	private double base;
	private double altura;

	public Retangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	public double calcularPerimetro() {
		return 2 * (base + altura);
	}

	public double calcularArea() {
		return base * altura;
	}
}