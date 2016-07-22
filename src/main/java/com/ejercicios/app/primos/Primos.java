package com.ejercicios.app.primos;

/**
 * <p>Clase que calcula los n&uacute;meros primos que hay en el rango de 1 hasta el l&iacute;mite establecido</p>
 * 
 * @author Daniel Valdebenito
 */
public class Primos {
	
	public static void main(String[] args) {
		int limite = 20;
		for (int i = 1; i < limite; i++) {
			if (esPrimo(i)) {
				System.out.println(i);
			}
		}
	}

	/**
	 * <p>Verifica si un n&uacute;mero es o no primo</p>
	 * 
	 * @param numero corresponde al n&uacute;mero a evaluar
	 * @return verdadero o falso seg&uacute;n sea o no primo
	 */
	public static boolean esPrimo(int numero) {
		int contador = 2;
		boolean primo = true;
		while ((primo) && (contador != numero)) {
			if (numero % contador == 0)
				primo = false;
			contador++;
		}
		return primo;
	}
}
