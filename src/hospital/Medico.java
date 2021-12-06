package hospital;

import java.util.ArrayList;
import java.util.Scanner;


	public class Medico {
		private final ArrayList<Doctor> doctores;
		private final Scanner teclado;

		public Medico() {
			doctores = new ArrayList<>();
			teclado = new Scanner(System.in);
		}


		public boolean nuevoMedico() {
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
			Doctor nuevoDoctor = new Doctor(id, nombre, apellidos, edad, genero);
			return doctores.add(nuevoDoctor);//Devuelve TRUE si se insertó correctamente, FALSE si no se pudo insertar
		}

		public void mostrardoctores() {doctores.forEach(Doctor::mostrarMedicos);
		}


	}
