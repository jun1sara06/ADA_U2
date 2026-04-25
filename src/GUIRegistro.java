import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JSpinner;
//<<<<<<< HEAD
import javax.swing.DefaultListModel;
//=======
import javax.swing.JTextArea;
//>>>>>>> refs/remotes/origin/RamaCarol_persona3
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.time.LocalDate;
import java.util.ArrayList;
import java.awt.event.ActionEvent;
import java.awt.Color;
//<<<<<<< HEAD
//=======
//>>>>>>> refs/remotes/origin/RamaCarol_persona3

public class GUIRegistro extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private JTextField txtNombre;
	private JTextField txtNivel;
//<<<<<<< HEAD
//<<<<<<< HEAD
	private int idCont = 0;
//=======
	
//>>>>>>> refs/remotes/origin/Rama_Lisset_Persona2
//=======
	private JTextField textField;
//>>>>>>> refs/remotes/origin/RamaCarol_persona3

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
	    DefaultListModel<String> Modelolis = new DefaultListModel<>();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 900, 600);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
//<<<<<<< HEAD
		JPanel ventanaConsultarHistorial = new JPanel();
		ventanaConsultarHistorial.setBounds(0, 0, 900, 600);
		ventanaConsultarHistorial.setLayout(null);
		ventanaConsultarHistorial.setVisible(false);
//=======
		JPanel ventanaDeBuscar = new JPanel();
		ventanaDeBuscar.setBackground(new Color(255, 128, 128));
		ventanaDeBuscar.setBounds(0, 0, 900, 600);
		ventanaDeBuscar.setLayout(null);
		ventanaDeBuscar.setVisible(false);
		contentPane.add(ventanaDeBuscar);
//>>>>>>> refs/remotes/origin/RamaCarol_persona3
		
		JPanel ventanaDeRegistro = new JPanel();
		ventanaDeRegistro.setBounds(0, 0, 900, 600);
		ventanaDeRegistro.setLayout(null);
		ventanaDeRegistro.setVisible(false);
		contentPane.add(ventanaDeRegistro);
		
//<<<<<<< HEAD
//<<<<<<< HEAD
		JPanel ventanaDeMenu = new JPanel();
		ventanaDeMenu.setBounds(0, 0, 900, 600);
		ventanaDeMenu.setLayout(null);
		contentPane.add(ventanaDeMenu);
		
		JLabel lblTituloMenu = new JLabel("Menú principal");
		lblTituloMenu.setHorizontalAlignment(SwingConstants.CENTER);
		lblTituloMenu.setFont(new Font("Yu Gothic UI", Font.BOLD, 32));
		lblTituloMenu.setBounds(208, 11, 471, 88);
		ventanaDeMenu.add(lblTituloMenu);
		
		JButton btnRegistro = new JButton("Registrar nueva entrada");
		btnRegistro.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanaDeMenu.setVisible(false);
				ventanaDeRegistro.setVisible(true);
			}
		});
		btnRegistro.setBounds(340, 150, 200, 35);
		ventanaDeMenu.add(btnRegistro);
		
		JButton btnHistorial = new JButton("Ver historial completo");
		btnHistorial.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanaDeMenu.setVisible(false);
				ventanaConsultarHistorial.setVisible(true);
			}
		});
		btnHistorial.setBounds(340, 250, 200, 35);
		ventanaDeMenu.add(btnHistorial);
		
		JButton btnConsultar = new JButton("Consultar entrada");
		btnConsultar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanaDeMenu.setVisible(false);
				ventanaDeBuscar.setVisible(true);
			}
		});
		btnConsultar.setBounds(340, 350, 200, 35);
		ventanaDeMenu.add(btnConsultar);
		
		JLabel lblTituloRegistro = new JLabel("Registra tu nivel de glucosa");
		lblTituloRegistro.setFont(new Font("Yu Gothic UI", Font.BOLD, 32));
		lblTituloRegistro.setHorizontalAlignment(SwingConstants.CENTER);
		lblTituloRegistro.setBounds(208, 11, 471, 88);
		ventanaDeRegistro.add(lblTituloRegistro);
//=======
//=======
//>>>>>>> refs/remotes/origin/RamaCarol_persona3
		JLabel lblTitulo = new JLabel("Registra tu nivel de glucosa");
		lblTitulo.setFont(new Font("Yu Gothic UI", Font.BOLD, 32));
		lblTitulo.setHorizontalAlignment(SwingConstants.CENTER);
		lblTitulo.setBounds(208, 11, 471, 88);
		ventanaDeRegistro.add(lblTitulo);
//>>>>>>> refs/remotes/origin/Rama_Lisset_Persona2
		
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
		
//<<<<<<< HEAD
		for (int i=1; i <= 12; i++) {
			comboMes.addItem(i);
		}
//=======
		LocalDate hoy = LocalDate.now();
		spinnerDia.setValue(hoy.getDayOfMonth());
		comboMes.setSelectedItem(hoy.getMonthValue());
		spinnerAño.setValue(hoy.getYear());
