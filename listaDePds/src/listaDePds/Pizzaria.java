package listaDePds;

import javax.swing.JFrame;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JOptionPane;

public class Pizzaria extends JFrame {

    private final double PRECO_PIZZA = 60.00;
    private final double PRECO_ADICIONAL = 4.00;
    private final double PRECO_BORDA = 2.00;
    private final double PRECO_ENTREGA = 10.00;

    public Pizzaria() {
        setTitle("La Bella Napoli");
        setBounds(100, 100, 550, 350);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().setLayout(null);

        JLabel lblPizzaria = new JLabel("La Bella Napoli - Cardápio");
        lblPizzaria.setBounds(136, 0, 224, 28);
        lblPizzaria.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 16));
        getContentPane().add(lblPizzaria);

        JCheckBox chkPizza01 = new JCheckBox("Havaiana + 60.00 R$");
        chkPizza01.setBounds(28, 207, 134, 23);
        chkPizza01.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
        getContentPane().add(chkPizza01);

        JCheckBox chkPizza02 = new JCheckBox("Margherita + 60.00 R$");
        chkPizza02.setBounds(28, 233, 134, 23);
        chkPizza02.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
        getContentPane().add(chkPizza02);

        JCheckBox chkPizza03 = new JCheckBox("Pepperoni  + 60.00 R$");
        chkPizza03.setBounds(28, 257, 134, 23);
        chkPizza03.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
        getContentPane().add(chkPizza03);

        JLabel lblSabores = new JLabel("Sabores");
        lblSabores.setBounds(31, 178, 81, 28);
        lblSabores.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 16));
        getContentPane().add(lblSabores);

        JCheckBox chkOpcional01 = new JCheckBox("Bacon + 4.00 R$");
        chkOpcional01.setBounds(336, 90, 113, 23);
        chkOpcional01.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
        getContentPane().add(chkOpcional01);

        JCheckBox chkOpcional02 = new JCheckBox("Cebola + 4.00 R$");
        chkOpcional02.setBounds(336, 116, 113, 23);
        chkOpcional02.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
        getContentPane().add(chkOpcional02);

        JCheckBox chkOpcional03 = new JCheckBox("Maionese + 4.00 R$");
        chkOpcional03.setBounds(336, 142, 125, 23);
        chkOpcional03.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
        getContentPane().add(chkOpcional03);

        JLabel lblOpcionais = new JLabel("Opcionais");
        lblOpcionais.setBounds(358, 60, 97, 23);
        lblOpcionais.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 16));
        getContentPane().add(lblOpcionais);

        JComboBox<String> cmbEntrega = new JComboBox<>();
        cmbEntrega.setModel(new DefaultComboBoxModel<>(new String[]{"Tele entrega + 10.00 R$", "Retirar no local + 0.00 R$"}));
        cmbEntrega.setBounds(31, 90, 147, 22);
        cmbEntrega.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
        getContentPane().add(cmbEntrega);

        JLabel lblEntrega = new JLabel("Entrega");
        lblEntrega.setBounds(28, 60, 84, 23);
        lblEntrega.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 16));
        getContentPane().add(lblEntrega);

        JRadioButton rbtComBorda = new JRadioButton("Com borda de catupiry + 2.00 R$");
        rbtComBorda.setBounds(313, 207, 183, 23);
        rbtComBorda.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
        getContentPane().add(rbtComBorda);

        JRadioButton rbtSemBorda = new JRadioButton("Sem borda de catupiry + 0.00 R$");
        rbtSemBorda.setBounds(313, 233, 183, 23);
        rbtSemBorda.setFont(new Font("Times New Roman", Font.BOLD | Font.ITALIC, 11));
        getContentPane().add(rbtSemBorda);

        JLabel lblBorda = new JLabel("Borda de Catupiry");
        lblBorda.setBounds(327, 185, 159, 14);
        lblBorda.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 16));
        getContentPane().add(lblBorda);

        JButton btnMostrar = new JButton("Mostrar Pedido");
        btnMostrar.setBounds(173, 181, 144, 33);
        btnMostrar.setForeground(Color.RED);
        btnMostrar.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
        getContentPane().add(btnMostrar);

        JButton btnCalcular = new JButton("Calcular Pedido");
        btnCalcular.setBounds(173, 146, 144, 33);
        btnCalcular.setForeground(Color.RED);
        btnCalcular.setFont(new Font("Verdana", Font.BOLD | Font.ITALIC, 12));
        getContentPane().add(btnCalcular);

        btnCalcular.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                double total = 0.0;

                if (chkPizza01.isSelected()) total += PRECO_PIZZA;
                if (chkPizza02.isSelected()) total += PRECO_PIZZA;
                if (chkPizza03.isSelected()) total += PRECO_PIZZA;

                if (chkOpcional01.isSelected()) total += PRECO_ADICIONAL;
                if (chkOpcional02.isSelected()) total += PRECO_ADICIONAL;
                if (chkOpcional03.isSelected()) total += PRECO_ADICIONAL;

                if (cmbEntrega.getSelectedIndex() == 0) total += PRECO_ENTREGA;

                if (rbtComBorda.isSelected()) total += PRECO_BORDA;

                JOptionPane.showMessageDialog(null, "Valor total do pedido: R$ " + total);
            }
        });

        btnMostrar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                StringBuilder pedido = new StringBuilder("Seu pedido:\n");

                if (chkPizza01.isSelected()) pedido.append("- Havaiana\n");
                if (chkPizza02.isSelected()) pedido.append("- Margherita\n");
                if (chkPizza03.isSelected()) pedido.append("- Pepperoni\n");

                pedido.append("Opcionais:\n");
                if (chkOpcional01.isSelected()) pedido.append("- Bacon\n");
                if (chkOpcional02.isSelected()) pedido.append("- Cebola\n");
                if (chkOpcional03.isSelected()) pedido.append("- Maionese\n");

                pedido.append("Entrega: ").append(cmbEntrega.getSelectedItem()).append("\n");

                if (rbtComBorda.isSelected()) {
                    pedido.append("Borda: Com catupiry\n");
                } else if (rbtSemBorda.isSelected()) {
                    pedido.append("Borda: Sem catupiry\n");
                }

                JOptionPane.showMessageDialog(null, pedido.toString());
            }
        });
    }

    public static void main(String[] args) {
        Pizzaria frame = new Pizzaria();
        frame.setVisible(true);
    }
}

