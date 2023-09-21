package ejercicio1;

import java.util.Scanner;

public class Ejercicio9 {

	public static void main(String[] args) {
		//Declaración de variables
		double pesetas, euros;
		Scanner sc = new Scanner(System.in);
		
		//Instrucciones
		System.out.println("Introduce el número de pesetas");
		pesetas = sc.nextInt();
		euros = pesetas/166;
		
		//Impresión
		System.out.println("El equivalente en euros sería " + euros + "€");

		//Cerrar el escáner
		sc.close();
	}

}
