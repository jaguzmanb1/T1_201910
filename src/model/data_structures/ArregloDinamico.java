package model.data_structures;

/**
 * 2019-01-23
 * Estructura de Datos Arreglo Dinamico de Strings.
 * El arreglo al llenarse (llegar a su maxima capacidad) debe aumentar su capacidad.
 * @author Fernando De la Rosa
 *
 */
public class ArregloDinamico implements IArregloDinamico {
	/**
	 * Capacidad maxima del arreglo
	 */
	private int tamanoMax;
	/**
	 * Numero de elementos en el arreglo (de forma compacta desde la posicion 0)
	 */
	private int tamanoAct;
	/**
	 * Arreglo de elementos de tamaNo maximo
	 */
	private String elementos[ ];

	/**
	 * Construir un arreglo con la capacidad maxima inicial.
	 * @param max Capacidad maxima inicial
	 */
	public ArregloDinamico( int max )
	{
		elementos = new String[max];
		tamanoMax = max;
		tamanoAct = 0;
	}

	public void agregar( String dato )
	{
		if ( tamanoAct == tamanoMax )
		{  // caso de arreglo lleno (aumentar tamaNo)
			tamanoMax = 2 * tamanoMax;
			String [ ] copia = elementos;
			elementos = new String[tamanoMax];
			for ( int i = 0; i < tamanoAct; i++)
			{
				elementos[i] = copia[i];
			} 
			System.out.println("Arreglo lleno: " + tamanoAct + " - Arreglo duplicado: " + tamanoMax);
		}	
		elementos[tamanoAct] = dato;
		tamanoAct++;
	}

	public int darTamano() {
		// TODO implementar
		return tamanoAct;
	}

	public String darElemento(int i) {
		// TODO implementar
		return elementos[i];
	}

	public String buscar(String dato) {
		// TODO implementar
		String respuesta = null;
		for ( int i = 0; i < tamanoAct; i++ ){
			if ( elementos[i].compareTo(dato) == 0){
				respuesta = elementos[i];
			}
		} 
		// Recomendacion: Usar el criterio de comparacion natural (metodo compareTo()) definido en Strings.
		return respuesta;
	}

	public String eliminar(String dato) {
		// TODO implementar
		// Recomendacion: Usar el criterio de comparacion natural (metodo compareTo()) definido en Strings.
		String [ ] copia = elementos;
		int i = 0;
		int indice = 0;
		int j = 0;
		boolean elimino = false;
		elementos = new String[tamanoMax];
		while (i != tamanoAct)
		{
			if (copia[i].compareTo(dato) != 0){
				elementos[j] = copia[i];
				j++;
			}
			else{
				elimino = true;
				indice = i;
			}
			i++;
			
		} 
		if (elimino){
			tamanoAct--;
		}

		return String.valueOf(indice);
	}
}
