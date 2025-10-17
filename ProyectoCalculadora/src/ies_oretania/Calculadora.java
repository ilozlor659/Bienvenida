package ies_oretania;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num1;
		int num2;
		
		System.out.println("Introduce un número: ");
		num1 = sc.nextInt();
		System.out.println("Introduce un número: ");
		num2 = sc.nextInt();
		
		//suma
		int suma;
		suma = num1 + num2;
		
		System.out.println("La suma de los dos números es: " + suma);
		
		//resta
		int resta;
		resta = num1 - num2;
		
		System.out.println("La resta de los dos números es: " + resta);
		
		//multiplicación
		int multiplicacion;
		multiplicacion = num1 * num2;
		
		System.out.println("La multiplicación de los dos números es: " + multiplicacion);
		
		//división
		int division;
		division = num1 / num2;
		
		System.out.println("La división de los números es: " + division);
		
	

	}

}
