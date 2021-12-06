package hospital;

import java.util.ArrayList;
import java.util.Scanner;


public class Hospital {
	private final ArrayList<Cita> citas;
	private final Scanner teclado;

	public Hospital() {
		citas = new ArrayList<>();
		teclado = new Scanner(System.in);
	}


	public boolean nuevoHospital() {
		System.out.println("\n\tALTA NUEVO PACIENTE");
		System.out.print("Introduzca Identificador: ");
		String id = teclado.nextLine();
		System.out.print("Nombre: ");
		String nombre = teclado.nextLine();
		System.out.print("Apellidos: ");
		String apellidos = teclado.nextLine();
		System.out.print("Genero: ");
		String genero = teclado.nextLine();
		System.out.print("Edad: ");
		int edad = teclado.nextInt();
		teclado.nextLine();//Tras leer un int, conviene "limpiar" el stream de entrada, para evitar problemas al querer leer luego datos String
		Cita nuevaCita = new Cita(id, nombre, apellidos, edad, genero);
		return citas.add(nuevaCita());//Devuelve TRUE si se insertó correctamente, FALSE si no se pudo insertar
	}



	public Cita nuevaCita() {citas.forEach(Cita::nuevaCita);
		return null;
	}


}
