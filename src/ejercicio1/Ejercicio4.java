package ejercicio1;

import java.util.Scanner;

public class Ejercicio4 {

	public static void main(String[] args) {
		//Declaro las dos variables de notas como int porque son números enteros
		int nota1, nota2;
		
		//Declaro la media como float porque puede tener decimales
		float media;
		
		Scanner sc = new Scanner (System.in);
		
		//Pido las notas al usuario
		System.out.println("Escribe las dos notas");
		nota1=sc.nextInt();
		nota2=sc.nextInt();
		media= (float) (nota1+nota2)/2;
		
		//Impresión
		System.out.println("Tienes "+media+" de media");
		
		//Cierro el escáner
		sc.close();
	}

}
