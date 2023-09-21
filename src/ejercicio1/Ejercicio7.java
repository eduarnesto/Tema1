package ejercicio1;

import java.util.Scanner;

public class Ejercicio7 {

	public static void main(String[] args) {
		//Declaro las dos variables como String porque pueden ser dos palabras separadas con espacio
		String nombre, calle;
		
		//Declaro la variable como int porque es un número entero
		int teléfono;
		Scanner sc = new Scanner(System.in);
		
		//Instrucciones
		System.out.println("¿Cómo te llamas?");
		nombre = sc.nextLine();
		System.out.println("¿Cuál es tu dirección?");
		calle = sc.nextLine();
		System.out.println("¿Cuál es tu número de teléfono?");
		teléfono = sc.nextInt();
		
		//Impresión
		System.out.println("Nombre: "+nombre);
		System.out.println("Dirección: "+calle);
		System.out.println("Teléfono: "+teléfono);
		
		//Cerrar el escáner
		sc.close();

	}

}
