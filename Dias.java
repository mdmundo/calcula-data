import java.awt.EventQueue;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.text.MaskFormatter;
import javax.swing.JTextField;

public class Dias {

	private JFrame frame;
	private JTextField textField;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Dias window = new Dias();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public Dias() throws ParseException {
		initialize();
	}

	private void initialize() throws ParseException {
		frame = new JFrame("Calculadora de Data");
		frame.setBounds(100, 100, 390, 105);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new GridLayout(1, 0, 0, 0));
		frame.setResizable(false);
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel);
		panel.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JPanel panel_1 = new JPanel();
		panel.add(panel_1);
		panel_1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblData = new JLabel("Data 1");
		panel_1.add(lblData);
		
		JFormattedTextField formattedTextField = new JFormattedTextField(new MaskFormatter("##/##/####"));
		formattedTextField.setColumns(6);
		panel_1.add(formattedTextField);
		
		JPanel panel_2 = new JPanel();
		panel.add(panel_2);
		panel_2.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		
		JLabel lblData_1 = new JLabel("Data 2");
		panel_2.add(lblData_1);
		
		JFormattedTextField formattedTextField_1 = new JFormattedTextField(new MaskFormatter("##/##/####"));
		formattedTextField_1.setColumns(6);
		panel_2.add(formattedTextField_1);
		
		JButton btnCalcular = new JButton("Calcular");
		btnCalcular.addActionListener( new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				DiasClasse dias = new DiasClasse();
				textField.setText(dias.getData(formattedTextField.getText(), formattedTextField_1.getText())+" dia(s).");
			}
		});
		panel.add(btnCalcular);
		
		JPanel panel_3 = new JPanel();
		panel.add(panel_3);
		
		JLabel lblDiferena = new JLabel("Diferença:");
		panel_3.add(lblDiferena);
		
		textField = new JTextField();
		panel_3.add(textField);
		textField.setColumns(15);
	}

}
