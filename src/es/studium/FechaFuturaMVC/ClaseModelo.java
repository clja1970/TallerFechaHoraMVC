package es.studium.FechaFuturaMVC;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.Period;
import java.time.format.DateTimeFormatter;

public class ClaseModelo
{
	public void Calcular(ClaseVista objVista)
	{
		String fechaFutura;



		fechaFutura=objVista.txtFecha.getText();
		if (!validarFecha(fechaFutura))
		{
			objVista.msnError.setVisible(true);	
		}
		else
		{
			DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy");
			LocalDate fechaFut = LocalDate.parse(fechaFutura, fmt);
			LocalDate esteInstante = LocalDate.now();
			Period periodo = Period.between(esteInstante,fechaFut);
			objVista.txtFechaCalculada.setText(String.format(" Quedan: %s días, %s meses, %s años"+"\npara el: "+fechaFutura,
					periodo.getDays(),periodo.getMonths(),periodo.getYears()));
		}
	}

	// Mostrar días entre dos fechas dadas comprobando que fecha 1 < fecha 2
	// Si no, mostrar error

	public boolean validarFecha(String fecha)
	{
		try
		{
			SimpleDateFormat formatoFecha = new SimpleDateFormat("dd/MM/yyyy");
			formatoFecha.setLenient(false);
			formatoFecha.parse(fecha);
		}
		catch (ParseException e)
		{
			return false;
		}
		return true;
	}



}
