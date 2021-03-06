package es.studium.FechaFuturaMVC;

import java.awt.Color;
import java.awt.Dialog;
import java.awt.FlowLayout;
import java.awt.Frame;
import java.awt.Label;
import java.awt.TextArea;
import java.awt.TextField;

import javax.swing.JButton;

public class ClaseVista
{
	Frame ventana = new Frame();
	Label lblFechaFutura = new Label(" Dame una fecha futura dd/mm/aa");
	TextField txtFecha = new TextField(11);
	JButton btnCalculo = new JButton("Calculo");
	TextArea txtFechaCalculada= new TextArea (2,28);
	Label lblCalculada =new Label ("Fecha Calculada");
	Dialog msnError = new Dialog (ventana,"Error en fecha", true);

	public ClaseVista()
	{
		ventana.setLayout(new FlowLayout());
		ventana.setBackground(Color.getHSBColor(73,310,17));
		ventana.add(lblFechaFutura);
		ventana.add(txtFecha);
		ventana.add(btnCalculo);
		ventana.add(txtFechaCalculada);
		ventana.add(lblCalculada);
		ventana.setSize(255,190);
		ventana.setResizable(true);
		ventana.setLocationRelativeTo(null);
		ventana.setVisible(true);
		
		
		
		msnError.setLayout(new FlowLayout());
		Label lblError = new Label("Formato incorrecto");
		
		msnError.add(lblError);
		msnError.setSize(170,100);
		msnError.setResizable(false);
		msnError.setLocationRelativeTo(null);
		
	}
}