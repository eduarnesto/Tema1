package ejercicio1;

import java.util.Scanner;

public class Ejercicio1 {

	public static void main(String[] args) {
		//Declaración de variables
		int num;
		Scanner sc = new Scanner (System.in);
		
		//Instrucciones
		System.out.println("Elige un número");
		num=sc.nextInt();
		
		//Impresión
		System.out.println("Tu número es "+num);
		
		//Cerrar el escáner
		sc.close();
	}

}
