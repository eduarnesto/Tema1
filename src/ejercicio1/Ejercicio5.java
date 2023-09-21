package ejercicio1;

import java.util.Scanner;

public class Ejercicio5 {

	public static void main(String[] args) {
		//Declaro el radio como int porque es entero
		int radio;
		
		//Declaro las dos variables como float porque pueden tener decimales
		float longitud, área;
		Scanner sc = new Scanner(System.in);
		
		//Pido el radio de la circunferencia
		System.out.println("Radio de la circunferencia:");
		radio = sc.nextInt();
		longitud = (float) (radio*Math.PI*2);
		área = (float) (Math.pow(radio, 2)*Math.PI);
		
		//Impresión
		System.out.println("La longitud de la circunferencia es de "+longitud);
		System.out.println("El área de la circunferencia es de "+área);
		
		//Cerrar el escáner
		sc.close();
	}

}
