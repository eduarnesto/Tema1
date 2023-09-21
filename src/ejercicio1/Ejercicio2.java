package ejercicio1;

import java.util.Scanner;

public class Ejercicio2 {

	public static void main(String[] args) {
		//Declaración de variables
		int edad;
		Scanner sc = new Scanner (System.in);
		
		//Instrucciones
		System.out.println("¿Cuántos años tienes?");
		edad=sc.nextInt();
		edad++;
		
		//Impresión
		System.out.println("Tienes "+edad+" años");
		
		//Cerrar el escáner
		sc.close();

	}

}
