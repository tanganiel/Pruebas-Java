package com.ejercicios.app.herencia;

public class App {
	
	/**
	 * Esta es una clase que ejecuta la herencia de clases
	 * 
	 * @param args
	 */
	public static void main(String[] args) {
		Alumno alumno = new Alumno();
		alumno.setNombre("Daniel");
		alumno.setCurso("Ingeniero");
		System.out.println(alumno.getNombre());
		System.out.println(alumno.getCurso());
	}

}
