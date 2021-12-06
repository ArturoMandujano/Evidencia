
package hospital;

import java.util.InputMismatchException;
import java.util.Scanner;



public class Testclinica {
    static GestorPacientes pacientes = new GestorPacientes();
	static Medico Doctor = new Medico();
	static Hospital Cita = new Hospital();

	public static void main(String[] args) {

		Scanner sn = new Scanner(System.in);
		boolean salir = false;
		int opcion; //Guardaremos la opcion del usuario
		int opc;

		while (!salir) {
			try {

				System.out.println("Digite contraseña");
				opc = sn.nextInt();

				switch (opc) {
					case 12345678:


		while (!salir) {

			System.out.println("Menú de opciones");
			System.out.println("1. Dar de alta doctores");
			System.out.println("2. Dar de alta pacientes");
			System.out.println("3. Crear una cita con fecha y hora");
			System.out.println("4. Relacionar una cita con un doctor y un paciente");
			System.out.println("5. Salir");

			try {

				System.out.println("Escribe una de las opciones");
				opcion = sn.nextInt();

				switch (opcion) {
					case 1:
						System.out.println("Has seleccionado dar de alta doctores");
						pacientes.nuevoPaciente();
						pacientes.mostrarPacientes();

						break;
					case 2:
						System.out.println("Has seleccionado dar de alta pacientes");
						Doctor.nuevoMedico();
						Doctor.mostrardoctores();

						break;
					case 3:
						System.out.println("Crear una cita con fecha y hora");
						Cita.nuevaCita();
						break;
					case 4:
						System.out.println("Relacionar una cita con un doctor y un paciente");
						Cita.nuevoHospital();
						break;
					case 5:
						salir = true;
						break;
					default:
						System.out.println("Solo números entre 1 y 5");
				}
			} catch (InputMismatchException e) {
				System.out.println("Debes insertar un número");
				sn.next();
			}
		}

		break;
			default:
				System.out.println("Contraseña incorrecta");
				break;
				}

			}catch (InputMismatchException e) {
				System.out.println("Debes insertar un número");
				sn.next();

	}
}

}

}
