package ejercicio1;

import java.util.Scanner;

public class Ejercicio8 {
	
	public static void main(String[] args) {
		//Declaración de variables
		String nombre;
		int edad;
		Scanner sc = new Scanner(System.in);
		
		//Instrucciones
		System.out.println("¿Cuál es tu nombre y edad?");
		nombre = sc.nextLine();
		edad = sc.nextInt();
		
		//Impresión
		System.out.println("Hola " + nombre+", tienes " + edad + " años, ¡qué mayor eres!");
		
		//Cerrar el escáner
		sc.close();
	}
	
}
