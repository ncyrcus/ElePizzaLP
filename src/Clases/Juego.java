import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JButton;
import java.awt.BorderLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JTextPane;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JPanel;
import java.awt.ComponentOrientation;


public class Juego {

	private JFrame frame;
	private JTextField textField;
  private JTextField txtDineroActual;
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Juego window = new Juego();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Juego() {
		initialize();
    frame.setTitle("ElePizza");
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
    final Local pizzeria = new Local();
    final Dia dia = new Dia();

		frame = new JFrame();
		frame.getContentPane().setName("ElePizza");
		frame.setBounds(100, 100, 800, 600);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

    textField = new JTextField();
		textField.setEditable(false);
		textField.setBounds(36, 385, 708, 65);
		frame.getContentPane().add(textField);
		textField.setColumns(10);

		JButton btnNewButton = new JButton("Cocinero");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
        pizzeria.contratarCocinero();
				String cadena = "";
				int numero=pizzeria.cantidadCocineros();
				cadena = String.valueOf(numero);
        textField.setText("Se contrato un Cocinero, hay : " + cadena+" cocineros" );
			}
		});
		btnNewButton.setBounds(139, 32, 129, 15);
		frame.getContentPane().add(btnNewButton);



		JLabel lblContratar = new JLabel("Contratar: ");
		lblContratar.setBounds(36, 32, 101, 15);
		frame.getContentPane().add(lblContratar);

		JButton btnMesero = new JButton("Mesero");
		btnMesero.setBounds(297, 32, 129, 15);
		btnMesero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
        pizzeria.contratarMesero();
				String cadena = "";
				int numero=pizzeria.cantidadMeseros();
				cadena = String.valueOf(numero);
        textField.setText("Se contrato un Mesero, hay : " + cadena+" Meseros" );
			}
		});

		frame.getContentPane().add(btnMesero);


		JLabel lblComprar = new JLabel("Comprar: ");
		lblComprar.setBounds(36, 85, 101, 15);
		frame.getContentPane().add(lblComprar);

		JButton btnMesaGrande = new JButton("Mesa Grande");
		btnMesaGrande.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
        pizzeria.comprarMesaGrande();
				String cadena = "";
				int numero=pizzeria.cantidadMesasGrandes();
				cadena = String.valueOf(numero);
        textField.setText("Se compro una Mesa Grande! hay: " + cadena + " mesas grandes en el local");
			}
		});
		btnMesaGrande.setFont(new Font("Dialog", Font.BOLD, 10));
		btnMesaGrande.setBounds(139, 85, 129, 15);
		frame.getContentPane().add(btnMesaGrande);

		JButton btnMesaMediana = new JButton("Mesa Mediana");
		btnMesaMediana.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
        pizzeria.comprarMesaMediana();
				String cadena = "";
				int numero=pizzeria.cantidadMesasMedianas();
				cadena = String.valueOf(numero);
        textField.setText("Se compro una Mesa Mediana! hay: " + cadena + " mesas medianas en el local");
			}
		});
		btnMesaMediana.setFont(new Font("Dialog", Font.BOLD, 10));
		btnMesaMediana.setBounds(297, 85, 129, 15);
		frame.getContentPane().add(btnMesaMediana);

		JButton btnMesaChica = new JButton("Mesa Chica");
		btnMesaChica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
        pizzeria.comprarMesaChica();
				String cadena = "";
				int numero=pizzeria.cantidadMesasChicas();
				cadena = String.valueOf(numero);
        textField.setText("Se compro una Mesa Chica! hay: " + cadena + " mesas chicas en el local");
			}
		});
		btnMesaChica.setBounds(455, 85, 129, 15);
		frame.getContentPane().add(btnMesaChica);

		JButton btnDecoracionEspectacular = new JButton("Decoracion Espectacular");
		btnDecoracionEspectacular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
        pizzeria.comprarDecoracionEspectacular();
        textField.setText("Se compro una Decoracion espectacular!");

			}
		});
		btnDecoracionEspectacular.setFont(new Font("Dialog", Font.BOLD, 10));
		btnDecoracionEspectacular.setBounds(139, 123, 178, 15);
		frame.getContentPane().add(btnDecoracionEspectacular);

		JButton btnDecoracionBonita = new JButton("Decoracion Bonita");
		btnDecoracionBonita.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
        pizzeria.comprarDecoracionBonita();
        textField.setText("Se compro una Decoracion bonita!");
			}
		});
		btnDecoracionBonita.setFont(new Font("Dialog", Font.BOLD, 10));
		btnDecoracionBonita.setBounds(373, 123, 178, 15);
		frame.getContentPane().add(btnDecoracionBonita);

		JButton btnDecoracionRegular = new JButton("Decoracion Regular");
		btnDecoracionRegular.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
        pizzeria.comprarDecoracionRegular();
        textField.setText("Se compro una Decoracion regular!");
			}
		});
		btnDecoracionRegular.setFont(new Font("Dialog", Font.BOLD, 10));
		btnDecoracionRegular.setBounds(579, 123, 178, 15);
		frame.getContentPane().add(btnDecoracionRegular);

		JLabel lblDespedir = new JLabel("Despedir:");
		lblDespedir.setBounds(36, 193, 101, 15);
		frame.getContentPane().add(lblDespedir);

		JButton button = new JButton("Cocinero");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
        pizzeria.despedirCocinero();
        textField.setText("Se despidio un cocinero :c");
			}
		});
		button.setBounds(139, 193, 129, 15);
		frame.getContentPane().add(button);

		JButton btnMesero_1 = new JButton("Mesero");
		btnMesero_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
        pizzeria.despedirMesero();
        textField.setText("Se despidio un mesero :c");
			}
		});
		btnMesero_1.setBounds(297, 193, 129, 15);
		frame.getContentPane().add(btnMesero_1);

		JLabel lblVender = new JLabel("Vender:  ");
		lblVender.setBounds(36, 237, 101, 15);
		frame.getContentPane().add(lblVender);

		JButton button_1 = new JButton("Mesa Grande");
		button_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
        pizzeria.venderMesaGrande();
        textField.setText("Se vendio una mesa grande ");
			}
		});
		button_1.setFont(new Font("Dialog", Font.BOLD, 10));
		button_1.setBounds(139, 238, 129, 15);
		frame.getContentPane().add(button_1);

		JButton button_2 = new JButton("Mesa Mediana");
		button_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
        pizzeria.venderMesaMediana();
        textField.setText("Se vendio una mesa mediana ");
			}
		});
		button_2.setFont(new Font("Dialog", Font.BOLD, 10));
		button_2.setBounds(280, 238, 129, 15);
		frame.getContentPane().add(button_2);

		JButton button_3 = new JButton("Mesa Chica");
		button_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
        pizzeria.venderMesaChica();
        textField.setText("Se vendio una mesa chica ");
			}
		});
		button_3.setBounds(421, 237, 129, 15);
		frame.getContentPane().add(button_3);

    JButton button_4 = new JButton("Decoracion Espectacular");
		button_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
        pizzeria.venderDecoracionEspectacular();
        textField.setText("Se vendio una decoracion espectacular ");
			}
		});
		button_4.setFont(new Font("Dialog", Font.BOLD, 10));
		button_4.setBounds(60, 276, 178, 15);
		frame.getContentPane().add(button_4);

		JButton button_5 = new JButton("Decoracion Bonita");
		button_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
        pizzeria.venderDecoracionBonita();
        textField.setText("Se vendio una decoracion bonita ");
			}
		});
		button_5.setFont(new Font("Dialog", Font.BOLD, 10));
		button_5.setBounds(262, 276, 178, 15);
		frame.getContentPane().add(button_5);

		JButton button_6 = new JButton("Decoracion Regular");
		button_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
        pizzeria.venderDecoracionRegular();
        textField.setText("Se vendio una decoracion regular ");
			}
		});
		button_6.setFont(new Font("Dialog", Font.BOLD, 10));
		button_6.setBounds(455, 276, 161, 15);
		frame.getContentPane().add(button_6);

    txtDineroActual = new JTextField();
		txtDineroActual.setEditable(true);
		txtDineroActual.setBounds(139, 303, 167, 24);
		frame.getContentPane().add(txtDineroActual);
		txtDineroActual.setColumns(10);
		String cadena = "";
		double numero=pizzeria.getDineroActual();
		cadena = String.valueOf(numero);
		txtDineroActual.setText(cadena);

		JLabel lblDineroActual = new JLabel("Dinero Actual:");
		lblDineroActual.setBounds(36, 303, 101, 15);
		frame.getContentPane().add(lblDineroActual);

    JButton btnTerminarDia = new JButton("Terminar Dia");
		btnTerminarDia.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
        pizzeria.realizarDia();

			}
		});
		btnTerminarDia.setBounds(220, 339, 164, 25);
		frame.getContentPane().add(btnTerminarDia);
	}
}
