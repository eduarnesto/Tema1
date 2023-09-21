package ejercicio1;

import java.util.Scanner;

public class Ejercicio3 {

	public static void main(String[] args) {
		//Declaración de variables
		int nacimiento, añoActual, edad;
		Scanner sc = new Scanner (System.in);
		
		//Instrucciones
		System.out.println("¿En qué año naciste?");
		nacimiento=sc.nextInt();
		System.out.println("¿En qué año estamos?");
		añoActual=sc.nextInt();
		edad=añoActual-nacimiento;
		
		//Impresión
		System.out.println("Tienes "+edad+" años");
		
		//Cerrar el escáner
		sc.close();
	}

}
