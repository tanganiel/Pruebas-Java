package com.ejercicios.app.ordenamiento;

/**
 * <p>Ejercicio java que ordena un arreglo de n&uacute;meros de manera ascendente o descendente</p>
 * 
 * @author Daniel Valdebenito
 *
 */
public class Ordenamiento {

	public static void main(String[] args) {
		int[] arreglo = {6,10,7,20,1,13};
		iterarArregloNumerico(ascendente(arreglo));
		System.out.println("**");
		iterarArregloNumerico(descendente(arreglo));
	}
	
	/**
	 * <p>Ordena un arreglo numerico de manera ascendente utilizando un metodo de ordenamiento
	 * comun y corriente</p>
	 * 
	 * @param arreglo arreglo numerico desordenado
	 * @return retorna arreglo ordenado de manera ascendenter
	 */
	public static int[] ascendente(int[] arreglo){
		for (int i = 0; i < arreglo.length; i++) {
			for (int j = 0; j < arreglo.length; j++) {
				if(arreglo[i]<arreglo[j]){
					int temp = 0;
					temp = arreglo[j];
					arreglo[j] = arreglo[i];
					arreglo[i] = temp;
				}
			}
		}
		return arreglo;
	}

	 /**
	  * <p>Ordena un arreglo numerico de manera descendente utilizando un metodo de ordenamiento
	  * comun y corriente</p>
	  * 
	  * @param arreglo arreglo numerico desordenado
	  * @return retorna arreglo ordenado de manera ascendenter
	  */
	private static int[] descendente(int[] arreglo){
		for (int i = 0; i < arreglo.length; i++) {
			for (int j = 0; j < arreglo.length; j++) {
				if(arreglo[i]>arreglo[j]){
					int temp = 0;
					temp = arreglo[j];
					arreglo[j]=arreglo[i];
					arreglo[i]=temp;
				}
			}
		}
		return arreglo;
	}
	
	/**
	 * <p>Itera e imprime un  arreglo numerico independiende de su ordenamiento</p>
	 * 
	 * @param arreglo arreglo numerico ordenado
	 */
	private static void iterarArregloNumerico(int[] arreglo){
		for (int i = 0; i < arreglo.length; i++) {
			System.out.println(arreglo[i]);
		}
	}
}