//>>>>>>> refs/remotes/origin/Rama_Lisset_Persona2
		
		JButton btnRegresar = new JButton("Menú principal");
		btnRegresar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanaDeRegistro.setVisible(false);
				ventanaDeMenu.setVisible(true);
			}
		});
		btnRegresar.setBounds(30, 500, 150, 35);
		ventanaDeRegistro.add(btnRegresar);
		
		JButton btnRegistrar = new JButton("Registrar");
		btnRegistrar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Persona persona = new Persona();
				persona.setId(idCont);
				idCont++;
				if (!txtNombre.getText().isEmpty()) {
				persona.setNombre(txtNombre.getText());
				}
				else {
				persona.setNombre(comboPersonas.getSelectedItem().toString());
				}
				 try {
			            float nivel = Float.parseFloat(txtNivel.getText());
			            persona.setNivel(nivel);
			        } catch (NumberFormatException ex) {
			            JOptionPane.showMessageDialog(null,
			                "El valor ingresado en nivel no es válido. Debe ser un número.");
			            return;
			        }
				 persona.setDia(Byte.parseByte(spinnerDia.getValue().toString()));
				 persona.setMes(Byte.parseByte(comboMes.getSelectedItem().toString()));
				 persona.setAño(Short.parseShort(spinnerAño.getValue().toString()));
				 Personas.add(persona);
//<<<<<<< HEAD
//<<<<<<< HEAD
				 comboPersonas.setEnabled(true);
					comboPersonas.removeAllItems();
					for (int i = 0; i < Personas.size(); i++) {
					        comboPersonas.addItem(Personas.get(i).getNombre());
					}
				JOptionPane.showMessageDialog(null, "Registro exitoso.");
//<<<<<<< HEAD
//=======
				 
				 Modelolis.clear();
				 for (int i=0; i<Personas.size()- 1; i++) {
				        for (int j=0; j<Personas.size()- i - 1; j++) {
				        	if (Personas.get(j).getNombre().compareToIgnoreCase(Personas.get(j+1).getNombre())>0) {
				        		Persona aux =Personas.get(j);
				                Personas.set(j,Personas.get(j+1));
				                Personas.set(j+1, aux);
				            }
				        }
				    }

				 for (Persona n:Personas) {
				        Modelolis.addElement("Paciente: "+n.getNombre()+" | Nivel: "+n.getNivel());
				    }
//>>>>>>> refs/remotes/origin/Rama_Lisset_Persona2
//=======
				 
//>>>>>>> refs/remotes/origin/RamaCarol_persona3
//=======
//>>>>>>> branch 'master' of https://github.com/jun1sara06/ADA_U2.git
			}
		});
		btnRegistrar.setBounds(740, 500, 116, 35);
		ventanaDeRegistro.add(btnRegistrar);
		contentPane.add(ventanaConsultarHistorial);
		
		JList<String> listHistorial = new JList<>(Modelolis);
		JScrollPane scrollPane = new JScrollPane(listHistorial);
		scrollPane.setBounds(50, 50, 800, 400);
		ventanaConsultarHistorial.add(scrollPane);
		
		JButton btnMP = new JButton("Menú Principal");
		btnMP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanaConsultarHistorial.setVisible(false);
				ventanaDeMenu.setVisible(true);
			}
		});
		btnMP.setBounds(686, 479, 143, 43);
		ventanaConsultarHistorial.add(btnMP);
		
		if (Personas.isEmpty()) {
			comboPersonas.addItem("No hay personas registradas.");
			comboPersonas.setEnabled(false);
		}
		
		
		
		JTextArea resultados = new JTextArea("");
		resultados.setBounds(211, 172, 374, 188);
		ventanaDeBuscar.add(resultados);
		
		//Cambios de Carol Canto
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				
				String nombreBuscado = textField.getText().trim();
				
				String resultado = "";
		
				for(Persona p : Personas) {
					if (p.getNombre().equals(nombreBuscado)) {
						
					resultado += p.getNombre( ) + 
							"\n Nivel de glucosa" + p.getNivel() +
							"\n" +p.getDia()+"/"+p.getMes()+"/"
							+p.getAño();
					
					
				}
			}
					if (resultado.isEmpty()) {
						resultado ="persona no encontrada";
					}
					resultados.setText(resultado);
					
					ventanaDeRegistro.setVisible(false);
					ventanaDeBuscar.setVisible(true);
			}
		});
		btnBuscar.setBounds(211, 440, 116, 35);
		ventanaDeBuscar.add(btnBuscar);
		
		textField = new JTextField();
		textField.setBounds(211, 60, 181, 41);
		ventanaDeBuscar.add(textField);
		textField.setColumns(10);
		
		JButton btnMenPrincipal = new JButton("Menú Principal");
		btnMenPrincipal.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ventanaDeBuscar.setVisible(false);
				ventanaDeMenu.setVisible(true);
			}
		});
		btnMenPrincipal.setBounds(465, 440, 116, 35);
		ventanaDeBuscar.add(btnMenPrincipal);
		
		
		
	}
}
	
