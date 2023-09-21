package ejercicio1;

import java.util.Scanner;

public class Ejercicio6 {

	public static void main(String[] args) {
		//Declaro las variables como int porque son enteros
		int num1, num2;
		
		//Declaro las variables como float porque pueden tener decimales
		float suma, resta, multi, división;
		
		Scanner sc = new Scanner (System.in);
		
		//Pido dos números
		System.out.println("Escribe dos números");
		num1=sc.nextInt();
		num2=sc.nextInt();
		
		//Realizo las operaciones
		suma=(float) num1+num2;
		resta=(float) num1-num2;
		multi=(float) num1*num2;
		división=(float) num1/num2;
		
		//Impresión
		System.out.println("La suma de los dos números da "+suma);
		System.out.println("La resta de los dos números da "+resta);
		System.out.println("La multilicación de los dos números da "+multi);
		System.out.println("La división de los dos números da "+división);
		
		//Cerrar el escáner
		sc.close();
	}

}
