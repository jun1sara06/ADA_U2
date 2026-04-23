import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.awt.event.ActionEvent;

public class GUIRegistro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtNivel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					GUIRegistro frame = new GUIRegistro();
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
	public GUIRegistro() {
		
		ArrayList<Persona> Personas = new ArrayList <Persona>();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JPanel ventanaDeRegistro = new JPanel();
		ventanaDeRegistro.setBounds(0, 0, 900, 600);
		ventanaDeRegistro.setLayout(null);
		contentPane.add(ventanaDeRegistro);
		
		JPanel ventanaDeBuscar = new JPanel();
		ventanaDeBuscar.setBounds(0, 0, 900, 600);
		ventanaDeBuscar.setLayout(null);
		ventanaDeBuscar.setVisible(true);
		contentPane.add(ventanaDeBuscar);
		
		JLabel lblTitulo = new JLabel("Registra tu nivel de glucosa");
		lblTitulo.setFont(new Font("Yu Gothic UI", Font.BOLD, 32));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(208, 11, 471, 88);
		ventanaDeRegistro.add(lblTitulo);
		
		JLabel lblNombre = new JLabel("Nombre de la persona a registrar");
		lblNombre.setHorizontalAlignment(SwingConstants.CENTER);
		lblNombre.setFont(new Font("Yu Gothic UI", Font.BOLD, 16));
		lblNombre.setBounds(25, 140, 290, 30);
		ventanaDeRegistro.add(lblNombre);
		
		txtNombre = new JTextField();
		txtNombre.setBounds(325, 140, 290, 30);
		ventanaDeRegistro.add(txtNombre);
		txtNombre.setColumns(10);
		
		JLabel lblNivel = new JLabel("Nivel de glucosa (mg/dL)");
		lblNivel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNivel.setFont(new Font("Yu Gothic UI", Font.BOLD, 16));
		lblNivel.setBounds(25, 260, 290, 30);
		ventanaDeRegistro.add(lblNivel);
		
		txtNivel = new JTextField();
		txtNivel.setColumns(10);
		txtNivel.setBounds(325, 260, 290, 30);
		ventanaDeRegistro.add(txtNivel);
		
		JLabel lblFecha = new JLabel("Fecha de registro");
		lblFecha.setHorizontalAlignment(SwingConstants.CENTER);
		lblFecha.setFont(new Font("Yu Gothic UI", Font.BOLD, 16));
		lblFecha.setBounds(25, 320, 290, 30);
		ventanaDeRegistro.add(lblFecha);
		
		JLabel lblPersonas = new JLabel("Personas ya registradas");
		lblPersonas.setHorizontalAlignment(SwingConstants.CENTER);
		lblPersonas.setFont(new Font("Yu Gothic UI", Font.BOLD, 16));
		lblPersonas.setBounds(25, 200, 290, 30);
		ventanaDeRegistro.add(lblPersonas);
		
		JComboBox<String> comboPersonas = new JComboBox<String>();
		comboPersonas.setBounds(325, 200, 290, 30);
		ventanaDeRegistro.add(comboPersonas);
		if (Personas.isEmpty()) {
			comboPersonas.addItem("No hay personas registradas.");
			comboPersonas.setEnabled(false);
		}
		
		JSpinner spinnerDia = new JSpinner();
		spinnerDia.setBounds(325, 320, 60, 30);
		ventanaDeRegistro.add(spinnerDia);
		
		JSpinner spinnerAño = new JSpinner();
		spinnerAño.setBounds(550, 320, 60, 30);
		ventanaDeRegistro.add(spinnerAño);
		
		JLabel lblDia = new JLabel("Dia");
		lblDia.setHorizontalAlignment(SwingConstants.CENTER);
		lblDia.setFont(new Font("Yu Gothic UI", Font.BOLD, 11));
		lblDia.setBounds(335, 300, 40, 20);
		ventanaDeRegistro.add(lblDia);
		
		JLabel lblMes = new JLabel("Mes");
		lblMes.setHorizontalAlignment(SwingConstants.CENTER);
		lblMes.setFont(new Font("Yu Gothic UI", Font.BOLD, 11));
		lblMes.setBounds(450, 300, 40, 20);
		ventanaDeRegistro.add(lblMes);
		
		JLabel lblAño = new JLabel("Año");
		lblAño.setHorizontalAlignment(SwingConstants.CENTER);
		lblAño.setFont(new Font("Yu Gothic UI", Font.BOLD, 11));
		lblAño.setBounds(560, 300, 40, 20);
		ventanaDeRegistro.add(lblAño);
		
		JComboBox<Integer> comboMes = new JComboBox<Integer>();
		comboMes.setBounds(440, 320, 60, 30);
		ventanaDeRegistro.add(comboMes);
		for (int i=1; i <= 12; i++) {
			comboMes.addItem(i);
		}
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Persona persona = new Persona();
				int id = 0;
				persona.setId(id);
				id++;
				persona.setNombre(txtNombre.getText());
				 try {
			            float nivel = Float.parseFloat(txtNivel.getText());
			            persona.setNivel(nivel);
			        } catch (NumberFormatException ex) {
			            JOptionPane.showMessageDialog(null,
			                "El valor ingresado en nivel no es válido. Debe ser un número.");
			        }
				 persona.setDia(Byte.parseByte(spinnerDia.getValue().toString()));
				 persona.setMes(Byte.parseByte(comboMes.getSelectedItem().toString()));
				 persona.setAño(Short.parseShort(spinnerAño.getValue().toString()));
			}
		});
		btnRegistrar.setBounds(740, 500, 116, 35);
		ventanaDeRegistro.add(btnRegistrar);
		
		
	}
}
