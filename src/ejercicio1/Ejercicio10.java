package ejercicio1;

import java.util.Scanner;

public class Ejercicio10 {

	public static void main(String[] args) {
		//Declaración de variables
		double IVA, precio;
		Scanner sc = new Scanner(System.in);
		
		//Instrucciones
		System.out.println("Introduzca el precio del producto sin IVA:");
		precio = sc.nextDouble();
		IVA=precio*21/100;
		precio=precio+IVA;
		
		//Impresión
		System.out.println("El precio final del producto es: " + precio);
		
		//Cerrar el escáner
		sc.close();

	}

}
