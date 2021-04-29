package es.studium.FechaFuturaMVC;

public class ClasePrincipal
{
	public static void main(String[] args) { 
		/* Creamos dos objetos Vista y Modelo */
		ClaseVista Vista = new ClaseVista();
		ClaseModelo Modelo = new ClaseModelo();
		
		/* Instanciamos un objeto de la clase Controlador */
		new ClaseControlador(Vista, Modelo); 
	}
}
