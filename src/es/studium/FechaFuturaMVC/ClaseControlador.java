package es.studium.FechaFuturaMVC;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

public class ClaseControlador implements ActionListener, WindowListener 
{
	/* Declaramos dos objetos que vamos a controlar */
	ClaseVista objVista = null; 
	ClaseModelo objModelo = null;
	public ClaseControlador(ClaseVista objVista, ClaseModelo objModelo) {
		this.objVista = objVista;
		this.objModelo = objModelo; 

		/* Añadimos los escuchadores */
		objVista.btnCalculo.addActionListener(this);
		objVista.ventana.addWindowListener(this); 
		objVista.msnError.addWindowListener(this); 
	}


	@Override
	public void windowActivated(WindowEvent arg0)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosed(WindowEvent arg0)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void windowClosing(WindowEvent arg0)
	{ 
		if(objVista.msnError.isActive())
		{
			objVista.msnError.setVisible(false);
		}
		else
		{
			System.exit(0);
		}

	}

	@Override
	public void windowDeactivated(WindowEvent arg0)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void windowDeiconified(WindowEvent arg0)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void windowIconified(WindowEvent arg0)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void windowOpened(WindowEvent arg0)
	{
		// TODO Auto-generated method stub

	}

	@Override
	public void actionPerformed(ActionEvent arg0)
	{
		objVista.txtFechaCalculada.setText("");
		objModelo.Calcular(objVista);
	}
}


