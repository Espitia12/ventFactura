package ventFactura;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class ventana extends JFrame implements ActionListener{
	
	JPanel miPanel;
	JLabel miTitulo;
	JLabel txtNombre;
	JLabel txtMateria;
	JLabel costTratamiento;
	JLabel numDias;
	JLabel costMedicamentos;
	JLabel miresultado;
	JButton micalcular;
	JButton milimpiar;
	JTextField miCampoDeNombre;
	JTextField miCampoDeTratamiento;
	JTextField miCampoDeDias;
	JTextField miCampoDeMedicamentos;
	
	procesos misprocesos;
	
	public ventana() {
		inicirComponetes();
		setSize(700, 400);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Espitia hermoso");
		setLocationRelativeTo(null);
		
		
	}
	public void inicirComponetes() {
		miPanel = new JPanel();
		miPanel.setLayout(null);
		miPanel.setBackground(Color.orange);
		add(miPanel);
		
		
		miTitulo = new JLabel();
		miTitulo.setText("FACTURA");
		miTitulo.setBounds(250, 30, 200, 30  );
		
		txtNombre = new JLabel();
		txtNombre.setText("Nombre");
		txtNombre.setBounds(55, 75, 100, 40  );
		

		
		costTratamiento = new JLabel();
		costTratamiento.setText("Costo de Tratamiento:");
		costTratamiento.setBounds(55, 130, 200, 40  );
		
		numDias = new JLabel();
		numDias.setText("numero de dias:");
		numDias.setBounds(255, 130, 200, 40  );
		
		costMedicamentos = new JLabel();
		costMedicamentos.setText("costo de medicamentos:");
		costMedicamentos.setBounds(420, 130, 200, 40  );
		
		miCampoDeNombre = new JTextField();
		miCampoDeNombre.setBounds(110, 80, 150, 30);
		
		miCampoDeTratamiento = new JTextField();
		miCampoDeTratamiento.setBounds(185, 135, 50, 30);
		
		miCampoDeDias = new JTextField();
		miCampoDeDias.setBounds(350, 135, 50, 30);
		
		miCampoDeMedicamentos = new JTextField();
		miCampoDeMedicamentos.setBounds(565, 135, 50, 30);
		
		miresultado = new JLabel();
		miresultado.setText("Resultado:");
		miresultado.setBounds(55, 200, 500, 40  );
		
		micalcular = new JButton();
		micalcular.setText("Calcular");
		micalcular.setBounds(155, 255, 150, 30  );  
		micalcular.addActionListener(this);
		
		milimpiar = new JButton();
		milimpiar.setText("limpiar");
		milimpiar.setBounds(350, 255, 150, 30  );  
		milimpiar.addActionListener(this);
		
		miPanel.add(miTitulo);
		miPanel.add(txtNombre);
		miPanel.add(miCampoDeNombre);
		miPanel.add(costTratamiento);
		miPanel.add(miCampoDeTratamiento);
		miPanel.add(numDias);
		miPanel.add(miCampoDeDias);
		miPanel.add(costMedicamentos);
		miPanel.add(miCampoDeMedicamentos);
		miPanel.add(miresultado);
		miPanel.add(micalcular);
		miPanel.add(milimpiar);
	}
	
	public void calcular() {
		
		double tratamiento = Double.parseDouble(miCampoDeTratamiento.getText()); 
		int dias = Integer.parseInt(miCampoDeDias.getText());
		double medicamentos = Double.parseDouble(miCampoDeMedicamentos.getText());
		
		misprocesos = new procesos();
		
		
	double resultado = misprocesos.calcularFactura(tratamiento, dias, medicamentos);
		
			miresultado.setText("Resultado: Hola "+miCampoDeNombre.getText()+" el valor total por concepto de hospitalización es: "+resultado);
			miresultado.setForeground(Color.BLUE);
			

		
		
		
	}

	public void actionPerformed(ActionEvent e) {
		if (e.getSource()==micalcular) {
			calcular();
			
			
		}else if (e.getSource()==milimpiar) {
			
			miCampoDeNombre.setText("");
			miCampoDeDias.setText("");
			miCampoDeMedicamentos.setText("");
			miCampoDeTratamiento.setText("");
			
			
			
		}
		
	}
   
}