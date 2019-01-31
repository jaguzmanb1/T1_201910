package model.data_structures;

/**
 * 2019-01-23
 * Estructura de Datos Arreglo Dinamico de Strings.
 * El arreglo al llenarse (llegar a su maxima capacidad) debe aumentar su capacidad.
 * @author Fernando De la Rosa
 *
 */
public class ArregloDinamico<T> implements IArregloDinamico<T> {
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
	private T elementos[ ];

	/**
	 * Construir un arreglo con la capacidad maxima inicial.
	 * @param max Capacidad maxima inicial
	 */
	@SuppressWarnings("unchecked")
	public ArregloDinamico( int max )
	{
		elementos = (T[]) new Comparable[max];
		tamanoMax = max;
		tamanoAct = 0;
	}

	@SuppressWarnings("unchecked")
	public void agregar( T dato )
	{
		if ( tamanoAct == tamanoMax )
		{  // caso de arreglo lleno (aumentar tamaNo)
			tamanoMax = 2 * tamanoMax;
			T [ ] copia = elementos;
			elementos = (T[]) new Comparable[tamanoMax];
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

	public T darElemento(int i) {
		// TODO implementar
		return elementos[i];
	}

	public T buscar(T dato) {
		// TODO implementar
		T respuesta = null;
		for ( int i = 0; i < tamanoAct; i++ ){
			if ( elementos[i].equals(dato)){
				respuesta = elementos[i];
			}
		} 
		// Recomendacion: Usar el criterio de comparacion natural (metodo compareTo()) definido en Strings.
		return respuesta;
	}

	@SuppressWarnings("unchecked")
	public T eliminar(T dato) {
		// TODO implementar
		// Recomendacion: Usar el criterio de comparacion natural (metodo compareTo()) definido en Strings.
		T [ ] copia = elementos;
		int i = 0;
		int j = 0;
		T elemento = null;
		boolean elimino = false;
		elementos = (T[]) new Comparable[tamanoMax];
		while (i != tamanoAct)
		{
			if (copia[i].equals(dato)){
				elementos[j] = copia[i];
				j++;
			}
			else{
				elimino = true;
				elemento = copia[i];
			}
			i++;
			
		} 
		if (elimino){
			tamanoAct--;
		}

		return elemento;
	}

	@Override
	public int compareTo(T o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
