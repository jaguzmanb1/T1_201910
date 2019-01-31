package controller;

import model.data_structures.ArregloDinamico;
import model.data_structures.IArregloDinamico;

public class Controller {

	/* Instancia del Modelo del mundo */
	private static IArregloDinamico <Integer> modelo = new ArregloDinamico<Integer> (7);
	
	/**
	 * Requerimiento crear Arreglo Dinamico
	 * @param capacidad tamaNo inicial del arreglo
	 */
	public static void crearModelo(int capacidad)
	{
		modelo = new ArregloDinamico(capacidad);
	}
	
	/**
	 * Requerimiento agregar elemento
	 * @param dato Dato a agregar al final del arreglo
	 */
	public static void agregar(Integer dato)
	{
		modelo.agregar(dato);
	}
	
	/**
	 * Requerimiento buscar dato
	 * @param dato Dato a buscar
	 * @return dato encontrado
	 */
	public static Integer buscar(Integer dato)
	{
		return modelo.buscar(dato);
	}
	
	/**
	 * Requerimiento eliminar dato
	 * @param dato Dato a eliminar
	 * @return dato eliminado
	 */
	public static Integer eliminar(Integer dato)
	{
		return modelo.eliminar(dato);
	}
	
	
	/**
	 * Servicio de consulta de numero de elementos presentes en el arreglo 
	 * @return numero de elementos presentes en el arreglo
	 */	
	public static int darTamano()
	{
		return modelo.darTamano();
	}
	
}
